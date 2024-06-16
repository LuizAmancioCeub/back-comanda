package com.comandadigital.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comandadigital.models.PerfilModel;
import com.comandadigital.models.StatusModel;
import com.comandadigital.repositories.StatusRepository;

@RestController
public class StatusController {
	
	@Autowired
	StatusRepository statusRepository;
	
	//listar status
	@GetMapping("/status")
	public ResponseEntity<List<StatusModel>> getAllStatus(){
		List<StatusModel> statusList = statusRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(statusList);
	}
	
	@PostMapping("/status")
	public ResponseEntity<List<StatusModel>> incluirPerfil(){
		List<StatusModel> perfis = Arrays.asList(
	            new StatusModel("Ativo"),
	            new StatusModel("Inativo"),
	            new StatusModel("Em Preparação"),
	            new StatusModel("Pronto para Entrega"),
	            new StatusModel("Entregue"),
	            new StatusModel("Cancelado"),
	            new StatusModel("Em Processamento"),
	            new StatusModel("Aberta"),
	            new StatusModel("Aguardando Pagamento"),
	            new StatusModel("Paga"),
	            new StatusModel("Livre"),
	            new StatusModel("Ocupada"),
	            new StatusModel("Reservado"),
	            new StatusModel("Indisponível")
	        );
		List<StatusModel> perfilList = statusRepository.saveAll(perfis);
		return ResponseEntity.status(HttpStatus.OK).body(perfilList);
	}
}
