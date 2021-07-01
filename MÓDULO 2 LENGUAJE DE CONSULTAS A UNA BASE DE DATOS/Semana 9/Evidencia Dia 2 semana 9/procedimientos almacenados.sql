-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: comparadorproducto
-- ------------------------------------------------------
-- Server version	8.0.25


DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarProducto`(in_nombre varchar(100))
BEGIN
	select pt.codigo, pt.nombre, pt.marca, pt.descripcion, pt.imagen, pt.estado, tp.nombre as nombreTipoProducto  from producto pt
    inner join tipoproducto tp
    on pt.id_tipoProducto = tp.codigo
    where nombre=in_nombre;
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarProductoDetalle`(in_id_producto int)
BEGIN
	select  pt.nombre, pt.marca, tp.nombre, pd.precio, pt.imagen, 
    ft.nombre, pd.link
    from productodetalle pd
    inner join producto pt
    on pd.id_producto = pt.codigo
    inner join fuente ft
    on pd.id_fuente = ft.id
    inner join tipoproducto tp
    on pt.id_tipoProducto = tp.codigo
    where pd.id_producto = in_id_producto
    order by precio asc;
END ;;


CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarProductoDetalleFuente`(in_nombreFuente varchar(100))
BEGIN
	select  pt.nombre, pt.marca, tp.nombre, pd.precio, pt.imagen, 
    ft.nombre, pd.link
    from productodetalle pd
    inner join producto pt
    on pd.id_producto = pt.codigo
    inner join fuente ft
    on pd.id_fuente = ft.id
    inner join tipoproducto tp
    on pt.id_tipoProducto = tp.codigo
    where ft.nombre = in_nombreFuente;
END ;;

DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_cantidadUsuariosRegistrados`()
BEGIN
	select count(*) from usuario where;
DELIMITER ;


DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarProductoMarca`(in_marca varchar(100))
BEGIN
	select * from producto where marca=in_marca;
END ;;
DELIMITER ;

DELIMITER ;;

DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_cantidadProducto`(in_id_producto int)
BEGIN
	select count(*) from productodetalle where id_producto= in_id_producto;
DELIMITER ;


DELIMITER ;;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarUsuario`(in_email varchar(100))
BEGIN
	select * from usuario where email=in_email;
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarFuente`(in_nombre varchar(100), in_link varchar(200))
BEGIN
	insert into fuente (nombre, link) values (in_nombre, in_link);
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarProducto`(in_id_tipoProducto int, in_nombre varchar(100), in_marca varchar(100), in_descripcion varchar(300))
BEGIN
	insert into producto (id_tipoProducto, nombre, marca, descripcion) values (in_id_tipoProducto, in_nombre, in_marca, in_descripcion);
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarProductoDetalle`(in_id_producto int, in_link varchar(200), in_precio int, in_id_fuente int)
BEGIN
	insert into productodetalle (id_producto, link, precio, id_fuente) values (in_id_producto, in_link, in_precio, in_id_fuente);
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarTipoProducto`(in_nombre varchar(100))
BEGIN
	insert into tipoproducto (nombre) values (in_nombre);
END ;;
DELIMITER ;

DELIMITER ;;

	CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarUsuario`(in_nombre varchar(100), in_apellido varchar(100), 
		in_rut varchar(11), in_email varchar(100), in_clave varchar(50) )

BEGIN
	insert into usuario (nombre, apellido, rut, email, clave) values (in_nombre, in_apellido, in_rut, in_email, in_clave);
END ;;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarUsuarioProducto`(in_id_usuario int, in_id_producto int)
BEGIN
	insert into usuarioproducto (id_usuario, id_producto) values (in_id_usuario, in_id_producto );
END ;;
DELIMITER ;

DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ingresarUsuarioProductoHistorico`(in_id_usuario int, in_id_productoDetalle int, in_precio int )
BEGIN
	insert into usuarioproductohistorico (id_usuario, id_productoDetalle, precio) values (in_id_usuario, in_id_productoDetalle, in_precio);
END ;;
DELIMITER ;


CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarTodosUsuarios`()
BEGIN
	select nombre, apellido, rut, email from usuario;
END ;;

DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarUsuario`(in_email varchar (100))
BEGIN
	select * from usuario where email=in_email;
END ;;
DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarUsuarios`()
BEGIN
	select nombre, apellido, rut, email from usuario;
END ;;
DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarClaveUsuario`(in_clave varchar(50), in_email varchar(100))
BEGIN
	update usuario set clave = in_clave where email=in_email;
END ;;
DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarEstadoFuente`(in_estado boolean, in_id int)
BEGIN
	update fuente set estado = in_estado where id=in_id;
END ;;
DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarFuente`(in_nombre varchar (100), in_link varchar(200), in_id int)
BEGIN
	update fuente set nombre=in_nombre, link=in_link where id=in_id;
END ;;
DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarImagenProducto`(in_imagen BLOB, in_codigo int)
BEGIN
	update producto set imagen = in_imagen where codigo= in_codigo; 
END ;;
DELIMITER ;
;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarProducto`(in_nombre varchar(100), in_marca varchar(100), in_descripcion varchar(300), in_codigo int)
BEGIN
	update producto set nombre=in_nombre, marca=in_marca, descripcion=in_descripcion where codigo=in_codigo;
END ;;
DELIMITER ;

DELIMITER ;;


CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarUsuario`(in_nombre varchar(100), in_apellido 
	varchar(100), in_rut varchar(11), in_email varchar(100))

BEGIN

	update usuario set nombre=in_nombre, apellido=in_apellido, rut=in_rut where email=in_email;
END ;;


DELIMITER ;


DELIMITER ;

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_deshabilitarProducto`(in_codigo int)
BEGIN
	update producto set estado=0;
END

DELIMITER ;


