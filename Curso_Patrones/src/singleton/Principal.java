package singleton;

import java.sql.SQLException;
import java.util.List;

import base.Productos;
import base.ProductosCrud;

public class Principal {

	public static void main(String[] args) throws SQLException {

//		ConexionBase.getConnection();

		// Creación de un nuevo producto para probar
		Productos p = new Productos(3, "Maiz", "basicos", 110, 0.98);

		// Creación de una instancia de ProductosCrud
		ProductosCrud c = new ProductosCrud();
		

//		c.crear(p);
		
//		c.actualizar(p, 6);
		
//		c.eliminar(8);
		
//		p = c.leerProducto(2);
//		System.out.println(p);

		// Llamada al método leerProductos para obtener todos los productos
		List<Productos> productosList = c.leerProductos();

		// Iterar sobre la lista de productos y mostrarlos en la consola
		for (Productos producto : productosList) {
			System.out.println(producto);
		}
	}

}// FINAL CLASS