package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SingletonConexion {

	private static SingletonConexion instancia = null;
	private Properties p;

	private SingletonConexion() {
		p = new Properties();
		try {
			p.load(new FileInputStream(new File("src/singleton/bases.properties")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SingletonConexion getInstancia() {
		if (instancia == null) {
			instancia = new SingletonConexion();
			System.out.println("Se ha creado la instancia");
		} else {
			System.out.println("Se ha devuelto la instancia");
		}
		return instancia;
	}

	public String getProperties(String clave) {
		return p.getProperty(clave);
	}

} // FINAL CLASS
