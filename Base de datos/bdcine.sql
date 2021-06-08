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


-- Volcando estructura de base de datos para bdcine
CREATE DATABASE IF NOT EXISTS `bdcine` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bdcine`;

-- Volcando estructura para tabla bdcine.ambientacion
CREATE TABLE IF NOT EXISTS `ambientacion` (
  `idAmbientacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAmbientacion`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.ambientacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `ambientacion` DISABLE KEYS */;
INSERT INTO `ambientacion` (`idAmbientacion`, `nombre`) VALUES
	(1, 'Religisa'),
	(2, 'Futurista'),
	(3, 'Policiaca'),
	(4, 'Crimen'),
	(5, 'Belica'),
	(6, 'Historica'),
	(7, 'Deportiva'),
	(8, 'Western'),
	(9, 'Otra');
/*!40000 ALTER TABLE `ambientacion` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`idCategoria`, `nombre`) VALUES
	(1, 'Accion'),
	(2, 'Aventura'),
	(3, 'Ciencia Ficcion'),
	(4, 'Comedia'),
	(5, 'No Ficcion/Documental'),
	(6, 'Drama'),
	(7, 'Fantasia'),
	(8, 'Musical'),
	(9, 'Suspense'),
	(10, 'Terror'),
	(11, 'Otro');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.clasificacion
CREATE TABLE IF NOT EXISTS `clasificacion` (
  `idClasificacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idClasificacion`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.clasificacion: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `clasificacion` DISABLE KEYS */;
INSERT INTO `clasificacion` (`idClasificacion`, `nombre`, `descripcion`) VALUES
	(1, 'AA', 'Películas para todo público que tengan además atractivo infantil y sean comprensibles para niños menores de siete años de edad'),
	(2, 'A', 'Películas para todo público.'),
	(3, 'B', 'Películas para adolescentes de 12 años en adelante'),
	(4, 'B15', 'Película no recomendable para menores de 15 años de edad.'),
	(5, 'C', 'Peliculas para adultos de 18 años en adelante.'),
	(6, 'D', 'Películas para adultos, con sexo explícito, lenguaje procaz o alto grado de violencia.');
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.dias: ~0 rows (aproximadamente)
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

-- Volcando estructura para tabla bdcine.factura
CREATE TABLE IF NOT EXISTS `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Total` float DEFAULT NULL,
  `Cliente_idCliente` int(11) NOT NULL,
  `funcion_particula_idfuncion_particula` int(11) NOT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `fk_Factura_Cliente1_idx` (`Cliente_idCliente`),
  KEY `fk_Factura_funcion_particula1_idx` (`funcion_particula_idfuncion_particula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.factura: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.formato
CREATE TABLE IF NOT EXISTS `formato` (
  `idFormato` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFormato`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.formato: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `formato` DISABLE KEYS */;
INSERT INTO `formato` (`idFormato`, `nombre`) VALUES
	(1, 'Cine Mudo'),
	(2, 'Cine Sonoro'),
	(3, 'Cine 2D'),
	(4, 'Cine 3D'),
	(5, 'Animacion');
/*!40000 ALTER TABLE `formato` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.funcion
CREATE TABLE IF NOT EXISTS `funcion` (
  `idFuncion` int(11) NOT NULL AUTO_INCREMENT,
  `hora_inicio` time DEFAULT NULL,
  `hora_final` time DEFAULT NULL,
  `Precio` float DEFAULT NULL,
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
  `fecha_estreno` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `duracion` int(11) DEFAULT NULL,
  `Categoria_idCategoria` int(11) NOT NULL,
  `Clasificacion_idClasificacion` int(11) NOT NULL,
  `Formato_idFormato` int(11) NOT NULL,
  `Ambientacion_idAmbientacion` int(11) NOT NULL,
  PRIMARY KEY (`idPelicula`),
  KEY `fk_Pelicula_Categoria1_idx` (`Categoria_idCategoria`),
  KEY `fk_Pelicula_Clasificacion1_idx` (`Clasificacion_idClasificacion`),
  KEY `fk_Pelicula_Formato1_idx` (`Formato_idFormato`),
  KEY `fk_Pelicula_Ambientacion1_idx` (`Ambientacion_idAmbientacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.pelicula: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;

-- Volcando estructura para tabla bdcine.sala
CREATE TABLE IF NOT EXISTS `sala` (
  `idSala` int(11) NOT NULL AUTO_INCREMENT,
  `num_asientos` int(11) DEFAULT NULL,
  `num_sala` int(11) DEFAULT NULL,
  PRIMARY KEY (`idSala`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla bdcine.sala: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` (`idSala`, `num_asientos`, `num_sala`) VALUES
	(1, 240, 1),
	(2, 240, 2),
	(3, 240, 3),
	(4, 240, 4),
	(5, 240, 5),
	(6, 240, 6),
	(7, 240, 7);
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
