package pe.uni.aprendiendocolecciones.listas;

import java.util.ArrayList;
import java.util.List;
import pe.uni.aprendiendocolecciones.dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class Ejemplo04 {

	public static void main(String[] args) {
		
		List<ProductoDto> lista;
		
		lista = new ArrayList();
		
		lista.add(new ProductoDto("Agua San Carlos", 1.0, 100));
		lista.add(new ProductoDto("Carveza Cristal", 10.0, 150));
		lista.add(new ProductoDto("Coca Cola", 5.0, 800));
		lista.add(new ProductoDto("Chilcano", 15.0, 500));
		
		// Otra forma de recorrer una lista
		// Utilizando expresiones lambda
		lista.forEach((dto) -> {
			System.out.println(dto.getNombre() + " - " + dto.getPrecio());
		});
		
	}
	
}
