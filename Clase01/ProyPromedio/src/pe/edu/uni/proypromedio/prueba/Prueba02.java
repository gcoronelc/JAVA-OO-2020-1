package pe.edu.uni.proypromedio.prueba;

import pe.edu.uni.proypromedio.service.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Datos
		int n1=12, n2=13, n3=14, n4=15;
		// Proceso
		PromedioService service = new PromedioService();
		int prom = service.promedio(n1, n2, n3, n4);
		// Reporte
		System.out.println("Promedio: " + prom);
	}
	
}
