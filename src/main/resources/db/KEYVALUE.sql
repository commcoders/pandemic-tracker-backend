CREATE TABLE IF NOT EXISTS `azhiyoorpanchayath`.`keyvalue` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `KEY_CATAGORY` VARCHAR(20) NULL DEFAULT NULL,
  `KEY_CODE` VARCHAR(20) NULL DEFAULT NULL,
  `KEY_DISCRIPTION` VARCHAR(200) NULL DEFAULT NULL,
  `LANUAGE_CODE` VARCHAR(200) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
