package pe.uni.ventasuni.service;

import java.util.ArrayList;
import java.util.List;
import pe.uni.ventasuni.dto.ProductoDto;
import pe.uni.ventasuni.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
class Data {

	// Categorias
	final static String CAT01 = "IMPRESORAS";
	final static String CAT02 = "LAPTOPS";
	final static String CAT03 = "DISCOS DUROS";
	
	// Colecciones
	final static List<ProductoDto> PRODUCTOS;
	final static List<VentaDto> VENTAS;
	
	// Inicializar colecciones
	static {
		// Colecciones
		PRODUCTOS = new ArrayList<>();
		VENTAS = new ArrayList<>();
		// Productos de la categoria 1
		PRODUCTOS.add(new ProductoDto(CAT01, "Impresora Magica", 2000.0));
		PRODUCTOS.add(new ProductoDto(CAT01, "Impresora Matricial", 200.0));
		PRODUCTOS.add(new ProductoDto(CAT01, "Impresora 3D", 5000.0));
		// Productos de la categoria 2
		PRODUCTOS.add(new ProductoDto(CAT02, "Laptop i20", 5000.0));
		PRODUCTOS.add(new ProductoDto(CAT02, "Laptop Magica", 8000.0));
		PRODUCTOS.add(new ProductoDto(CAT02, "Laptop modelo EGCC", 9000.0));
		// Productos de la categoria 3
		PRODUCTOS.add(new ProductoDto(CAT03, "Disco Duro Solido 1T", 2000.0));
		PRODUCTOS.add(new ProductoDto(CAT03, "Disco Duro 3T", 1500.0));
		PRODUCTOS.add(new ProductoDto(CAT03, "Disco Duro Portatil 2T", 800.0));
	}
	
}
