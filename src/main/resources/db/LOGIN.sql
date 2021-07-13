CREATE TABLE IF NOT EXISTS `azhiyoorpanchayath`.`login` (
  `username` VARCHAR(25) NOT NULL,
  `password` VARCHAR(100) NULL DEFAULT NULL,
  `enabled` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`username`))
