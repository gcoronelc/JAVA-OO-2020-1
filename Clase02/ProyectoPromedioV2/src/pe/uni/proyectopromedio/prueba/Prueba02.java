package pe.uni.proyectopromedio.prueba;

import pe.uni.proyectopromedio.service.PromedioService;

/**
 *
 * @author Alumno
 */
public class Prueba02 {

    public static void main(String[] args) {
        //VARIABLES
        float prom;
        float n1 = 18;
        float n2 = 16;
        float n3 = 14;
        float n4 = 15;

        //PROCESOS
        PromedioService p1 = new PromedioService();
        prom = p1.Promediar(n1, n2, n3, n4);

        //REPORTE    
        System.out.println("Promedio: " + prom);
    }

}