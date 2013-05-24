create database if not exists rest;
CREATE TABLE IF NOT EXISTS `ruc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `ruc` varchar(12) DEFAULT NULL,
  `dni` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;


INSERT INTO `ruc` (`id`, `nombre`, `ruc`, `dni`) VALUES
(1, 'Juan', '123456789', 'dni 12346'),
(2, 'María', '987654312', 'dni 98798798'),
(3, 'Jesús', '446688775', 'dni517');
