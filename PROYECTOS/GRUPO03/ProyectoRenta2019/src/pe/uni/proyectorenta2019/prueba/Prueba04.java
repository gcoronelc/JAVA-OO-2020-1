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
public class Prueba04 {
    public static void main(String[] args) {
       double ingr=120000;
        double otrasrentas4= 2000;
        double totalrent;
        double totalRenta04;
        double totalRet05 = 1000;
        RentaService service = new RentaService();
        totalRenta04 = service.totalRenta4ta(ingr, otrasrentas4);
        totalrent = service.totalRenta4ta(totalRet05, totalRenta04);
        
        System.out.println("Renta 5: " + totalRet05);
        System.out.println("total de renta 4 +  rent 5 : "+ totalrent);
        
    }
    
}
