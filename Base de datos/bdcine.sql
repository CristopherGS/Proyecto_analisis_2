-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.3.13-MariaDB-log - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura para tabla bdcine.asiento
CREATE TABLE IF NOT EXISTS `asiento` (
  `idAsiento` int(11) NOT NULL AUTO_INCREMENT,
  `letra` varchar(45) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `disponible` tinyint(4) DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  PRIMARY KEY (`idAsiento`),
  KEY `fk_Asiento_Sala1_idx` (`Sala_idSala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.asiento: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `asiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `asiento` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.clasificacion
CREATE TABLE IF NOT EXISTS `clasificacion` (
  `idClasificacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idClasificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.clasificacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `clasificacion` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `nit` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.cliente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.detalle_funcion_dias
CREATE TABLE IF NOT EXISTS `detalle_funcion_dias` (
  `funcion_idHorario` int(11) NOT NULL,
  `dias_iddias_funcion` int(11) NOT NULL,
  KEY `fk_detalle_funcion_dias_funcion1_idx` (`funcion_idHorario`),
  KEY `fk_detalle_funcion_dias_dias1_idx` (`dias_iddias_funcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.detalle_funcion_dias: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_funcion_dias` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_funcion_dias` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.dias
CREATE TABLE IF NOT EXISTS `dias` (
  `iddias_funcion` int(11) NOT NULL AUTO_INCREMENT,
  `dia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddias_funcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.dias: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dias` DISABLE KEYS */;
/*!40000 ALTER TABLE `dias` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.empledo
CREATE TABLE IF NOT EXISTS `empledo` (
  `idEmpledo` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Edad` varchar(45) DEFAULT NULL,
  `Sexo` varchar(45) DEFAULT NULL,
  `DPI` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Puesto_idPuesto` int(11) NOT NULL,
  PRIMARY KEY (`idEmpledo`),
  KEY `fk_Empledo_Puesto1_idx` (`Puesto_idPuesto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.empledo: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `empledo` DISABLE KEYS */;
/*!40000 ALTER TABLE `empledo` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Total` float DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `funcion_particula_idfuncion_particula` int(11) NOT NULL,
  `Empledo_idEmpledo` int(11) NOT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `fk_Factura_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_Factura_funcion_particula1_idx` (`funcion_particula_idfuncion_particula`),
  KEY `fk_Factura_Empledo1_idx` (`Empledo_idEmpledo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.factura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.funcion
CREATE TABLE IF NOT EXISTS `funcion` (
  `idFuncion` int(11) NOT NULL AUTO_INCREMENT,
  `Precio` float DEFAULT NULL,
  `Horario` time DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  `Pelicula_idPelicula` int(11) NOT NULL,
  PRIMARY KEY (`idFuncion`),
  KEY `fk_Horario_Sala_idx` (`Sala_idSala`),
  KEY `fk_Horario_uso_Pelicula1_idx` (`Pelicula_idPelicula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.funcion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.funcion_particula
CREATE TABLE IF NOT EXISTS `funcion_particula` (
  `idfuncion_particula` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `boletos_comprados` int(11) DEFAULT NULL,
  `funcion_idFuncion` int(11) NOT NULL,
  PRIMARY KEY (`idfuncion_particula`),
  KEY `fk_funcion_particula_funcion1_idx` (`funcion_idFuncion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.funcion_particula: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `funcion_particula` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcion_particula` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.horario_limpieza
CREATE TABLE IF NOT EXISTS `horario_limpieza` (
  `idHorario_limpieza` int(11) NOT NULL AUTO_INCREMENT,
  `Hora_inicio` time DEFAULT NULL,
  `Hora_fin` time DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  PRIMARY KEY (`idHorario_limpieza`),
  KEY `fk_Horario_limpieza_Sala1_idx` (`Sala_idSala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.horario_limpieza: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `horario_limpieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario_limpieza` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.pelicula
CREATE TABLE IF NOT EXISTS `pelicula` (
  `idPelicula` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_estreno` varchar(50) DEFAULT NULL,
  `duracion` varchar(50) DEFAULT NULL,
  `imagen` varchar(1000) DEFAULT NULL,
  `Categoria` varchar(100) DEFAULT NULL,
  `Clasificacion` varchar(100) DEFAULT NULL,
  `Idioma` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.pelicula: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`idPelicula`, `nombre`, `fecha_estreno`, `duracion`, `imagen`, `Categoria`, `Clasificacion`, `Idioma`) VALUES
	(1, 'Monster Hunter', '3 de Diciembre', '1h 44m', 'https://pics.filmaffinity.com/monster_hunter-171950842-large.jpg', 'Acción/Fantasía', 'B15', 'Español Sub'),
	(2, 'Soul', '25 de Diciembre', '1h 47m', 'https://pics.filmaffinity.com/soul-557797463-large.jpg', 'Infantil/Comedia', 'AA', 'Español'),
	(3, 'Amor de Gata', '18 de Junio', '1h 44m', 'https://pics.filmaffinity.com/nakitai_watashi_wa_neko_o_kaburu-628042243-large.jpg', 'Fantasía/Romance', 'B', 'Español'),
	(4, 'Batman: The Long Halloween', '22 de Junio', '1h 25m', 'https://pics.filmaffinity.com/batman_the_long_halloween_part_one-325438685-large.jpg', 'Acción', 'B15', 'Español');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.puesto
CREATE TABLE IF NOT EXISTS `puesto` (
  `idPuesto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `Sueldo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPuesto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.puesto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `puesto` DISABLE KEYS */;
/*!40000 ALTER TABLE `puesto` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.sala
CREATE TABLE IF NOT EXISTS `sala` (
  `idSala` int(11) NOT NULL AUTO_INCREMENT,
  `num_sala` int(11) DEFAULT NULL,
  `TipoSala_idTipoSala` int(11) NOT NULL,
  PRIMARY KEY (`idSala`),
  KEY `fk_Sala_TipoSala1_idx` (`TipoSala_idTipoSala`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.sala: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` (`idSala`, `num_sala`, `TipoSala_idTipoSala`) VALUES
	(1, 1, 2),
	(3, 2, 1);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.tiposala
CREATE TABLE IF NOT EXISTS `tiposala` (
  `idTipoSala` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `asientos` int(11) DEFAULT NULL,
  PRIMARY KEY (`idTipoSala`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.tiposala: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tiposala` DISABLE KEYS */;
INSERT INTO `tiposala` (`idTipoSala`, `nombre`, `asientos`) VALUES
	(1, 'pequeña', 20),
	(2, 'mediana', 30),
	(3, 'grande', 40);
/*!40000 ALTER TABLE `tiposala` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
