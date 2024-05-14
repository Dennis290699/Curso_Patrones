package productos;

public class CongeladoPorNitrogeno extends ProductoCongelado {

	private String metodoCongelacion;
	private int tiempoExposicionNitrogeno;

	public CongeladoPorNitrogeno(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
			int temperaturaMantenimiento, String metodoCongelacion, int tiempoExposicionNitrogeno) {
		super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen, temperaturaMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int gettiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}

	public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	@Override
	public String toString() {
		return "Congelado por Nitrogeno: " + super.toString() + ", Metodo de Congelacion: " + metodoCongelacion
				+ ", Tiempo de Exposicion al Nitrogeno: " + tiempoExposicionNitrogeno + " segundos";
	}

}// FINAL CLASS
