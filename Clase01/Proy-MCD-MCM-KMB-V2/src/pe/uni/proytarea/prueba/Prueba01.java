package pe.uni.proytarea.prueba;

import pe.uni.proytarea.service.MCDService;
import pe.uni.proytarea.service.MCMService;

public class Prueba01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		int a = 20;
		int b = 15;

		MCDService svc1 = new MCDService();
		int x = svc1.MCD(a, b);
		System.out.println("" + x);

		MCMService svc2 = new MCMService();
		int y = svc2.MCM(a, b);

		System.out.println("" + y);

	}

}
