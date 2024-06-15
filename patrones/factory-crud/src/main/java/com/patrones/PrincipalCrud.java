package com.patrones;

import java.util.List;

import com.patrones.db.Libro;
import com.patrones.factory.Factory;
import com.patrones.factory.FactoryImpl;
import com.patrones.servicios.ServicioLibros;

public class PrincipalCrud {

    public static void main(String[] args) throws Exception {

        Factory fact = new FactoryImpl();
        fact.init("com.patrones");
        
        //-- Inicializar configuración de la base de datos y el servicio de libros
        DbConfig dbConfig = fact.create("dbConfig");
        ServicioLibros servicio = fact.create("servicioLibros");
        
        servicio.setDbConfig(dbConfig);
        
//        //-- CREAR NUEVO ELEMENTO
//      Libro nuevoLibro = new Libro();
//      nuevoLibro.setId(3); // Ingreso de ID a crear
//      nuevoLibro.setTitulo("Libro3");
//      nuevoLibro.setIsbn("33-3333");
//        
//      servicio.crear(nuevoLibro);
//      System.out.println("Nuevo libro creado con ID: " + nuevoLibro.getId());
        
  
//        //-- LISTAR TODOS LOS ELEMENTOS
//      List<Libro> libros = servicio.listarTodos();
//      for (Libro libro : libros) {
//          System.out.println(libro.getId() + " - " + libro.getTitulo() + " - " + libro.getIsbn());
//      }
         
        
//      //-- BUSCAR POR ID
//        Libro libro = servicio.buscarPorId(3); // Ingreso de ID a buscar
//        System.out.println("Libro encontrado: " + libro.getTitulo() + ", " + libro.getIsbn());

        
//      //-- ACTUALIZAR
//        Libro libroActualizado = new Libro();
//        libroActualizado.setId(3); // Ingreso de ID a modificar
//        libroActualizado.setTitulo("Libro2 Actualizado");
//        libroActualizado.setIsbn("22-2222 Actualizado");
//
//        servicio.actualizar(libroActualizado);
//        System.out.println("Elemento actualizado correctamente.");

        
//      //-- ELIMINAR POR ID
//        servicio.eliminarPorId(3); // Ingreso de ID a eliminar
//        System.out.println("Elemento eliminado correctamente.");
    }
}