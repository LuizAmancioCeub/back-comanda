package com.comandadigital.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.comandadigital.models.PerfilModel;
import com.comandadigital.repositories.PerfilRepository;

@RestController
public class PerfilController {
	
	@Autowired
	PerfilRepository perfilRepository;
	
	@GetMapping("/perfis")
	public ResponseEntity<List<PerfilModel>> getAllPerfil(){
		List<PerfilModel> perfilList = perfilRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(perfilList);
	}
	
	@PostMapping("/perfis")
	public ResponseEntity<List<PerfilModel>> incluirPerfil(){
		List<PerfilModel> perfis = Arrays.asList(
	            new PerfilModel(1, "Cliente"),
	            new PerfilModel(2, "Visitante"),
	            new PerfilModel(3, "Gerente"),
	            new PerfilModel(4, "Garçom"),
	            new PerfilModel(5, "Cozinha"),
	            new PerfilModel(6, "Caixa")
	        );
		List<PerfilModel> perfilList = perfilRepository.saveAll(perfis);
		return ResponseEntity.status(HttpStatus.OK).body(perfilList);
	}
}
