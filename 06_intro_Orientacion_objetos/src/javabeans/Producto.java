package javabeans;

public class Producto {

	private int idProducto;
	private String descripcion;
	private double precioUnitartio;
	private String familia;
	
	public Producto() {
		
	}

	public Producto(int idProducto, String descripcion, double precioUnitartio, String familia) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioUnitartio = precioUnitartio;
		this.familia = familia;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitartio() {
		return precioUnitartio;
	}

	public void setPrecioUnitartio(double precioUnitartio) {
		this.precioUnitartio = precioUnitartio;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnitartio="
				+ precioUnitartio + ", familia=" + familia + "]";
	}
	
	
	/*
	 * 	metodos responsablidad de la clase
	 */
	
	
}
