package pe.uni.proyectopromedio.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import pe.uni.proyectopromedio.dto.PromedioDto;

public class PromedioService {
	
	public PromedioDto procesar(PromedioDto dto){
		// Variables
		float menorNota, promedio;
		String condicion;
		// Proceso
		menorNota = menor(dto.getNota1(), dto.getNota2(), 
								dto.getNota3(), dto.getNota4());
		promedio = promediar(dto.getNota1(), dto.getNota2(), 
								dto.getNota3(), dto.getNota4() );
		condicion = condicion(promedio);
		// Reporte
		dto.setNotaMenor(menorNota);
		dto.setPromedio(promedio);
		dto.setCondicion(condicion);
		return dto;
	} // Fin de procesar
		

	/**
	 * Halla el menor de 4 notas
	 *
	 * @param nota1 almacena nota1
	 * @param nota2 almacena nota2
	 * @param nota3 almacena nota3
	 * @param nota4 almacena nota4
	 * @return Retorna el menor de 4 notas
	 */
	private float menor(float nota1, float nota2, float nota3, float nota4) {
		// Variables
		float menor;
		// Proceso
		menor = nota1; // Punto de partida
		if (nota2 < menor) {
			menor = nota2;
		}
		if (nota3 < menor) {
			menor = nota3;
		}
		if (nota4 < menor) {
			menor = nota4;
		}
		// Reporte
		return menor;
	}

	/**
	 * Calcular el promedio de 4 notas
	 *
	 * @param nota1 almacena nota1
	 * @param nota2 almacena nota2
	 * @param nota3 almacena nota3
	 * @param nota4 almacena nota4
	 * @return retorna promedio de notas
	 */
	private float promediar(float nota1, float nota2, float nota3, float nota4) {
		//variables
		float promedio = 0;
		float menor = 0;
		//procesos
		menor = menor(nota1, nota2, nota3, nota4);
		promedio = (nota1 + nota2 + nota3 + nota4 - menor) / 3;
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		DecimalFormat formato1 = new DecimalFormat("#.##");
		formato1.setDecimalFormatSymbols(symbols);
		promedio = Float.parseFloat(formato1.format(promedio));
		//reporte
		return promedio;
	}

	/**
	 * Calcular la condión del alumno según su promedio
	 *
	 * @param nota promedio de alumno
	 * @return Retorna condición
	 */
	private String condicion(float nota) {
		//VARIABLE
		String cond = null;
		//PROCESO
		if (nota <= 20 && nota >= 14) {
			cond = "APROBASTE";
		} else if (nota < 14 && nota >= 0) {
			cond = "DESAPROBASTE";
		} else {
			cond = "DATOS MAL INGRESADO.";
		}
		// REPORTE
		return cond;
	}

} // Fin de PromedioService
