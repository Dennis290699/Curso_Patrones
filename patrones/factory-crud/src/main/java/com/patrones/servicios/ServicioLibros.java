package com.patrones.servicios;

import java.util.List;

import com.patrones.DbConfig;
import com.patrones.db.Libro;

public interface ServicioLibros {
	public void setDbConfig(DbConfig dbConfig);
	
	//--CRUD
	
	public void crear(Libro obj); 			//C

	public Libro buscarPorId(Integer id);   //R
	public List<Libro> listarTodos();		//R
	
	public void actualizar(Libro obj); 		//U
	
	public void eliminarPorId(Integer id); 	//D
	
}
