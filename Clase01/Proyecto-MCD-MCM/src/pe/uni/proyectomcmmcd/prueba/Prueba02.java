package pe.uni.proyectomcmmcd.prueba;

import pe.uni.proyectomcmmcd.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Prueba02 {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 20;
		//proceso
		MateService service = new MateService();
		int mcd = service.mcd(n1, n2);
		//reporte
		System.out.println("N1: " + n1);
		System.out.println("N2: " + n2);
		System.out.println("MCD: " + mcd);
	}
}
