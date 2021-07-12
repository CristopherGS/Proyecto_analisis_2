-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.6.3-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table basededatoscine.asiento
CREATE TABLE IF NOT EXISTS `asiento` (
  `idAsiento` varchar(50) NOT NULL,
  `disponible` tinyint(4) DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  PRIMARY KEY (`idAsiento`),
  KEY `fk_Asiento_Sala1_idx` (`Sala_idSala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.asiento: ~71 rows (approximately)
/*!40000 ALTER TABLE `asiento` DISABLE KEYS */;
INSERT INTO `asiento` (`idAsiento`, `disponible`, `Sala_idSala`) VALUES
	('a1', 1, 1),
	('a10', 1, 1),
	('a12', 1, 1),
	('a2', 1, 1),
	('a3', 1, 1),
	('a4', 1, 1),
	('a5', 1, 1),
	('a6', 1, 1),
	('a7', 1, 1),
	('a8', 1, 1),
	('a9', 1, 1),
	('aa1', 1, 2),
	('aa10', 1, 2),
	('aa11', 1, 2),
	('aa12', 1, 2),
	('aa2', 1, 2),
	('aa3', 1, 2),
	('aa4', 1, 2),
	('aa5', 1, 2),
	('aa6', 1, 2),
	('aa7', 1, 2),
	('aa8', 1, 2),
	('aa9', 1, 2),
	('b1', 1, 1),
	('b10', 1, 1),
	('b11', 1, 1),
	('b12', 1, 1),
	('b2', 1, 1),
	('b3', 1, 1),
	('b4', 1, 1),
	('b5', 1, 1),
	('b6', 1, 1),
	('b7', 1, 1),
	('b8', 1, 1),
	('b9', 1, 1),
	('bb1', 1, 2),
	('bb10', 1, 2),
	('bb11', 1, 2),
	('bb12', 1, 2),
	('bb2', 1, 2),
	('bb3', 1, 2),
	('bb4', 1, 2),
	('bb5', 1, 2),
	('bb6', 1, 2),
	('bb7', 1, 2),
	('bb8', 1, 2),
	('bb9', 1, 2),
	('c1', 1, 1),
	('c10', 1, 1),
	('c11', 1, 1),
	('c12', 1, 1),
	('c2', 1, 1),
	('c3', 1, 1),
	('c4', 1, 1),
	('c5', 1, 1),
	('c6', 1, 1),
	('c7', 1, 1),
	('c8', 1, 1),
	('c9', 1, 1),
	('cc1', 1, 2),
	('cc10', 1, 2),
	('cc11', 1, 2),
	('cc12', 1, 2),
	('cc2', 1, 2),
	('cc3', 1, 2),
	('cc4', 1, 2),
	('cc5', 1, 2),
	('cc6', 1, 2),
	('cc7', 1, 2),
	('cc8', 1, 2),
	('cc9', 1, 2);
/*!40000 ALTER TABLE `asiento` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.categoria: ~0 rows (approximately)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.clasificacion
CREATE TABLE IF NOT EXISTS `clasificacion` (
  `idClasificacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idClasificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.clasificacion: ~0 rows (approximately)
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `clasificacion` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `nit` varchar(45) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.cliente: ~4 rows (approximately)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`idCliente`, `nombre`, `nit`, `telefono`) VALUES
	(1, 'Jose Daniel', '12345678', '888888888'),
	(2, 'Cristopher Guerra', '12345687', '45678930'),
	(3, 'asdf', '1234', '12345678'),
	(4, 'asdfqwerqwer', '123', '87654321');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.detalle_funcion_dias
CREATE TABLE IF NOT EXISTS `detalle_funcion_dias` (
  `funcion_idHorario` int(11) NOT NULL,
  `dias_iddias_funcion` int(11) NOT NULL,
  KEY `fk_detalle_funcion_dias_funcion1_idx` (`funcion_idHorario`),
  KEY `fk_detalle_funcion_dias_dias1_idx` (`dias_iddias_funcion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.detalle_funcion_dias: ~20 rows (approximately)
/*!40000 ALTER TABLE `detalle_funcion_dias` DISABLE KEYS */;
INSERT INTO `detalle_funcion_dias` (`funcion_idHorario`, `dias_iddias_funcion`) VALUES
	(1, 4),
	(1, 1),
	(2, 3),
	(2, 2),
	(2, 1),
	(3, 5),
	(3, 4),
	(3, 2),
	(4, 7),
	(4, 6),
	(4, 5),
	(4, 4),
	(4, 3),
	(4, 2),
	(4, 1),
	(6, 7),
	(6, 4),
	(6, 1),
	(7, 5),
	(8, 1);
/*!40000 ALTER TABLE `detalle_funcion_dias` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.dias
CREATE TABLE IF NOT EXISTS `dias` (
  `iddias_funcion` int(11) NOT NULL AUTO_INCREMENT,
  `dia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddias_funcion`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.dias: ~7 rows (approximately)
/*!40000 ALTER TABLE `dias` DISABLE KEYS */;
INSERT INTO `dias` (`iddias_funcion`, `dia`) VALUES
	(1, 'Lunes'),
	(2, 'Martes'),
	(3, 'Miercoles'),
	(4, 'Jueves'),
	(5, 'Viernes'),
	(6, 'Sabado'),
	(7, 'Domingo');
/*!40000 ALTER TABLE `dias` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.empledo
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.empledo: ~0 rows (approximately)
/*!40000 ALTER TABLE `empledo` DISABLE KEYS */;
/*!40000 ALTER TABLE `empledo` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Total` float DEFAULT NULL,
  `Detalle` text DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.factura: ~29 rows (approximately)
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` (`idFactura`, `Total`, `Detalle`) VALUES
	(1, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a1'),
	(2, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a1'),
	(3, 0, 'NIT: 12345687 \nCliente: Cristopher Guerra \nSala: 1Pelicula: Amor de GataAsiento: a1'),
	(4, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a1'),
	(5, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a2'),
	(6, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a4'),
	(7, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 1Pelicula: Amor de GataAsiento: a3'),
	(8, 0, 'NIT: 12345678 \nCliente: Jose Daniel \nSala: 2Pelicula: Amor de GataAsiento: A1'),
	(9, 0, 'NIT: 12345687 \nCliente: Cristopher Guerra \nSala: 2Pelicula: Amor de GataAsiento: A1'),
	(10, 0, 'NIT: 1234 \nCliente: asdf \nSala: 1Pelicula: Amor de GataAsiento: a3'),
	(11, 0, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: A4'),
	(12, 0, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: A2'),
	(13, 0, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: a3'),
	(14, 0, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: C1'),
	(15, 0, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(16, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: AA1'),
	(17, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(18, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: aa1'),
	(19, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(20, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(21, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(22, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: aa1'),
	(23, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Amor de GataAsiento: aa1'),
	(24, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(25, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(26, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(27, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(28, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(29, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1');
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.funcion
CREATE TABLE IF NOT EXISTS `funcion` (
  `idFuncion` int(11) NOT NULL AUTO_INCREMENT,
  `Precio` float DEFAULT NULL,
  `Horario` time DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  `Pelicula_idPelicula` int(11) NOT NULL,
  PRIMARY KEY (`idFuncion`),
  KEY `fk_Horario_Sala_idx` (`Sala_idSala`),
  KEY `fk_Horario_uso_Pelicula1_idx` (`Pelicula_idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.funcion: ~3 rows (approximately)
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` (`idFuncion`, `Precio`, `Horario`, `Sala_idSala`, `Pelicula_idPelicula`) VALUES
	(5, 20, '00:00:00', 3, 2),
	(6, 30, '00:00:00', 1, 3),
	(7, 45, '02:00:00', 3, 1);
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.funcion_particula
CREATE TABLE IF NOT EXISTS `funcion_particula` (
  `idfuncion_particula` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `boletos_comprados` int(11) DEFAULT NULL,
  `funcion_idFuncion` int(11) NOT NULL,
  PRIMARY KEY (`idfuncion_particula`),
  KEY `fk_funcion_particula_funcion1_idx` (`funcion_idFuncion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.funcion_particula: ~1 rows (approximately)
/*!40000 ALTER TABLE `funcion_particula` DISABLE KEYS */;
INSERT INTO `funcion_particula` (`idfuncion_particula`, `fecha`, `boletos_comprados`, `funcion_idFuncion`) VALUES
	(1, '2020-07-10', 0, 1);
/*!40000 ALTER TABLE `funcion_particula` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.horario_limpieza
CREATE TABLE IF NOT EXISTS `horario_limpieza` (
  `idHorario_limpieza` int(11) NOT NULL AUTO_INCREMENT,
  `Hora_inicio` time DEFAULT NULL,
  `Hora_fin` time DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  PRIMARY KEY (`idHorario_limpieza`),
  KEY `fk_Horario_limpieza_Sala1_idx` (`Sala_idSala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.horario_limpieza: ~0 rows (approximately)
/*!40000 ALTER TABLE `horario_limpieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario_limpieza` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.pelicula
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.pelicula: ~4 rows (approximately)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`idPelicula`, `nombre`, `fecha_estreno`, `duracion`, `imagen`, `Categoria`, `Clasificacion`, `Idioma`) VALUES
	(1, 'Monster Hunter', '3 de Diciembre', '1h 44m', 'https://pics.filmaffinity.com/monster_hunter-171950842-large.jpg', 'Acción/Fantasía', 'B15', 'Español Sub'),
	(2, 'Soul', '25 de Diciembre', '1h 47m', 'https://pics.filmaffinity.com/soul-557797463-large.jpg', 'Infantil/Comedia', 'AA', 'Español'),
	(3, 'Amor de Gata', '18 de Junio', '1h 44m', 'https://pics.filmaffinity.com/nakitai_watashi_wa_neko_o_kaburu-628042243-large.jpg', 'Fantasía/Romance', 'B', 'Español'),
	(4, 'Batman: The Long Halloween', '22 de Junio', '1h 25m', 'https://pics.filmaffinity.com/batman_the_long_halloween_part_one-325438685-large.jpg', 'Acción', 'B15', 'Español');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.puesto
CREATE TABLE IF NOT EXISTS `puesto` (
  `idPuesto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `Sueldo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.puesto: ~2 rows (approximately)
/*!40000 ALTER TABLE `puesto` DISABLE KEYS */;
INSERT INTO `puesto` (`idPuesto`, `nombre`, `Sueldo`) VALUES
	(1, 'Gerente', 'Q15000'),
	(2, 'Cajero', 'Q3500');
/*!40000 ALTER TABLE `puesto` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.sala
CREATE TABLE IF NOT EXISTS `sala` (
  `idSala` int(11) NOT NULL AUTO_INCREMENT,
  `num_sala` int(11) DEFAULT NULL,
  `TipoSala_idTipoSala` int(11) NOT NULL,
  PRIMARY KEY (`idSala`),
  KEY `fk_Sala_TipoSala1_idx` (`TipoSala_idTipoSala`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.sala: ~3 rows (approximately)
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` (`idSala`, `num_sala`, `TipoSala_idTipoSala`) VALUES
	(1, 1, 2),
	(3, 2, 1),
	(5, 3, 2);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;

-- Dumping structure for table basededatoscine.tiposala
CREATE TABLE IF NOT EXISTS `tiposala` (
  `idTipoSala` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `asientos` int(11) DEFAULT NULL,
  PRIMARY KEY (`idTipoSala`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.tiposala: ~3 rows (approximately)
/*!40000 ALTER TABLE `tiposala` DISABLE KEYS */;
INSERT INTO `tiposala` (`idTipoSala`, `nombre`, `asientos`) VALUES
	(1, 'pequeña', 20),
	(2, 'mediana', 30),
	(3, 'grande', 40);
/*!40000 ALTER TABLE `tiposala` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
