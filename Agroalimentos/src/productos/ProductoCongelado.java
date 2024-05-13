package productos;

public class ProductoCongelado extends Producto {

	private String temperaturaMantenimiento;

	public ProductoCongelado(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			String temperaturaMantenimiento) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen);
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	public String getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(String temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return "Producto Congelado: " + super.toString() + ", Temperatura de mantenimiento: " + temperaturaMantenimiento
				+ "°C";
	}

}// FINAL CLASS
