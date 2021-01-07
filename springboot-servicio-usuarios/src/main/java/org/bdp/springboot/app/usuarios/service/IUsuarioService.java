package org.bdp.springboot.app.usuarios.service;

import org.bdp.springboot.app.usuarios.model.MsgOpe;
import org.bdp.springboot.app.usuarios.model.ReqValCliente;
import org.bdp.springboot.app.usuarios.model.ReqValDispUsu;
import org.bdp.springboot.app.usuarios.model.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario findById(Long id);
	public MsgOpe save(Usuario usuario);
	public void deleteById(Long id);
	public MsgOpe valDispUsuario(ReqValDispUsu reqValDispUsu);
	public MsgOpe valRegCliente(ReqValCliente reqValCliente);
}

