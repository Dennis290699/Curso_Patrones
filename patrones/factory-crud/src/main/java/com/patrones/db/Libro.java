package com.patrones.db;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Libro {
	private Integer id;
	private String titulo;
	private String isbn;
	
}
