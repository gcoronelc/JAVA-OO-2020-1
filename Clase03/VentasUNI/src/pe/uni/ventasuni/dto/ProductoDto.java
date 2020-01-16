package pe.uni.ventasuni.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class ProductoDto {

	private String categoria;
	private String producto;
	private double precio;

	// Constructor por defecto
	public ProductoDto() {
	}

	// Constructor adicional
	public ProductoDto(String categoria, String producto, double precio) {
		this.categoria = categoria;
		this.producto = producto;
		this.precio = precio;
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

}
