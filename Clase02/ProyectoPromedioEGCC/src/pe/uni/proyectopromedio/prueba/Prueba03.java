/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proyectopromedio.prueba;

import pe.uni.proyectopromedio.service.PromedioService;

/**
 *
 * @author Alumno
 */
public class Prueba03 {

    public static void main(String[] args) {
        //VARIABLES
        float prom;
        String cond = null;
        float n1 = 18;
        float n2 = 16;
        float n3 = 14;
        float n4 = 15;

        //PROCESOS
        PromedioService p1 = new PromedioService();
        prom = p1.promediar(n1, n2, n3, n4);
        cond = p1.condicion(prom);

        //REPORTE
        System.out.println("Condición: " + cond);
    }

}
