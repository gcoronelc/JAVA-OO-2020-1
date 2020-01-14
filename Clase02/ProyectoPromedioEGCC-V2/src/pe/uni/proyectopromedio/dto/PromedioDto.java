package pe.uni.proyectopromedio.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.pe
 * @videos youtube.com/c/DesarrollaSoftware
 */
public class PromedioDto {

	// Datos entrada
	private float nota1;
	private float nota2;
	private float nota3;
	private float nota4;
	// Datos salida
	private float notaMenor;
	private float promedio;
	private String condicion;

	// Constructor por defecto
	public PromedioDto() {
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getNota4() {
		return nota4;
	}

	public void setNota4(float nota4) {
		this.nota4 = nota4;
	}

	public float getNotaMenor() {
		return notaMenor;
	}

	public void setNotaMenor(float notaMenor) {
		this.notaMenor = notaMenor;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

} // Fin de la Clase PromedioDto
