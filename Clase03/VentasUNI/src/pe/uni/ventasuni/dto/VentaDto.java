package pe.uni.ventasuni.dto;

/**
 * 
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class VentaDto {

	private String categoria;
	private String producto;
	private double precio;
	private int cantidad;
	private double importe;

	public VentaDto() {
	}

	public VentaDto(String categoria, String producto, double precio, int cantidad, double importe) {
		this.categoria = categoria;
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

}
