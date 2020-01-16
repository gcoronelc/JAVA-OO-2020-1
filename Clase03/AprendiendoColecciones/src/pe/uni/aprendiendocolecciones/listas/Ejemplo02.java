package pe.uni.aprendiendocolecciones.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		
		List<Integer> lista;
		
		lista = new ArrayList();
		
		lista.add(10);
		lista.add(50);
		lista.add(70);
		lista.add(80);
		
		lista.add(2, 90);
		
		// Otra forma de recorrer una lista
		// Recorrido tipo colección o FOR EACH
		for (Integer dato : lista) {
			System.out.println(dato);
		}
		
	}
	
}
