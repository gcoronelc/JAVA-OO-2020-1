package pe.uni.aprendiendocolecciones.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		
		List<Integer> lista;
		
		lista = new ArrayList();
		
		lista.add(10);
		lista.add(50);
		lista.add(70);
		lista.add(80);
		
		lista.set(2, 90);
		
		// Otra forma de recorrer una lista
		// Utilizando expresiones lambda
		lista.forEach((dato) -> {
			System.out.println(dato);
		});
		
	}
	
}
