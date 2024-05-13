package productos;

public class ProductoRefrigerado extends Producto {

	private int codigoOrganismoSupervisionAlimentaria;
	private String temperaturaMantenimiento;

	public ProductoRefrigerado(String fechaEnvasado, String fechaCaducidad, int numLote, String paisOrigen,
			int codigoOrganismoSupervisionAlimentaria, String temperaturaRecomendada) {
		super(fechaEnvasado, fechaCaducidad, numLote, paisOrigen);
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
		this.temperaturaMantenimiento = temperaturaRecomendada;
	}

	public int getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}

	public void setCodigoOrganismoSupervisionAlimentaria(int codigoOrganismoSupervisionAlimentaria) {
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	public String getTemperaturaRecomendada() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaMantenimiento = temperaturaRecomendada;
	}

	@Override
	public String toString() {
		return "Producto Refrigerado: " + super.toString() + ", Temperatura de mantenimiento: "
				+ temperaturaMantenimiento + "°C";
	}

}// FINAL CLASS
