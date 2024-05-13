package productos;

public class CongeladoPorNitrógeno extends ProductoCongelado {

	private String metodoCongelacion;
	private int tiempoExposicionNitrógeno;

	public CongeladoPorNitrógeno(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento, String metodoCongelacion, int tiempoExposicionNitrógeno) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen, temperaturaMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitrógeno = tiempoExposicionNitrógeno;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public int getTiempoExposicionNitrógeno() {
		return tiempoExposicionNitrógeno;
	}

	public void setTiempoExposicionNitrógeno(int tiempoExposicionNitrógeno) {
		this.tiempoExposicionNitrógeno = tiempoExposicionNitrógeno;
	}

	@Override
	public String toString() {
		return "Congelado por Nitrógeno: " + super.toString() + ", Método de Congelación: " + metodoCongelacion
				+ ", Tiempo de Exposición al Nitrógeno: " + tiempoExposicionNitrógeno + " segundos";
	}

}// FINAL CLASS
