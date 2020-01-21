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
public class Prueba05 {
    public static void main(String[] args) {
        double ingr=120000;
        double otrasrentas4= 2000;
        double totalrent;
        double totalRenta04;
        double totalRet05 = 1000;
        double ded02;
        double totalR4R5;
        
        RentaService service = new RentaService();
        totalR4R5 = service.totalRentR4R5(ingr, totalRet05);
        ded02 = service.deduccion02(totalR4R5);
        
        System.out.println("Duduccion 02: " + ded02);
        
        
        
    }
    
}
