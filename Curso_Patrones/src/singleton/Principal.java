package singleton;

import java.sql.SQLException;

import base.Productos;
import base.ProductosCrud;

public class Principal {

	public static void main(String[] args) throws SQLException {
//		ConexionBase.getConnection();

		Productos p = new Productos(1, "Azucar", "basicos", 100, 0.68);

		ProductosCrud c = new ProductosCrud();

		c.crear(p);
	}
}
