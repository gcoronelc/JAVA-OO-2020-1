package pe.uni.proyectopromedio.service;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PromedioService {

    /**
     * Halla el menor de 4 notas
     *
     * @param nota1 almacena nota1
     * @param nota2 almacena nota2
     * @param nota3 almacena nota3
     * @param nota4 almacena nota4
     * @return Retorna el menor de 4 notas
     */
    public float menor(float nota1, float nota2, float nota3, float nota4) {
        float menor = 20;

        if (nota1 < menor) {
            menor = nota1;
        }
        if (nota2 < menor) {
            menor = nota2;
        }
        if (nota3 < menor) {
            menor = nota3;
        }
        if (nota4 < menor) {
            menor = nota4;
        }

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
    
    public float Promediar(float nota1, float nota2, float nota3, float nota4) {
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
     * @param n1 promedio de alumno
     * @return Retorna condición
     */
    public String Condicion(float n1) {
        //VARIABLE
        String cond = null;

        //PROCESO
        if (n1 <= 20 && n1 >= 14) {
            cond = "APROBASTE";
        } else if (n1 < 14 && n1 >= 0) {
            cond = "DESAPROBASTE";
        } else {
            cond = "DATOS MAL INGRESADO.";
        }

        //REPORTE
        return cond;
    }

    
    
}
