INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (1,'Cédula')
INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (2,'Tarjeta identidad')

INSERT INTO tipomovimiento (idTipoMovimiento, nombreMovimiento) values (1,'Entrada')
INSERT INTO tipomovimiento (idTipoMovimiento, nombreMovimiento) values (2,'Salida')

INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (1,'kevin','$2a$10$1SWt0Qzhypl5GN/ibY0TFe.dNYOUM0wBlE7ZVYRidYc7vlfe6.3wC', true)
INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (2,'manuel','$2a$10$fDcXTQ.4ver43nqfveSyv.m6Cys2qJOZ4wt8hec8BMNg3NZdGbz0a', true)

INSERT INTO roles (id_rol,nombre_rol) values (1,'ROLE_ADMIN')
INSERT INTO roles (id_rol,nombre_rol) values (2,'ROLE_CONSULTA')

INSERT INTO users_authorities (id_usuario, id_rol ) values (1,1)
INSERT INTO users_authorities (id_usuario, id_rol ) values (2,2)


