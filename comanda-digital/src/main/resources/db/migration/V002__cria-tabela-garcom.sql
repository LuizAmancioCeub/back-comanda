CREATE TABLE IF NOT EXISTS `comandaDigital`.`tb05_garcom` (
  `NU_GARCOM`  INT NOT NULL AUTO_INCREMENT,
  `MATRICULA` VARCHAR(10) NOT NULL,
  `CPF` VARCHAR(11) NOT NULL,
  `NOME` VARCHAR(45) NOT NULL,
  `SENHA` TEXT(155) NOT NULL,
  `TELEFONE` VARCHAR(11) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `NU_PERFIL` INT NOT NULL,
  PRIMARY KEY (`NU_GARCOM`),
  UNIQUE INDEX `cpf_UNIQUE` (`CPF` ASC) ,
 UNIQUE INDEX `matricula_UNIQUE` (`MATRICULA` ASC) ,
 UNIQUE INDEX `email_UNIQUE` (`EMAIL` ASC) ,
  INDEX `fk_Garcom_Perfil1_idx` (`NU_PERFIL` ASC) ,
  CONSTRAINT `fk_Garcom_Perfil1`
    FOREIGN KEY (`NU_PERFIL`)
    REFERENCES `comandaDigital`.`TB01_Perfil` (`NU_PERFIL`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;