package productos;

public abstract class Producto {

	private String fechaEnvasado;
	private String fechaCaducidad;
	private int numLote;
	private String paisOrigen;

	public Producto(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen) {
		this.fechaEnvasado = fechaEnvasado;
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Fecha de envasado: " + fechaEnvasado + ", Fecha de caducidad: " + fechaCaducidad + ", Número de lote: "
				+ numLote + ", País de origen: " + paisOrigen;
	}

}// FINAL CLASS
