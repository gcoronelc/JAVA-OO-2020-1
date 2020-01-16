package pe.uni.aprendiendocolecciones.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo01 {

	public static void main(String[] args) {
		
		Map<Integer,String> lista;
		
		lista = new HashMap<>();
		
		lista.put(10, "Jose");
		lista.put(20, "Juana");
		lista.put(30, "Karla");
		lista.put(40, "Gustavo");
		lista.put(50, "Leonor");
		
		Iterator<Integer> iterator = lista.keySet().iterator();
		while(iterator.hasNext()){
			Integer key = iterator.next();
			String value = lista.get(key);
			System.out.println(key + " - " + value);
		}
		
	}
	
}
