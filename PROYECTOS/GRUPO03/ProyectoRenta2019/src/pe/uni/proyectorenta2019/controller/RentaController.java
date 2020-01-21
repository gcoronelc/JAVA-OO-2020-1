/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proyectorenta2019.controller;

import pe.uni.proyectorenta2019.service.RentaService;

/**
 *
 * @author HaroldMB
 */
public class RentaController {
    
    private final RentaService rentaservice ;
    
    public RentaController(){
        rentaservice = new RentaService() ;
        
    }
    
    public double deduccion01 (double ingInd ){
        return rentaservice.deduccion01(ingInd);
    }
    
    public double rentaNeta01(double ingInd){
        return rentaservice.rentaNeta01(ingInd);
               
    }
    
    public double totalRenta4ta(double ingInd, double otrosRent4) {
        return rentaservice.totalRenta4ta(ingInd, otrosRent4);
    }
    
    public double totalRentR4R5(double ing05, double totalR4) {
        return rentaservice.totalRentR4R5(ing05, totalR4);
    }
    
    public double deduccion02(double totalR4R5){
        return rentaservice.deduccion02(totalR4R5);
    }
    
     public double deduccion03(double alqui, double gast, double medicos, double aport) {
         return rentaservice.deduccion03(alqui, gast, medicos, aport);
     }
    
    public double totalRentNetaR4R5(double totalR4R5, double ded02, double ded03) {
        return rentaservice.totalRentNetaR4R5(totalR4R5, ded02, ded03);
    }
     
    public double deduccionDon( double donacion, double rentaNetaR4R5,double rentaNetaExtr){
         return rentaservice.deduccionDon(donacion, rentaNetaR4R5, rentaNetaExtr);
    }
      
    public double rentaImponible(double totalRentaR4R5, double dedDon , double extran){
        return rentaservice.rentaImponible(totalRentaR4R5, dedDon, extran);
    }
    
    public double impuestoRenta(double rentaimp){
        return rentaservice.impuestoRenta(rentaimp);
    }
    
}
