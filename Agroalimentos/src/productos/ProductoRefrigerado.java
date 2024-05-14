package productos;

public class ProductoRefrigerado extends Producto {

	private int codigoOrganismoSupervisionAlimentaria;
	private int temperaturaMantenimiento;

	public ProductoRefrigerado(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
			int codigoOrganismoSupervisionAlimentaria, int temperaturaRecomendada) {
		super(numLote, fechaCaducidad, fechaEnvasado, paisOrigen);
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
		this.temperaturaMantenimiento = temperaturaRecomendada;
	}

	public int getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}

	public void setCodigoOrganismoSupervisionAlimentaria(int codigoOrganismoSupervisionAlimentaria) {
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	public int getTemperaturaRecomendada() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaRecomendada(int temperaturaRecomendada) {
		this.temperaturaMantenimiento = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return "Producto Refrigerado: " + super.toString() + ", Temperatura de mantenimiento: "
				+ temperaturaMantenimiento + "C";
	}

}// FINAL CLASS
