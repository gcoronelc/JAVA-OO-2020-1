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
public class Prueba03 {
    public static void main(String[] args) {
       double ingr=120000;
        double otrasrentas4= 2000;
        double total;
        
        RentaService service = new RentaService();
        total= service.totalRenta4ta(ingr, otrasrentas4);
        
        System.out.println("total de renta 4 : "+ total);
        
    }
    
}
