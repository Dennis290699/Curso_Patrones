package app;

import modelo.ProductoFactoryImpl;
import productos.Producto;
import productos.Tipo;

public class Principal {

	public static void main(String[] args) {
		ProductoFactoryImpl fact = new ProductoFactoryImpl();
		
		Producto prod = fact.crearProducto(Tipo.POR_AIRE);
		 System.out.println(prod.toString());
	}
}//FINAL CLASS
