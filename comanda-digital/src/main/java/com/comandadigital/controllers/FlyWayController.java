package com.comandadigital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comandadigital.services.FlywaySchemaHistoryCleaner;

@RestController
@RequestMapping("/flyway")
public class FlyWayController {
	
	@Autowired
	private FlywaySchemaHistoryCleaner flywaySchemaHistoryCleaner;

	    @DeleteMapping("/clean")
	    public String cleanFlywaySchemaHistory() {
	        flywaySchemaHistoryCleaner.removeFlywaySchemaHistory();
	        return "Flyway schema history table removed";
	    }
	    
	    @DeleteMapping("/cleanAll")
	    public String cleanAll() {
	        flywaySchemaHistoryCleaner.dropAllTables();
	        return "All tables dropped";
	    }
}
