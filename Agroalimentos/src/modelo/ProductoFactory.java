package modelo;

import productos.Producto;
import productos.Tipo;

public interface ProductoFactory {

	Producto crearProducto (Tipo tipoProduct);
	
}//FINAL CLASS
