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
  `idAsiento` int(11) NOT NULL AUTO_INCREMENT,
  `disponible` tinyint(4) DEFAULT NULL,
  `fila` varchar(50) DEFAULT NULL,
  `columna` varchar(50) DEFAULT NULL,
  `Sala_idSala` int(11) NOT NULL,
  PRIMARY KEY (`idAsiento`),
  KEY `fk_Asiento_Sala1_idx` (`Sala_idSala`)
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.asiento: ~108 rows (approximately)
/*!40000 ALTER TABLE `asiento` DISABLE KEYS */;
INSERT INTO `asiento` (`idAsiento`, `disponible`, `fila`, `columna`, `Sala_idSala`) VALUES
	(1, 0, 'A', '1', 1),
	(2, 0, 'A', '2', 1),
	(3, 1, 'A', '3', 1),
	(4, 1, 'A', '4', 1),
	(5, 1, 'A', '5', 1),
	(6, 1, 'A', '6', 1),
	(7, 1, 'A', '7', 1),
	(8, 1, 'A', '8', 1),
	(9, 1, 'A', '9', 1),
	(10, 1, 'A', '10', 1),
	(11, 1, 'A', '11', 1),
	(12, 1, 'A', '12', 1),
	(13, 1, 'B', '1', 1),
	(14, 1, 'B', '2', 1),
	(15, 1, 'B', '3', 1),
	(16, 1, 'B', '4', 1),
	(17, 1, 'B', '5', 1),
	(18, 1, 'B', '6', 1),
	(19, 1, 'B', '7', 1),
	(20, 1, 'B', '8', 1),
	(21, 1, 'B', '9', 1),
	(22, 1, 'B', '10', 1),
	(23, 1, 'B', '11', 1),
	(24, 0, 'B', '12', 1),
	(25, 1, 'C', '1', 1),
	(26, 1, 'C', '2', 1),
	(27, 1, 'C', '3', 1),
	(28, 1, 'C', '4', 1),
	(29, 1, 'C', '5', 1),
	(30, 1, 'C', '6', 1),
	(31, 1, 'C', '7', 1),
	(32, 1, 'C', '8', 1),
	(33, 1, 'C', '9', 1),
	(34, 1, 'C', '10', 1),
	(35, 1, 'C', '11', 1),
	(36, 1, 'C', '12', 1),
	(73, 1, 'A', '1', 2),
	(74, 1, 'A', '2', 2),
	(75, 1, 'A', '3', 2),
	(76, 1, 'A', '4', 2),
	(77, 1, 'A', '5', 2),
	(78, 1, 'A', '6', 2),
	(79, 1, 'A', '7', 2),
	(80, 1, 'A', '8', 2),
	(81, 1, 'A', '9', 2),
	(82, 1, 'A', '10', 2),
	(83, 1, 'A', '11', 2),
	(84, 1, 'A', '12', 2),
	(85, 1, 'B', '1', 2),
	(86, 1, 'B', '2', 2),
	(87, 1, 'B', '3', 2),
	(88, 1, 'B', '4', 2),
	(89, 1, 'B', '5', 2),
	(90, 1, 'B', '6', 2),
	(91, 1, 'B', '7', 2),
	(92, 1, 'B', '8', 2),
	(93, 1, 'B', '9', 2),
	(94, 1, 'B', '10', 2),
	(95, 1, 'B', '11', 2),
	(96, 0, 'B', '12', 2),
	(97, 1, 'C', '1', 2),
	(98, 1, 'C', '2', 2),
	(99, 1, 'C', '3', 2),
	(100, 1, 'C', '4', 2),
	(101, 1, 'C', '5', 2),
	(102, 1, 'C', '6', 2),
	(103, 1, 'C', '7', 2),
	(104, 1, 'C', '8', 2),
	(105, 1, 'C', '9', 2),
	(106, 1, 'C', '10', 2),
	(107, 1, 'C', '11', 2),
	(108, 1, 'C', '12', 2),
	(109, 1, 'A', '1', 3),
	(110, 1, 'A', '2', 3),
	(111, 1, 'A', '3', 3),
	(112, 1, 'A', '4', 3),
	(113, 1, 'A', '5', 3),
	(114, 1, 'A', '6', 3),
	(115, 1, 'A', '7', 3),
	(116, 1, 'A', '8', 3),
	(117, 1, 'A', '9', 3),
	(118, 1, 'A', '10', 3),
	(119, 1, 'A', '11', 3),
	(120, 1, 'A', '12', 3),
	(121, 1, 'B', '1', 3),
	(122, 1, 'B', '2', 3),
	(123, 1, 'B', '3', 3),
	(124, 1, 'B', '4', 3),
	(125, 1, 'B', '5', 3),
	(126, 1, 'B', '6', 3),
	(127, 1, 'B', '7', 3),
	(128, 1, 'B', '8', 3),
	(129, 1, 'B', '9', 3),
	(130, 1, 'B', '10', 3),
	(131, 1, 'B', '11', 3),
	(132, 1, 'B', '12', 3),
	(133, 1, 'C', '1', 3),
	(134, 1, 'C', '2', 3),
	(135, 1, 'C', '3', 3),
	(136, 1, 'C', '4', 3),
	(137, 1, 'C', '5', 3),
	(138, 1, 'C', '6', 3),
	(139, 1, 'C', '7', 3),
	(140, 1, 'C', '8', 3),
	(141, 1, 'C', '9', 3),
	(142, 1, 'C', '10', 3),
	(143, 1, 'C', '11', 3),
	(144, 1, 'C', '12', 3);
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

