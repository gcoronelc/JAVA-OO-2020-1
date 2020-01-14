package pe.uni.proyectopagos.service;

import pe.uni.proyectopagos.dto.PagoDto;

public class PagoService {

	public PagoDto procesar(PagoDto dto) {
		//Variables
		double ingresos;
		double renta;
		double neto;
		//Procesos
		ingresos = obtenerIngreso(dto.getHorasDia(), dto.getDias(), dto.getPagoHora());
		renta = obtenerRenta(ingresos);
		neto = obtenerNeto(ingresos, renta);
		//Reporte
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;

	}

	private double obtenerIngreso(int horasDia, int dias, double pagoHora) {
		double ingreso = horasDia * dias * pagoHora;
		return ingreso;
	}

	private double obtenerRenta(double ingreso) {
		double renta = 0;
		if (ingreso > 1500) {
			renta = (8 * ingreso) / 100;
		}
		return renta;
	}

	private double obtenerNeto(double ingreso, double renta) {
		double neto = ingreso - renta;
		return neto;
	}
}
