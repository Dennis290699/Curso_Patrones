package productos;

public class CongeladoPorAire extends ProductoCongelado {

	private double porcentajeNitrogeno;
	private double porcentajeOxigeno;
	private double porcentajeCO2;
	private double porcentajeVaporAgua;

	public CongeladoPorAire(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
			int temperaturaMantenimiento, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeCO2,
			double porcentajeVaporAgua) {
		super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen, temperaturaMantenimiento);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeCO2 = porcentajeCO2;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	public double getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	public void setPorcentajeNitrogeno(float porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	public double getporcentajeNitrogeno() {
		return porcentajeOxigeno;
	}

	public void setPorcentajeOxigeno(float porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	public double getPorcentajeCO2() {
		return porcentajeCO2;
	}

	public void setPorcentajeCO2(float porcentajeCO2) {
		this.porcentajeCO2 = porcentajeCO2;
	}

	public double getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(float porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	@Override
	public String toString() {
		return "Congelado por Aire: " + super.toString() + ", Porcentaje de Nitrogeno: " + porcentajeNitrogeno
				+ ", Porcentaje de Oxigeno: " + porcentajeOxigeno + ", Porcentaje de CO2: " + porcentajeCO2
				+ ", Porcentaje de Vapor de Agua: " + porcentajeVaporAgua;
	}

}// FINAL CLASS
