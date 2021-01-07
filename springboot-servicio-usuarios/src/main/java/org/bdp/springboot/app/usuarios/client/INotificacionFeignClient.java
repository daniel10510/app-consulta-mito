package org.bdp.springboot.app.usuarios.client;

import org.bdp.springboot.app.usuarios.model.MsgOpe;
import org.bdp.springboot.app.usuarios.model.ParamsMailCodVerif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name ="servicio-notificaciones")
public interface INotificacionFeignClient {
	
	@PostMapping("/notificacion/mail/cod-verif")
	public MsgOpe enviarEmailCodVerif(@RequestBody ParamsMailCodVerif paramsMailCodVerif);
	
}