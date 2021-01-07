INSERT INTO usuarios (username, password, imei, mac_address, d_cod_tipo_plataforma, d_cod_estado_registro, nombres, primer_apellido, segundo_apellido, d_cod_genero, d_cod_estado_civil, d_cod_tipo_documento, num_documento, com_documento, ext_documento, correo_electronico, celular, direccion, coordenada_x, coordenada_y, fec_registro, fec_ult_ini_sesion, fec_ult_int_ini_sesion, num_int_sesion, enabled) VALUES ('andres','$2a$10$ykhXmCAam5FUEF9GN.4Z8OwwWJidvMii6VFYe77cmS2X6oF6p4W86', 'imei1', 'mac_address1', 'MOB', 'ACT', 'Juan', 'Perez', 'Lima', 'M', 'C', 'CI', '12345678', '', 'LP', 'daniel.10510@gmail.com', '44546562', 'direccion', 'coordenada_x', 'coordenada_y', '2011-12-18 13:17:17', '2011-12-18 13:17:17', '2011-12-18 13:17:17', '1', true);
INSERT INTO usuarios (username, password, imei, mac_address, d_cod_tipo_plataforma, d_cod_estado_registro, nombres, primer_apellido, segundo_apellido, d_cod_genero, d_cod_estado_civil, d_cod_tipo_documento, num_documento, com_documento, ext_documento, correo_electronico, celular, direccion, coordenada_x, coordenada_y, fec_registro, fec_ult_ini_sesion, fec_ult_int_ini_sesion, num_int_sesion, enabled) VALUES ('admin','$2a$10$ykhXmCAam5FUEF9GN.4Z8OwwWJidvMii6VFYe77cmS2X6oF6p4W86', 'imei2', 'mac_address2', 'MOB', 'ACT', 'Pepe', 'Calvo', 'Klark', 'M', 'C', 'CI', '87745655', '', 'LP', 'pepe.10510@gmail.com', '85461565', 'direccion2', 'coordenada_x', 'coordenada_y', '2011-12-18 13:17:17', '2011-12-18 13:17:17', '2011-12-18 13:17:17', '1', true);


INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);