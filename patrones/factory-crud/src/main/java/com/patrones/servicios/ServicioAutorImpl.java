package com.patrones.servicios;

import com.patrones.DbConfig;
import com.patrones.db.Autor;
import com.patrones.db.LibroConAutor;
import com.patrones.db.LibroRec;
import com.patrones.factory.anotaciones.MiComponente;

@MiComponente(name = "servicioAutores", singleton = true)
public class ServicioAutorImpl implements ServicioAutor {

    private DbConfig dbConfig;

    public void setDbConfig(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @Override
    public Autor buscarporId(Integer id) {
        try (var con = dbConfig.getConnection()) {
            var pstmt = con.prepareStatement("SELECT * FROM autor WHERE id=?");
            pstmt.setInt(1, id);
            var rs = pstmt.executeQuery();

            if (rs.next()) {
                return Autor.builder()
                        .id(rs.getInt("id"))
                        .nombre(rs.getString("nombre"))
                        .build();
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public LibroConAutor buscarLibroConAutorPorId(Integer id) {
        try (var con = dbConfig.getConnection()) {
            var libroStmt = con.prepareStatement("SELECT * FROM libros WHERE id=?");
            libroStmt.setInt(1, id);
            var libroRs = libroStmt.executeQuery();

            if (libroRs.next()) {
                var libro = LibroRec.builder()
                        .id(libroRs.getInt("id"))
                        .titulo(libroRs.getString("titulo"))
                        .isbn(libroRs.getString("isbn"))
                        .autor_id(libroRs.getInt("autor_id"))
                        .build();

                var autorStmt = con.prepareStatement("SELECT * FROM autor WHERE id=?");
                autorStmt.setInt(1, libro.autor_id());
                var autorRs = autorStmt.executeQuery();

                if (autorRs.next()) {
                    var autor = Autor.builder()
                            .id(autorRs.getInt("id"))
                            .nombre(autorRs.getString("nombre"))
                            .build();

                    return new LibroConAutor(libro, autor);
                }
            }
            return null;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        // Suponiendo que dbConfig está configurado correctamente
        DbConfig dbConfig = new DbConfig();
        ServicioAutorImpl servicio = new ServicioAutorImpl();
        servicio.setDbConfig(dbConfig);

        Autor autor = servicio.buscarporId(1);
        System.out.println(autor);

        LibroConAutor libroConAutor = servicio.buscarLibroConAutorPorId(1);
        System.out.println(libroConAutor);
    }
}
