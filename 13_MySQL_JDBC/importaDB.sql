--
-- Base de datos: `baloncesto`
--
CREATE DATABASE IF NOT EXISTS `baloncesto` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `baloncesto`;
-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `socio`
--
CREATE TABLE IF NOT EXISTS `socio` (
`socioID` int(11) NOT NULL,
`nombre` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
`estatura` int(11) DEFAULT NULL,
`edad` int(11) DEFAULT NULL,
`localidad` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
PRIMARY KEY (`socioID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `socio`
--
INSERT INTO `socio` (`socioID`, `nombre`, `estatura`, `edad`, `localidad`) VALUES
(1235, 'Bermúdez Espada, Ana María', 186, 46, 'Málaga'),
(1236, 'Cano Cuenca, Margarita', 161, 48, 'Málaga')

