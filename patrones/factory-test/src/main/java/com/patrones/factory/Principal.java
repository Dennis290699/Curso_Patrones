package com.patrones.factory;

import com.patrones.factory.ejemplo.Computadora;

public class Principal {

	public static void main(String[] args) {

		Factory fact = new FactoryImpl();

		fact.init("com.patrones.factory");

		Computadora server1 = fact.create("server");
		Computadora server2 = fact.create("server");

		Computadora pc = fact.create("pc");
		Computadora laptop = fact.create("laptop");
		
		Computadora xy = fact.create("xyz");

		System.out.println(pc);
		System.out.println(server1);
		System.out.println(server2);
		System.out.println(laptop);
		System.out.println(xy);
	}
}
