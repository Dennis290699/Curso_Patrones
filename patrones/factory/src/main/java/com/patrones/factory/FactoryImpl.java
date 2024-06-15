package com.patrones.factory;

import java.util.HashMap;
import java.util.Map;

import com.google.common.reflect.ClassPath;
import com.patrones.factory.anotaciones.MiComponente;

public class FactoryImpl implements Factory {

	/**
	 * ("laptop", LaptopComputadora.class)
	 * ("pc", PcComputadora.class)
	 */
	private Map<String, Class> componentes = new HashMap<String, Class>();
	
	/**
	 * ("laptop", new LaptopComputadora())
	 * ("pc", new PcComputadora())
	 */
	private Map<String, Object> singleton = new HashMap<String, Object>();

	public void init(String pkgName) {
		try {
			ClassPath classPath = ClassPath.from(FactoryImpl.class.getClassLoader()); // acceso al classpath

			var classes = classPath.getTopLevelClassesRecursive(pkgName);

			for (var it : classes) {
				var miComp = it.load().getAnnotation(MiComponente.class);
				
				if (miComp != null) {
					var cls = it.load();
					
					componentes.put(miComp.name(), cls);

					if(miComp.singleton()) {
						// registrar en el map 'singleton'
						var cto = cls.getConstructor();
						Object obj = cto.newInstance();
						
						singleton.put(miComp.name(), obj);
					}
				}
			}
			
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public <T> T create(String name) {
		
		if(singleton.containsKey(name)) {
			return (T )singleton.get(name);
		}

		var value = componentes.get(name);

		if (value == null) {
			throw new RuntimeException("Componente " + name + " no registrado.");
		}

		try {
			var cto = value.getConstructor();
			Object obj = cto.newInstance();
			
			return (T )obj;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}

