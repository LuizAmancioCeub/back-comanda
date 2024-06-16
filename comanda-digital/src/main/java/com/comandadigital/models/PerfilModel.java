package com.comandadigital.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB01_PERFIL")
public class PerfilModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id// id é auto increment e chave primaria
	@Column(name = "NU_PERFIL", nullable = false, unique = true)
	private int id;
	
	@Column(name = "PERFIL")
	private String perfil;
	
	public static final Integer CLIENTE = 1;
	public static final Integer VISITANTE = 2;
	public static final Integer GERENTE = 3;
	public static final Integer GARCOM = 4;
	public static final Integer COZINHA = 5;
	public static final Integer CAIXA = 6;

}
