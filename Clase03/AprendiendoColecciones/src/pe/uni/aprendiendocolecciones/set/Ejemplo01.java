package pe.uni.aprendiendocolecciones.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {

	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		
		lista.add("Alianza Lima");
		lista.add("Deportiva Barrio");
		lista.add("Club de Gustavo");
		lista.add("Real Madrid");
		lista.add("Real Madrid");
		
		for (String nombre : lista) {
			System.out.println(nombre);
		}
		
 	}
	
	
}
