package productos;

public class CongeladoPorAgua extends ProductoCongelado {

	private double salinidadAgua;

	public CongeladoPorAgua(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
			int temperaturaMantenimiento, double salinidadAgua) {
		super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen, temperaturaMantenimiento);
		this.salinidadAgua = salinidadAgua;
	}

	public double getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(double salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return "Congelado por Agua: " + super.toString() + ", Salinidad del Agua: " + salinidadAgua
				+ " gramos por litro";
	}
}// FINAL CLASS
