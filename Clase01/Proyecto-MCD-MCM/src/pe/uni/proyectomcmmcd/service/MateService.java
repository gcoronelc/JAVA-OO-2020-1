package pe.uni.proyectomcmmcd.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class MateService {

	/**
	 * Calcula la MCD de dos numeros.
	 * @param n1 Número 1
	 * @param n2 Número 2
	 * @return Retorna el MCD
	 */	
	public int mcd(int n1, int n2) {
		// variables 
		int mcd;
		//proceso
		while (n1 != n2) {
			if (n1 > n2) {
				n1 = n1 - n2;
			} else {
				n2 = n2 - n1;
			}
		}
		mcd = n1;
		//reporte
		return mcd;
	}

	/**
	 * Calcula el MCM de dos números
	 * @param n1 Número 1
	 * @param n2 Número 2
	 * @return Retorna el MCM
	 */
	public int mcm(int n1, int n2) {
		// Variables
		int mcd, mcm;
		// Proceso
		mcd = mcd(n1, n2);
		mcm = (n1 * n2) / mcd;
		// Reporte
		return mcm;
	}

}
