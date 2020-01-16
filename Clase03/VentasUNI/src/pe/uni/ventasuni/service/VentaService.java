package pe.uni.ventasuni.service;

import java.util.ArrayList;
import java.util.List;
import pe.uni.ventasuni.dto.ProductoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class VentaService {
	
	public String[] getCategorias(){
		// Variables
		String[] categorias;
		// Proceso
		categorias = new String[]{Data.CAT01,Data.CAT02,Data.CAT03};
		// Reporte
		return categorias;
	} // getCategorias
	
	public List<ProductoDto> getProductos(String categoria){
		// Variables
		List<ProductoDto> lista;
		// Proceso
		lista = new ArrayList<>();
		for (ProductoDto dto : Data.PRODUCTOS) {
			if(dto.getCategoria().equals(categoria)){
				lista.add(dto);
			}
		}
		// Reporte
		return lista;
	}
	

} // VentaService
