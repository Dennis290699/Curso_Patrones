package com.patrones.composite;

import java.util.ArrayList;
import java.util.List;

import com.patrones.composite.figuras.FiguraGeometrica;

public class Graficos implements FiguraGeometrica {

	private List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

	public void add(FiguraGeometrica f) {
		figuras.add(f);
	}

	public void remove(FiguraGeometrica f) {
		figuras.remove(f);
	}

	public void clear() {
		figuras.clear();
	}

	@Override
	public void draw() {
		for (FiguraGeometrica obj : figuras) {
			obj.draw();
		}

	}

}// FINAL CLASS
