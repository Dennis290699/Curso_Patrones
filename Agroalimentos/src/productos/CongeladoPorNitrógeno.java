package productos;

public class CongeladoPorNitr�geno extends ProductoCongelado {

	private String metodoCongelacion;
	private int tiempoExposicionNitr�geno;

	public CongeladoPorNitr�geno(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento, String metodoCongelacion, int tiempoExposicionNitr�geno) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen, temperaturaMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitr�geno = tiempoExposicionNitr�geno;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTiempoExposicionNitr�geno() {
		return tiempoExposicionNitr�geno;
	}

	public void setTiempoExposicionNitr�geno(int tiempoExposicionNitr�geno) {
		this.tiempoExposicionNitr�geno = tiempoExposicionNitr�geno;
	}

	@Override
	public String toString() {
		return "Congelado por Nitr�geno: " + super.toString() + ", M�todo de Congelaci�n: " + metodoCongelacion
				+ ", Tiempo de Exposici�n al Nitr�geno: " + tiempoExposicionNitr�geno + " segundos";
	}

}// FINAL CLASS
