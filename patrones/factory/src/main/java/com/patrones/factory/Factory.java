package com.patrones.factory;

public interface Factory {
	public void init(String pkgName);
	public <T> T create(String name);

}
