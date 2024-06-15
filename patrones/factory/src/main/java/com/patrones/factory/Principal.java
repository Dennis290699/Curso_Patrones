package com.patrones.factory;

//import com.patrones.factory.ejemplo.Computadora;

//public class Principal {
//
//	public static void main(String[] args) throws Exception {
//		
//		/*
//		 * Factory fact = new FactoryImpl();
//		 * 
//		 * fact.init();
//		 * 
//		 * Computadora pc = fact.create("server"); Computadora server =
//		 * fact.create("pc"); Computadora laptop = fact.create("laptop");
//		 * 
//		 * System.out.println(pc); System.out.println(server);
//		 * System.out.println(laptop);
//		 */
//		
////		Map<String, Class> componentes = new HashMap<String, Class>();
////		
////		//--listar clases en un programa JAVA
////		System.out.println();
////		System.out.println("Listar clases");
////		ClassPath classPath = ClassPath.from(Principal.class.getClassLoader()); // acceso al classpath
////		
////		//ImmutableSet<ClassInfo>
////		var classes = classPath.getTopLevelClassesRecursive("com.patrones.factory");
////		
////		for(var it:classes) {
////			var miComp = it.load().getAnnotation(MiComponente.class);
////			if(miComp!=null) {
////				//String name = it.getName();
////				//System.out.println(name);
////				componentes.put(miComp.name(),  it.load());
////			}
////		}
////		
////		for(var it:componentes.entrySet()) {
////			System.out.printf("%s-->%s\n", it.getKey(), it.getValue());
////		}
////		
////		//--verificar si la clase tiene la marca
////		System.out.println();
////		System.out.println("Verificar marca/anotacion");
////		
////		MiComponente miComp = FactoryImpl.class.getAnnotation(MiComponente.class);
////		
////		if(miComp!=null) {
////			System.out.println(miComp.name());
////		}
////		
////		//--crear una instancia sin NEW
////		LaptopComputadora obj = new LaptopComputadora(); // tradicional
////		
////		var cto = LaptopComputadora.class.getConstructor(); // dinamica
////		LaptopComputadora instancia = cto.newInstance();
//	}
//
//}