-- Dumping data for table basededatoscine.detalle_funcion_dias: ~27 rows (approximately)
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
	(8, 1),
	(9, 7),
	(9, 5),
	(9, 3),
	(9, 2),
	(9, 1),
	(10, 7),
	(10, 2);
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
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.factura: ~37 rows (approximately)
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
	(29, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2Pelicula: Amor de GataAsiento: aa1'),
	(30, 45, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Monster HunterAsiento: B10'),
	(31, 45, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1Pelicula: Monster HunterAsiento: C10'),
	(32, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1\nPelicula: Amor de Gata\nAsiento: B12\nTotal: Q30.0'),
	(33, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1\nPelicula: Amor de Gata\nAsiento: A2\nTotal: Q30.0'),
	(34, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1\nPelicula: Amor de Gata\nAsiento: A2\nTotal: Q30.0'),
	(35, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1\nPelicula: Amor de Gata\nAsiento: A2\nTotal: Q30.0'),
	(36, 30, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 1\nPelicula: Amor de Gata\nAsiento: A2\nTotal: Q30.0'),
	(37, 500, 'NIT: 123 \nCliente: asdfqwerqwer \nSala: 2\nPelicula: MR.ROBOT\nAsiento: B12\nTotal: Q500.0');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.funcion: ~5 rows (approximately)
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
INSERT INTO `funcion` (`idFuncion`, `Precio`, `Horario`, `Sala_idSala`, `Pelicula_idPelicula`) VALUES
	(5, 20, '00:00:00', 3, 2),
	(6, 30, '00:00:00', 1, 3),
	(7, 45, '02:00:00', 3, 1),
	(9, 300, '20:00:00', 3, 7),
	(10, 500, '00:00:00', 5, 7);
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

-- Dumping data for table basededatoscine.funcion_particula: ~0 rows (approximately)
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table basededatoscine.pelicula: ~5 rows (approximately)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`idPelicula`, `nombre`, `fecha_estreno`, `duracion`, `imagen`, `Categoria`, `Clasificacion`, `Idioma`) VALUES
	(1, 'Monster Hunter', '3 de Diciembre', '1h 44m', 'https://pics.filmaffinity.com/monster_hunter-171950842-large.jpg', 'Acción/Fantasía', 'B15', 'Español Sub'),
	(2, 'Soul', '25 de Diciembre', '1h 47m', 'https://pics.filmaffinity.com/soul-557797463-large.jpg', 'Infantil/Comedia', 'AA', 'Español'),
	(3, 'Amor de Gata', '18 de Junio', '1h 44m', 'https://pics.filmaffinity.com/nakitai_watashi_wa_neko_o_kaburu-628042243-large.jpg', 'Fantasía/Romance', 'B', 'Español'),
	(4, 'Batman: The Long Halloween', '22 de Junio', '1h 25m', 'https://pics.filmaffinity.com/batman_the_long_halloween_part_one-325438685-large.jpg', 'Acción', 'B15', 'Español'),
	(7, 'MR.ROBOT', 'HOY', '20HRS', 'https://pics.filmaffinity.com/mr_robot_tv_series-978107021-large.jpg', 'SUSPENSO', '5 estrellas', 'espa;ol');
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
