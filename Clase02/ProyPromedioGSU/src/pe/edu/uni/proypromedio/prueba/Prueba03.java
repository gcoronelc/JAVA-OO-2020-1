package pe.edu.uni.proypromedio.prueba;

import pe.edu.uni.proypromedio.service.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		// Datos
		int nota = 10;
		// Proceso
		PromedioService service = new PromedioService();
		String estado = service.condicion(nota);
		// Reporte
		System.out.println("Condición: " + estado);
	}

}
