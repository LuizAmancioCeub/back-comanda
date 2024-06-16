CREATE TABLE IF NOT EXISTS `comandaDigital`.`tb12_categoria` (
  `NU_CATEGORIA` INT NOT NULL AUTO_INCREMENT,
  `CATEGORIA` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`NU_CATEGORIA`),
  UNIQUE INDEX `CATEGORIA_UNIQUE` (`CATEGORIA` ASC) )
ENGINE = InnoDB;