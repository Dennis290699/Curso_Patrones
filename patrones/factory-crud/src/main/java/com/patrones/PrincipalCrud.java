package com.patrones;

import com.patrones.db.LibroRec;
import com.patrones.factory.Factory;
import com.patrones.factory.FactoryImpl;
import com.patrones.servicios.ServicioLibros;

public class PrincipalCrud {

	public static void main(String[] args) throws Exception {

		Factory fact = new FactoryImpl();
		fact.init("com.patrones");
		
		//--
		DbConfig dbConfig = fact.create("dbConfig");
		ServicioLibros servicio = fact.create("servicioLibros");
		
		servicio.setDbConfig(dbConfig);
		
		//-buscar		
		var libro1 = servicio.buscarPorId(1);
		System.out.println(libro1);
		
		LibroRec libro = LibroRec.builder()
				.id(1)
				.titulo("abc")
				.isbn("1111-11")
				.build();
		System.out.println(libro);
	}

}
