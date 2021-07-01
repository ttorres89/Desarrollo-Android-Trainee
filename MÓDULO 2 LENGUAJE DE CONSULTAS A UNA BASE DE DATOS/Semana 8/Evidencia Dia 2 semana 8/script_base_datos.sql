SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `Producto`;
DROP TABLE IF EXISTS `ProductoDetalle`;
DROP TABLE IF EXISTS `Usuario`;
DROP TABLE IF EXISTS `TipoProducto`;
DROP TABLE IF EXISTS `Fuente`;
DROP TABLE IF EXISTS `UsuarioProducto`;
DROP TABLE IF EXISTS `UsuarioProductoHistorico`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `Producto` (
    `id` INT NOT NULL,
    `codigo` VARCHAR(5) NOT NULL,
    `id_tipoProducto` INT NOT NULL,
    `nombre` VARCHAR(100) NOT NULL,
    `descripcion` VARCHAR(200) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `ProductoDetalle` (
    `id` INT NOT NULL,
    `id_producto` INT NOT NULL,
    `link` VARCHAR(200) NOT NULL,
    `precio` INT NOT NULL,
    `id_fuente` INT NOT NULL,
    `fechaActualizacion` DATETIME NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
    `id` INT NOT NULL,
    `nombre` VARCHAR(100) NOT NULL,
    `apellido` VARCHAR(100) NOT NULL,
    `rut` VARCHAR(11) NOT NULL,
    `email` VARCHAR(100) NOT NULL,
    `clave` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `TipoProducto` (
    `codigo` INT NOT NULL,
    `nombre` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`codigo`)
);

CREATE TABLE `Fuente` (
    `id` INT NOT NULL,
    `nombre` VARCHAR(100) NOT NULL,
    `link` VARCHAR(200) NOT NULL,
    `estado` BOOLEAN NOT NULL,
    `fechaActualizacion` DATETIME NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `UsuarioProducto` (
    `id` INT NOT NULL,
    `id_usuario` INT NOT NULL,
    `id_producto` INT NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `UsuarioProductoHistorico` (
    `id` INT NOT NULL,
    `usuario_id` INT NOT NULL,
    `id_productoDetalle` int NOT NULL,
    `precio` int NOT NULL,
    `fecha` DATETIME NOT NULL,
    PRIMARY KEY (`id`)
);
