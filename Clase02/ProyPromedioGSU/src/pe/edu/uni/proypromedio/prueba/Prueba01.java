package pe.edu.uni.proypromedio.prueba;

import pe.edu.uni.proypromedio.service.PromedioService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Datos
		int n1 = 12, n2 = 18, n3 = 16, n4 = 5;
		// Proceso
		PromedioService service = new PromedioService();
		int menor = service.menorNota(n1, n2, n3, n4);
		// Reporte
		System.out.println("Menor: " + menor);
	}
}
