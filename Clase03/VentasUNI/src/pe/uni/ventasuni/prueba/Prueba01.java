package pe.uni.ventasuni.prueba;

import pe.uni.ventasuni.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		String[] categorias;
		// Proceso
		VentaService service = new VentaService();
		categorias = service.getCategorias();
		// Reporte
		for (String categoria : categorias) {
			System.out.println(categoria);
		}
	}
	
}
