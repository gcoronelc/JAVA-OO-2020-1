package pe.uni.aprendiendocolecciones.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		
		Map<Integer,String> lista;
		
		lista = new HashMap<>();
		
		lista.put(10, "Jose");
		lista.put(20, "Juana");
		lista.put(30, "Karla");
		lista.put(40, "Gustavo");
		lista.put(50, "Leonor");

		lista.put(30, "Asusena");
		
		for(Integer key: lista.keySet()){
			String value = lista.get(key);
			System.out.println(key + " - " + value);
		}
		
		
	}
	
}
