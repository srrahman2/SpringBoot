CREATE DATABASE  IF NOT EXISTS `parts_directory`;
USE `parts_directory`;

--
-- Table structure for table `parts`
--

DROP TABLE IF EXISTS `parts`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `part_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `parts`
--

INSERT INTO `employee` VALUES 
	(1,'Engine'),
	(2,'Brake Pads'),
	(3,'Rotor'),
	(4,'Spark Plugs'),
	(5,'Tire');