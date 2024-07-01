package com.patrones.servicios;

import java.util.List;

import com.patrones.DbConfig;
import com.patrones.db.Libro;
import com.patrones.db.LibroRec;
import com.patrones.factory.anotaciones.MiComponente;

@MiComponente(name = "servicioLibros", singleton = true)
public class ServicioLibrosImpl implements ServicioLibros {

	private DbConfig dbConfig;

	public void setDbConfig(DbConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

	@Override
	public LibroRec buscarPorId(Integer id) {
		try( var con = dbConfig.getConnection() ) {
			var pstmt = con.prepareStatement("select * from libros where id=?");
			
			pstmt.setInt(1, id);
			
			var rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				return LibroRec.builder()
						.id(rs.getInt("id"))
						.titulo(rs.getString("titulo"))
						.isbn(rs.getString("isbn"))
						.autor_id(rs.getInt("autor_id")).build();
			}

			return null;
		} 
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void crear(Libro obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Libro> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Libro obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
