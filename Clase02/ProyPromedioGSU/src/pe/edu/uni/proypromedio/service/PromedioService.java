package pe.edu.uni.proypromedio.service;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class PromedioService {
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @return 
	 */
	public int menorNota(int n1, int n2, int n3, int n4){
		// Variables
		int menor = 0;
		// Proceso
		menor = n1; // Punto de partida
		if(menor > n2){
			menor = n2;
		}
		if(menor > n3){
			menor = n3;
		}
		if(menor > n4){
			menor = n4;
		}
		// Reporte
		return menor;
	}

	public int promedio(int n1, int n2, int n3, int n4){
		// Variable
		int prom, menor;
		// Proceso
		menor = menorNota(n1, n2, n3, n4);
		prom = (n1 + n2 + n3 + n4 - menor) / 3;
		// Reporte
		return prom;
	}
	
	public String condicion( int nota){
		// Variable
		String cond = "Aprobado";
		// Proceso
		if(nota < 14){
			cond = "Desaprobado";
		}
		// Reporte
		return cond;
	}
	
	
}
