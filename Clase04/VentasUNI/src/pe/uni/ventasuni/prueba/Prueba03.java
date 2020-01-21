package pe.uni.ventasuni.prueba;

import java.util.List;
import pe.uni.ventasuni.dto.VentaDto;
import pe.uni.ventasuni.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {

	public static void main(String[] args) {
		// Variables
		List<VentaDto> lista;
		String categoria;
		VentaService service = new VentaService();
		// Dato
		//categoria = "TODOS";
		categoria = service.getCategorias()[2];
		// Proceso
		lista = service.getVentas(categoria);
		// Reporte
		System.out.println("CATEGORIA: " + categoria);
		for (VentaDto dto : lista) {
			System.out.println(dto.getProducto() + " - " + dto.getImporte());
		}
	}
	
}
