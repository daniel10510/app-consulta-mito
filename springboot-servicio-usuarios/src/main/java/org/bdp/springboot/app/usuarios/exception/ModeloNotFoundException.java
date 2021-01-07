package org.bdp.springboot.app.usuarios.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModeloNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7591008702483385406L;

	public ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}

}
