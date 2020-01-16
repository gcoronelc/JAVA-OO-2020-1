package pe.uni.ventasuni.controller;

import java.util.List;
import pe.uni.ventasuni.dto.ProductoDto;
import pe.uni.ventasuni.dto.VentaDto;
import pe.uni.ventasuni.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class VentasController {
	
	private final VentaService service;

	public VentasController() {
		service = new VentaService();
	}
	
	public String[] traerCategorias() {
		return service.getCategorias();
	}

	public List<ProductoDto> traerProductos(String categoria) {
		return service.getProductos(categoria);
	}

	public void procesarVenta(VentaDto ventaDto) {
		service.grabar(ventaDto);
	}

	public List<VentaDto> traerVentas(){
		return service.getVentas();
	}
	
}
