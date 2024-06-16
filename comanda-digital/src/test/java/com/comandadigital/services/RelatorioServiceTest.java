package com.comandadigital.services;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.comandadigital.models.CategoriaModel;
import com.comandadigital.models.ComandaModel;
import com.comandadigital.models.CozinhaModel;
import com.comandadigital.models.ItemModel;
import com.comandadigital.models.PedidoModel;
import com.comandadigital.models.StatusModel;

class RelatorioServiceTest {
	
	private final List<PedidoModel> pedidos = new ArrayList<>();
	
	@BeforeEach
	public void setup() {
		pedidos.add(new PedidoModel(1,21.1,1,"teste",LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 
				new ItemModel(1,"X-tudo", "teste 123", 21.1, "a",new CategoriaModel(), new StatusModel()),
				new StatusModel(), 
				new ComandaModel(), 
				new CozinhaModel(null, null, null)));
		
		pedidos.add(new PedidoModel(2,10,1,"teste",LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 
				new ItemModel(1,"X-Salada", "teste 123", 10, "a",new CategoriaModel(), new StatusModel()),
				new StatusModel(), 
				new ComandaModel(), 
				new CozinhaModel(null, null, null)));
		pedidos.add(new PedidoModel(1,42.2,2,"teste",LocalDateTime.now(), LocalDateTime.now().plus(3, ChronoUnit.HOURS), 
				new ItemModel(1,"X-tudo", "teste 123", 21.1, "a",new CategoriaModel(), new StatusModel()),
				new StatusModel(), 
				new ComandaModel(), 
				new CozinhaModel(null, null, null)));
	}
	
	@Test
	void testGerarRelatorioSemanal() throws IOException {
		var relatorio = new RelatorioService();
		relatorio.gerarRelatorioSemanal(pedidos);
	}

}