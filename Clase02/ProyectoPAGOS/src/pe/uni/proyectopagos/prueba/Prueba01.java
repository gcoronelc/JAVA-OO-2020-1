package pe.uni.proyectopagos.prueba;

import pe.uni.proyectopagos.dto.PagoDto;
import pe.uni.proyectopagos.service.PagoService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		PagoDto dto = new PagoDto();
		// Datos
		dto.setHorasDia(3);
		dto.setDias(20);
		dto.setPagoHora(20.0);
		// Proceso
		PagoService service = new PagoService();
		dto = service.procesar(dto);
		// Reporte
		System.out.println("Ingreso: " + dto.getIngresos());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Neto: " + dto.getNeto());
	}

}
