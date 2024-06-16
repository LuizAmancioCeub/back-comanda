package com.comandadigital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FlywaySchemaHistoryCleaner {
	  @Autowired
	  private JdbcTemplate jdbcTemplate;

	    public void removeFlywaySchemaHistory() {
	        jdbcTemplate.execute("DROP TABLE IF EXISTS flyway_schema_history");
	    }
	    
	    public void dropAllTables() {
	        // Obter todas as tabelas no banco de dados
	        List<String> tables = jdbcTemplate.queryForList("SHOW TABLES", String.class);

	        // Desativar as verificações de chave estrangeira
	        jdbcTemplate.execute("SET FOREIGN_KEY_CHECKS = 0");

	        // Dropar todas as tabelas
	        for (String table : tables) {
	            jdbcTemplate.execute("DROP TABLE IF EXISTS " + table);
	        }

	        // Reativar as verificações de chave estrangeira
	        jdbcTemplate.execute("SET FOREIGN_KEY_CHECKS = 1");
	    }
}
