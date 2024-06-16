CREATE TABLE IF NOT EXISTS `comandaDigital`.`tb03_caixa` (
  `NU_CAIXA` INT NOT NULL AUTO_INCREMENT,
  `SENHA` TEXT(155) NOT NULL,
  `NU_PERFIL` INT NOT NULL,
  PRIMARY KEY (`NU_CAIXA`),
  INDEX `fk_Caixa_Perfil1_idx` (`NU_PERFIL` ASC) ,
  CONSTRAINT `fk_Caixa_Perfil1`
    FOREIGN KEY (`NU_PERFIL`)
    REFERENCES `comandaDigital`.`TB01_Perfil` (`NU_PERFIL`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;
