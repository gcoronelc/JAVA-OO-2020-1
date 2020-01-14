package pe.uni.proyectopromedio.prueba;

import pe.uni.proyectopromedio.dto.PromedioDto;
import pe.uni.proyectopromedio.service.PromedioService;

public class prueba01 {

	public static void main(String[] args) {
		//VARIABLES
		PromedioDto dto = new PromedioDto();
		// DATOS
		dto.setNota1(13);
		dto.setNota2(12);
		dto.setNota3(14);
		dto.setNota4(10);
		//PROCESOS
		PromedioService service = new PromedioService();
		dto = service.procesar(dto);
		//REPORTE
		System.out.println("Nota Menor: " + dto.getNotaMenor());
		System.out.println("Promedio: " + dto.getPromedio());
		System.out.println("Condición: " + dto.getCondicion());

	}

}
