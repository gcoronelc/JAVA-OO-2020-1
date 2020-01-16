package pe.uni.ventasuni.prueba;

import java.util.List;
import pe.uni.ventasuni.dto.ProductoDto;
import pe.uni.ventasuni.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Variables
		List<ProductoDto> productos;
		// Proceso
		VentaService service = new VentaService();
		productos = service.getProductos(service.getCategorias()[2]);
		// Reporte
		for (ProductoDto dto : productos) {
			System.out.println(dto.getProducto() + " - " + dto.getPrecio());
		}
	}
	
}
