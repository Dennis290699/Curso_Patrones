package com.patrones.db;

public record LibroRec(Integer id, String titulo, String isbn, Integer autor_id) {

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private Integer id;
		private String titulo;
		private String isbn;
		private Integer autor_id;

		Builder() {
		}

		public Builder id(Integer id) {
			this.id = id;
			return this;
		}

		public Builder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}

		public Builder isbn(String isbn) {
			this.isbn = isbn;
			return this;
		}

		public Builder autor_id(Integer autor_id) {
			this.autor_id = autor_id;
			return this;
		}

		public LibroRec build() {
			return new LibroRec(id, titulo, isbn, autor_id);
		}
	}
	
	public static void main(String[] args) {
	    LibroRec.Builder builder = new Builder();
	    builder.id(1).titulo("Titulo1").isbn("isbn1");

	    LibroRec lb = LibroRec.builder().titulo("Titulo 1")
	            .isbn("isbn1").build();

	    System.out.println(lb);
	}

}// FINAL CLASS