package base;

public class Productos {

	private int id;
	private String nombre;
	private String tipo;
	private int cantidad;
	private double precio;

	public Productos() {

	}

	public Productos(int id, String nombre, String tipo, int cantidad, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id)
		.append("nom: ")
		.append(nombre)
		.append("tipo: ")
		.append(tipo)
		.append("cantidad: ")
		.append(cantidad)
		.append("Precio: ")
		.append(precio);
		
		return sb.toString();
	}

} //FINAL CLASS
