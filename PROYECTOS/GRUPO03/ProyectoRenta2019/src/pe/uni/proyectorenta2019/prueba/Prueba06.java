/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proyectorenta2019.prueba;

import pe.uni.proyectorenta2019.service.RentaService;

/**
 *
 * @author GUSTAVO
 */
public class Prueba06 {
    public static void main(String[] args) {
        //datos
        double ded03;
        double alquiler= 2000;
        double gastos1=400000;
        double gastos2=500000;
        double aport=450000;
        
        RentaService service = new RentaService();
        ded03 = service.deduccion03(alquiler, gastos1, gastos2, aport);
        
        System.out.println("La deducci+on #03 es :"+ ded03);
        
        
    }
    
}
