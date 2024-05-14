package productos;

public class ProductoFresco extends Producto {

	public ProductoFresco(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen) {
		super(numLote, fechaCaducidad, fechaEnvasado, paisOrigen);
	}

	@Override
	public String toString() {
		return "Producto Fresco: " + super.toString();
	}

}// FINAL CLASS
