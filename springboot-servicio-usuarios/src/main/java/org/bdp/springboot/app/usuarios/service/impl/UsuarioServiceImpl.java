package org.bdp.springboot.app.usuarios.service.impl;

//import org.bdp.springboot.app.usuarios.client.INotificacionFeignClient;
import org.bdp.springboot.app.usuarios.dao.IOTPDao;
import org.bdp.springboot.app.usuarios.dao.IUsuarioDao;
import org.bdp.springboot.app.usuarios.model.MsgOpe;
import org.bdp.springboot.app.usuarios.model.OTP;
import org.bdp.springboot.app.usuarios.model.ReqValCliente;
import org.bdp.springboot.app.usuarios.model.ReqValDispUsu;
import org.bdp.springboot.app.usuarios.model.Usuario;
import org.bdp.springboot.app.usuarios.service.IUsuarioService;
import org.bdp.springboot.app.usuarios.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;

import javax.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	private static Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private IUsuarioDao iUsuarioDao;

	@Autowired
	private IOTPDao iOtpDao;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	//@Autowired
	//private INotificacionFeignClient iNotificacionFeignClient;

	@Override
	@Transactional
	public MsgOpe save(Usuario usuario) {
		// TODO Auto-generated method stub
		log.info("ServiceImpl - save");
		if (iUsuarioDao.countByUsername(usuario.getUsername()) == 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
            		String.format("El nombre de usuario %s no esta disponible!", usuario.getUsername()));
        }

		//ParamsMailCodVerif paramsMailCodVerif = new ParamsMailCodVerif();
		String passEncode = bcrypt.encode(usuario.getPassword());
		usuario.setFecReg(new Timestamp(System.currentTimeMillis()));
		usuario.setEnabled(false);
		usuario.setPassword(passEncode);
		Usuario usuarioSave = iUsuarioDao.save(usuario);
		
		OTP otp = new OTP();
		String codVerif = Util.randomCodVerif();
		otp.setUsuId(usuarioSave.getId());
		otp.setTipCodVerif("VRC");
		otp.setCodVerif(codVerif);
		otp.setFecRegistro(new Timestamp(System.currentTimeMillis()));
		otp.setDisponible(true);
		iOtpDao.save(otp);
			
		/*
		paramsMailCodVerif.setToMail(usuario.getEmail());
		paramsMailCodVerif.setFromEmail("bancadigital@bdp.com.bo");
		paramsMailCodVerif.setSubjectEmail("Codigo de verificación");
		paramsMailCodVerif.setCodVerif(codVerif);
		
		msgOpe = iNotificacionFeignClient.enviarEmailCodVerif(paramsMailCodVerif);
		*/
		
		return new MsgOpe("000","Se le ha enviado un código de verificación a su correo electrónico. Revise también su carpeta de correo no deseado, por si no recibió el correo en la bandeja de entrada");
	} 
	
	@Override
	public void deleteById(Long id) {
	}

	@Override
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		//return iUsuarioDao.findByUsername(username);
		return null;
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MsgOpe valDispUsuario(ReqValDispUsu reqValDispUsu) {
		// TODO Auto-generated method stub
		if (iUsuarioDao.countByUsername(reqValDispUsu.getUsuario()) == 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
            		String.format("El nombre de usuario %s no esta disponible!", reqValDispUsu.getUsuario()));
        }
		
		return new MsgOpe("000","");
	}

	@Override
	public MsgOpe valRegCliente(ReqValCliente reqValCliente) {
		log.info("ServiceImpl - valRegCliente");
		if (iUsuarioDao.countByUsername(reqValCliente.getUsuario()) != 1) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
            		String.format("El nombre de usuario: %s , no es válido!", reqValCliente.getUsuario()));
        }

		Usuario u = iUsuarioDao.findByUsername(reqValCliente.getUsuario());
		u.setEnabled(true);
		
		return new MsgOpe("000","Bienvenid@ a la App FIREDIN\n" + 
								"Registro de usuario satisfactorio.\n" + 
								"");
	}

}