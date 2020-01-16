package pe.uni.aprendiendocolecciones.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {

	public static void main(String[] args) {
		
		List<Integer> lista;
		
		lista = new ArrayList();
		
		lista.add(10);
		lista.add(50);
		lista.add(70);
		lista.add(80);
		
		// Una forma de recorrer una lista
		// Recorrido tipo indexado
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("lista(" + i + ") = " + lista.get(i));
		}
		
	}
	
}
