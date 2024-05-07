package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import singleton.ConexionBase;

public class ProductosCrud {

	// CRUD create, read, update, delete
	private Connection connection;
	private PreparedStatement sentencia;
	private boolean estado;

	public boolean crear(Productos p) throws SQLException {
		// values('Cola', 'Gaseosa', 3, 1.75)
		String sql = null;
		estado = false;
		connection = obtenerConexion();
		try {
			connection.setAutoCommit(false);
			sql = "INSERT INTO Producto (nombre, tipo, cantidad, precio) values (?,?,?,?)";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1, p.getNombre());
			sentencia.setString(2, p.getTipo());
			sentencia.setInt(3, p.getCantidad());
			sentencia.setDouble(4, p.getPrecio());
			estado = sentencia.executeUpdate() > 0;
			connection.commit();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();

		} finally {
			connection.close();
			sentencia.close();
		}
		return estado;

	}

	public Connection obtenerConexion() throws SQLException {
		return ConexionBase.getConnection();
	}

} // FINAL CLASS
