package productos;

public class CongeladoPorAire extends ProductoCongelado {

	private float porcentajeNitrógeno;
	private float porcentajeOxígeno;
	private float porcentajeCO2;
	private float porcentajeVaporAgua;

	public CongeladoPorAire(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento, float porcentajeNitrógeno, float porcentajeOxígeno, float porcentajeCO2,
			float porcentajeVaporAgua) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen, temperaturaMantenimiento);
		this.porcentajeNitrógeno = porcentajeNitrógeno;
		this.porcentajeOxígeno = porcentajeOxígeno;
		this.porcentajeCO2 = porcentajeCO2;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	public float getPorcentajeNitrógeno() {
		return porcentajeNitrógeno;
	}

	public void setPorcentajeNitrógeno(float porcentajeNitrógeno) {
		this.porcentajeNitrógeno = porcentajeNitrógeno;
	}

	public float getPorcentajeOxígeno() {
		return porcentajeOxígeno;
	}

	public void setPorcentajeOxígeno(float porcentajeOxígeno) {
		this.porcentajeOxígeno = porcentajeOxígeno;
	}

	public float getPorcentajeCO2() {
		return porcentajeCO2;
	}

	public void setPorcentajeCO2(float porcentajeCO2) {
		this.porcentajeCO2 = porcentajeCO2;
	}

	public float getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(float porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	@Override
	public String toString() {
		return "Congelado por Aire: " + super.toString() + ", Porcentaje de Nitrógeno: " + porcentajeNitrógeno
				+ ", Porcentaje de Oxígeno: " + porcentajeOxígeno + ", Porcentaje de CO2: " + porcentajeCO2
				+ ", Porcentaje de Vapor de Agua: " + porcentajeVaporAgua;
	}

}// FINAL CLASS
