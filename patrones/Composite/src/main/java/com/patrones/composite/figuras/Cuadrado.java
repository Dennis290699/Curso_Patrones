package com.patrones.composite.figuras;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.lwjgl.opengl.GL11;

public record Cuadrado(float x, float y, float size) implements FiguraGeometrica {

	@Override
	public void draw() {
		GL11.glColor3f(0, 0, 1); // AZUL
		glBegin(GL_QUADS);
		{
			glVertex2f(x, y); // Vertex 1
			glVertex2f(x + size, y); // Vertex 2
			glVertex2f(x + size, y + size); // Vertex 3
			glVertex2f(x, y + size); // Vertex 4
		}
		glEnd();
	}

}// FINAL CLASS