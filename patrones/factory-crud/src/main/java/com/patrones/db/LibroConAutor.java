package com.patrones.db;

public class LibroConAutor {
    private LibroRec libro;
    private Autor autor;

    public LibroConAutor(LibroRec libro, Autor autor) {
        this.libro = libro;
        this.autor = autor;
    }

    public LibroRec getLibro() {
        return libro;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "LibroConAutor{" +
                "libro=" + libro +
                ", autor=" + autor +
                '}';
    }
}
