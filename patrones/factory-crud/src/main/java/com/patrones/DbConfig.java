package com.patrones;

import java.sql.Connection;
import java.sql.SQLException;

import com.patrones.factory.anotaciones.MiComponente;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@MiComponente(name="dbConfig", singleton = true)
public class DbConfig {
	private HikariConfig config = new HikariConfig();
	private HikariDataSource dataSource;
	
	{
		config.setJdbcUrl("jdbc:sqlite:patrones.db");
		config.setUsername("sa");
		config.setPassword("");
		config.setConnectionTimeout(1000); //ms
		
		dataSource = new HikariDataSource(config);
	}
	
	public Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
