package com.patrones.composite.figuras;

import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.lwjgl.opengl.GL11;

public record Triangulo(float x1, float y1, float x2, float y2, float x3, float y3) implements FiguraGeometrica {

	@Override
	public void draw() {
//		System.out.println("Triangulo");
		GL11.glColor3f(0, 1, 0); // VERDE
		glBegin(GL_TRIANGLES);
		{
			glVertex2f(x1, y1); // Vertex 1
			glVertex2f(x2, y2); // Vertex 2
			glVertex2f(x3, y3); // Vertex 3
		}
		glEnd();
	}

}// FINAL CLASS
