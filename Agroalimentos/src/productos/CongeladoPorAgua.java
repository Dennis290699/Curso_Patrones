package productos;

public class CongeladoPorAgua extends ProductoCongelado {

	private float salinidadAgua;

	public CongeladoPorAgua(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento, float salinidadAgua) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen, temperaturaMantenimiento);
		this.salinidadAgua = salinidadAgua;
	}

	public float getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(float salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return "Congelado por Agua: " + super.toString() + ", Salinidad del Agua: " + salinidadAgua
				+ " gramos por litro";
	}
}// FINAL CLASS
