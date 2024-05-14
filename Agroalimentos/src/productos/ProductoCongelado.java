package productos;

public class ProductoCongelado extends Producto {

	private int temperaturaMantenimiento;

	public ProductoCongelado(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
			int temperaturaMantenimiento) {
		super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen);
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	public int getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(int temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return "Producto Congelado: " + super.toString() + ", Temperatura de mantenimiento: " + temperaturaMantenimiento
				+ "C";
	}

}// FINAL CLASS
