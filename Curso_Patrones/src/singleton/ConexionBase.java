package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

public class ConexionBase {

	private static DataSource dataSource =null;
	
	public static Connection getConnection() {
		SingletonConexion conexion = SingletonConexion.getInstancia();
		
		String url = conexion.getProperties("url");
		String usuario = conexion.getProperties("usuario");
		String contraseña = conexion.getProperties("password");
		
		Connection connection = null;
		
		if (connection == null) {
			try {
				
				try {
					Class.forName(conexion.getProperties("drive"));
					System.out.println("Se registro correctamente el driver");
				} catch (ClassNotFoundException e) {
					System.out.println("No se registro correctamente el driver");
				}
				
				connection =DriverManager.getConnection(url, usuario, contraseña);
				boolean valid = connection.isValid(5000);
				System.out.println(valid ? "Conexion realizada OK" : "Conexion Fallida");
			} catch (java.sql.SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
} //FINAL CLASS