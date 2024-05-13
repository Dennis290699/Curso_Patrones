package productos;

public class CongeladoPorAire extends ProductoCongelado {

	private float porcentajeNitr�geno;
	private float porcentajeOx�geno;
	private float porcentajeCO2;
	private float porcentajeVaporAgua;

	public CongeladoPorAire(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento, float porcentajeNitr�geno, float porcentajeOx�geno, float porcentajeCO2,
			float porcentajeVaporAgua) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen, temperaturaMantenimiento);
		this.porcentajeNitr�geno = porcentajeNitr�geno;
		this.porcentajeOx�geno = porcentajeOx�geno;
		this.porcentajeCO2 = porcentajeCO2;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	public float getPorcentajeNitr�geno() {
		return porcentajeNitr�geno;
	}

	public void setPorcentajeNitr�geno(float porcentajeNitr�geno) {
		this.porcentajeNitr�geno = porcentajeNitr�geno;
	}

	public float getPorcentajeOx�geno() {
		return porcentajeOx�geno;
	}

	public void setPorcentajeOx�geno(float porcentajeOx�geno) {
		this.porcentajeOx�geno = porcentajeOx�geno;
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
		return "Congelado por Aire: " + super.toString() + ", Porcentaje de Nitr�geno: " + porcentajeNitr�geno
				+ ", Porcentaje de Ox�geno: " + porcentajeOx�geno + ", Porcentaje de CO2: " + porcentajeCO2
				+ ", Porcentaje de Vapor de Agua: " + porcentajeVaporAgua;
	}

}// FINAL CLASS
