package modelo;

import java.util.Scanner;

import productos.CongeladoPorAgua;
import productos.CongeladoPorAire;
import productos.CongeladoPorNitrogeno;
import productos.Producto;
import productos.ProductoFresco;
import productos.ProductoRefrigerado;
import productos.Tipo;

public class ProductoFactoryImpl implements ProductoFactory {

	private Scanner tec = new Scanner(System.in);

	@Override
	public Producto crearProducto(Tipo tipoProduct) {

		switch (tipoProduct) {
		case POR_AIRE:
			return new CongeladoPorAire(leerInt("Numero Lote: "), leerString("Fecha Envasado: "),
					leerString("Fecha Caducidad: "), leerString("Pais de origen: "),
					leerInt("Temperatura mantenimiento: "), leerDouble("% Nitrogeno: "), leerDouble("% Oxigeno: "),
					leerDouble("% CO2: "), leerDouble("% Vapor Agua: "));
		case POR_AGUA:
			return new CongeladoPorAgua(leerInt("Numero Lote: "), leerString("Fecha Envasado: "),
					leerString("Fecha Caducidad: "), leerString("Pais de origen: "),
					leerInt("Temperatura mantenimiento: "), leerDouble("Salinidad Agua: "));
		case POR_NITROGENO:
			return new CongeladoPorNitrogeno(leerInt("Numero Lote: "), leerString("Fecha Envasado: "),
					leerString("Fecha Caducidad: "), leerString("Pais de origen: "),
					leerInt("Temperatura mantenimiento: "), leerString("Metodo Congelacion: "),
					leerInt("Tiempo exposicion Nitrogeno: "));
		case PRODUCTO_FRESCO:
			return new ProductoFresco(leerInt("Numero Lote: "), leerString("Fecha Envasado: "),
					leerString("Fecha Caducidad: "), leerString("Pais de origen: "));
		case PRODUCTO_REFRIGERADO:
			return new ProductoRefrigerado(leerInt("Numero Lote: "), leerString("Fecha Envasado: "),
					leerString("Fecha Caducidad: "), leerString("Pais de origen: "),
					leerInt("Codigo Organismo Supervision Alimentaria: "), leerInt("Temperatura Recomendada: "));
		}
		return null;
	}

	private int leerInt(String tipo) {
		System.out.println("Ingrese " + tipo);
		return tec.nextInt();
	}

	private double leerDouble(String tipo) {
		System.out.println("Ingrese " + tipo);
		return tec.nextDouble();
	}

	private String leerString(String tipo) {
		System.out.println("Ingrese " + tipo);
		return tec.next();
	}

}// FINAL CLASS
