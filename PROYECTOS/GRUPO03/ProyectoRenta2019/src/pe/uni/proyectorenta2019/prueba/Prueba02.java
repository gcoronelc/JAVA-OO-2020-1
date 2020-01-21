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
public class Prueba02 {
    public static void main(String[] args) {
        double ingr=120000;
        double neta;
        
        RentaService service = new RentaService();
        neta= service.rentaNeta01(ingr);
        
        System.out.println("Renta Neta : "+neta);
        
    }
    
}
