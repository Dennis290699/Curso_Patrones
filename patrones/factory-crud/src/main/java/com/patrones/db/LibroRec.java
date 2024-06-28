package com.patrones.db;

public record LibroRec(Integer id, String titulo, String isbn) {

	public static Builder builder() {
		return new Builder();
	}
	// DATOS SOLO DE LECTURA
	public static class Builder {
		// asociacion de una clase interna
		private Integer id;
		private String titulo;
		private String isbn;

//		UTILITARIA
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

//		FACTORY
		public LibroRec build() {
			return new LibroRec(id, titulo, isbn);
		}
	}

	public static void main(String[] args) {

		LibroRec.Builder builder = new Builder();
		builder.id(1).titulo("Titulo1").isbn("isbn1");

		LibroRec lb = LibroRec.builder().titulo("Titulo 1")
//				.id(1)
				.isbn("isbn1").build();

		System.out.println(lb);

//		// --
//		StringBuilder sb = new StringBuilder();
//		sb.append("hola").append("mundo");
//
//		// --
//
//		Stream.of(1, 2, 3, 4, 5).filter(t -> t % 2 == 0).map(t -> t * 2).forEach(System.out::println);
	}

} // FINAL CLASS
