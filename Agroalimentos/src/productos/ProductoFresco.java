package productos;

public class ProductoFresco extends Producto {

	public ProductoFresco(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen);
	}

	@Override
	public String toString() {
		return "Producto Fresco: " + super.toString();
	}

}// FINAL CLASS
