package com.patrones.db;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Autor {
    private Integer id;
    private String nombre;

    // Método builder manual si no estás usando Lombok
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer id;
        private String nombre;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Autor build() {
            return new Autor(id, nombre);
        }
    }

    // Constructor
    public Autor(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
