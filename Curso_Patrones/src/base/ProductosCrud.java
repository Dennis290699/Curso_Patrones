package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import singleton.ConexionBase;

public class ProductosCrud {

	// CRUD create, read, update, delete
	private Connection connection;
	private PreparedStatement sentencia;
	private boolean estado;

	public boolean crear(Productos p) throws SQLException {
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

	public boolean actualizar(Productos p, int id) throws SQLException {
		String sql = null;
		estado = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);

			sql = "UPDATE Producto SET nombre = ?, tipo = ?, cantidad = ?, precio = ? WHERE id = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1, p.getNombre());
			sentencia.setString(2, p.getTipo());
			sentencia.setInt(3, p.getCantidad());
			sentencia.setDouble(4, p.getPrecio());
			sentencia.setInt(5, id);

			estado = sentencia.executeUpdate() > 0;
			connection.commit();
		} catch (SQLException e) {
			connection.rollback(); // REALIZA UN ROLLBACK EN CASO DE ERROR
			e.printStackTrace();
		} finally {
			connection.close();
			sentencia.close();
		}
		return estado;
	}

	public boolean eliminar(int id) throws SQLException {
		String sql = null;
		estado = false;
		connection = obtenerConexion();

		try {
			connection.setAutoCommit(false);

			sql = "DELETE FROM Producto WHERE ID = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, id);
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

	public List<Productos> leerProductos() throws SQLException {
		String sql = null;
		List<Productos> productosList = new ArrayList<>();
		connection = obtenerConexion();
		ResultSet resultado = null;

		try {
			sql = "SELECT * FROM Producto";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();

			while (resultado.next()) {
				Productos p = new Productos();
				p.setId(resultado.getInt(1));
				p.setNombre(resultado.getString(2));
				p.setTipo(resultado.getString(3));
				p.setCantidad(resultado.getInt(4));
				p.setPrecio(resultado.getDouble(5));
				productosList.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
			sentencia.close();
		}
		return productosList;
	}
	
	public Productos leerProductoId(int id) throws SQLException {
		String sql = null;
		estado = false;
		connection = obtenerConexion();
		
		ResultSet resultado = null;
		
		Productos p = new Productos();
		try {
			sql = "SELECT * FROM Producto WHERE id = ?";
			sentencia= connection.prepareStatement(sql);
			
			sentencia.setInt(1, id);
			
			resultado = sentencia.executeQuery();
			
			if(resultado.next()) {
				p.setId(resultado.getInt(1));
				p.setNombre(resultado.getString(2));
				p.setTipo(resultado.getString(3));
				p.setCantidad(resultado.getInt(4));
				p.setPrecio(resultado.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
			sentencia.close();
		}
		return p;
	}


	public Connection obtenerConexion() throws SQLException {
		return ConexionBase.getConnection();
	}

} // FINAL CLASS