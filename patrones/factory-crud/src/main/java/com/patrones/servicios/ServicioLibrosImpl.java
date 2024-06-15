package com.patrones.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.patrones.DbConfig;
import com.patrones.db.Libro;
import com.patrones.factory.anotaciones.MiComponente;

@MiComponente(name = "servicioLibros", singleton = true)
public class ServicioLibrosImpl implements ServicioLibros {

    private DbConfig dbConfig;

    @Override
    public void setDbConfig(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @Override
    public Libro buscarPorId(Integer id) {
        try (Connection con = dbConfig.getConnection()) {
            String sql = "SELECT * FROM libros WHERE id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        Libro ret = new Libro();
                        ret.setId(rs.getInt("id"));
                        ret.setTitulo(rs.getString("titulo"));
                        ret.setIsbn(rs.getString("isbn"));
                        return ret;
                    }
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    @Override
    public void crear(Libro obj) {
        try (Connection con = dbConfig.getConnection()) {
            String sql = "INSERT INTO libros (id, titulo, isbn) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, obj.getId());
                pstmt.setString(2, obj.getTitulo());
                pstmt.setString(3, obj.getIsbn());
                pstmt.executeUpdate();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<Libro> listarTodos() {
        List<Libro> libros = new ArrayList<>();
        try (Connection con = dbConfig.getConnection()) {
            String sql = "SELECT * FROM libros";
            try (PreparedStatement pstmt = con.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Libro libro = new Libro();
                    libro.setId(rs.getInt("id"));
                    libro.setTitulo(rs.getString("titulo"));
                    libro.setIsbn(rs.getString("isbn"));
                    libros.add(libro);
                }
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return libros;
    }

    @Override
    public void actualizar(Libro obj) {
        try (Connection con = dbConfig.getConnection()) {
            String sql = "UPDATE libros SET titulo = ?, isbn = ? WHERE id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, obj.getTitulo());
                pstmt.setString(2, obj.getIsbn());
                pstmt.setInt(3, obj.getId());
                pstmt.executeUpdate();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void eliminarPorId(Integer id) {
        try (Connection con = dbConfig.getConnection()) {
            String sql = "DELETE FROM libros WHERE id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
