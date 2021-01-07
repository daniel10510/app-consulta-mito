package org.bdp.springboot.app.usuarios.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.bdp.springboot.app.usuarios.model.MsgOpe;
import org.bdp.springboot.app.usuarios.model.ReqValCliente;
import org.bdp.springboot.app.usuarios.model.ReqValDispUsu;
import org.bdp.springboot.app.usuarios.model.Usuario;
import org.bdp.springboot.app.usuarios.service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private static Logger log = LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@GetMapping("/health-status")
	public String status() {
		return "usuarios OK!";
	}

	@PostMapping(value = "/valDispUsuario", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	@ResponseStatus(HttpStatus.OK)
	public MsgOpe valDispUsuario( @RequestBody @Valid ReqValDispUsu reqValDispUsu){
		log.info("[valDispUsuario] ----- INICIO -------");
		log.info("reqValDispUsu: " + reqValDispUsu.toString());
		return iUsuarioService.valDispUsuario(reqValDispUsu);
	}
	
	@PostMapping(value = "/regCliente", produces = "application/json", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public MsgOpe regCliente( @RequestBody @Valid Usuario usuario ){
		log.info("[validaInformacion] ----- INICIO -------");
		log.info("reqRegCliente: " + usuario.toString());
		return iUsuarioService.save( usuario );
	}
	
	@PutMapping(value = "/valRegCliente", produces = "application/json", consumes = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public MsgOpe valRegCliente( @RequestBody @Valid ReqValCliente reqValCliente) throws IOException{
		log.info("[valRegCliente] ----- INICIO -------");
		log.info("reqValCliente: " + reqValCliente.toString());		
		return iUsuarioService.valRegCliente( reqValCliente );
	}
}

