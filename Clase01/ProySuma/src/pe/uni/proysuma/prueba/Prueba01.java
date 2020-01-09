package pe.uni.proysuma.prueba;

import pe.uni.proysuma.service.SumaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba01 {

	public static void main(String[] args) {
		// Datos
		int n1 = 16;
		int n2 = 18;
		// Proceso
		SumaService service = new SumaService();
		int suma = service.sumar(n1, n2);
		// Reporte
		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);
		System.out.println("Suma: " + suma);
	}
	
}
