
CREATE DATABASE  IF NOT EXISTS `comparadorproducto`

USE `comparadorproducto`;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `Producto`;
DROP TABLE IF EXISTS `ProductoDetalle`;
DROP TABLE IF EXISTS `Usuario`;
DROP TABLE IF EXISTS `TipoProducto`;
DROP TABLE IF EXISTS `Fuente`;
DROP TABLE IF EXISTS `UsuarioProducto`;
DROP TABLE IF EXISTS `UsuarioProductoHistorico`;


CREATE TABLE `Producto` (
    `codigo` INT NOT NULL AUTO_INCREMENT,
    `id_tipoProducto` INT NOT NULL,
    `nombre` VARCHAR(100) NOT NULL,
    `marca` VARCHAR(100) NOT NULL,
    `descripcion` VARCHAR(300) NOT NULL,
    `imagen` VARCHAR(300) NULL,
    `estado` BOOLEAN NOT NULL default 1,
    PRIMARY KEY (`codigo`),
    UNIQUE (`nombre`)
);

CREATE TABLE `ProductoDetalle` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_producto` INT NOT NULL,
    `link` VARCHAR(200) NOT NULL,
    `precio` INT NOT NULL,
    `id_fuente` INT NOT NULL,
    `fechaActualizacion` DATETIME NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(100) NOT NULL,
    `apellido` VARCHAR(100) NOT NULL,
    `rut` VARCHAR(11) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `clave` VARCHAR(50) NOT NULL,
    `fecha_creacion` DATETIME NOT NULL DEFAULT  CURRENT_TIMESTAMP,
    `fecha_actualizacion` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`email`)
);

CREATE TABLE `TipoProducto` (
    `codigo` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(100) NOT NULL,
    `fecha_creacion` DATETIME NOT NULL DEFAULT  CURRENT_TIMESTAMP,
    PRIMARY KEY (`codigo`)
);

CREATE TABLE `Fuente` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(100) NOT NULL,
    `link` VARCHAR(200) NOT NULL,
    `estado` BOOLEAN NOT NULL default 1,
    `fechaActualizacion` DATETIME NOT NULL DEFAULT  CURRENT_TIMESTAMP,
    `imagen` VARCHAR(300) NULL,
    PRIMARY KEY (`id`),
    UNIQUE (`nombre`, `link`)
);

CREATE TABLE `UsuarioProducto` (
    `id_usuario` INT NOT NULL,
    `id_producto` INT NOT NULL,
    PRIMARY KEY (`id_usuario`, `id_producto`)
);

CREATE TABLE `UsuarioProductoHistorico` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `id_usuario` INT NOT NULL,
    `id_productoDetalle` int NOT NULL,
    `precio` int NOT NULL,
    `fecha` DATETIME NOT NULL DEFAULT  CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`, `id_usuario`, `id_productoDetalle`, `fecha`)
);


ALTER TABLE `Producto` ADD FOREIGN KEY (`id_tipoProducto`) REFERENCES `TipoProducto`(`codigo`);
ALTER TABLE `ProductoDetalle` ADD FOREIGN KEY (`id_producto`) REFERENCES `Producto`(`codigo`);
ALTER TABLE `ProductoDetalle` ADD FOREIGN KEY (`id_fuente`) REFERENCES `Fuente`(`id`);
ALTER TABLE `UsuarioProducto` ADD FOREIGN KEY (`id_usuario`) REFERENCES `Usuario` (`id`);
ALTER TABLE `UsuarioProducto` ADD FOREIGN KEY (`id_producto`) REFERENCES `Producto` (`codigo`);
ALTER TABLE `UsuarioProductoHistorico` ADD FOREIGN KEY (`id_usuario`) REFERENCES `Usuario` (`id`);
ALTER TABLE `UsuarioProductoHistorico` ADD FOREIGN KEY (`id_productoDetalle`) REFERENCES `ProductoDetalle` (`id`);



SET FOREIGN_KEY_CHECKS = 1;