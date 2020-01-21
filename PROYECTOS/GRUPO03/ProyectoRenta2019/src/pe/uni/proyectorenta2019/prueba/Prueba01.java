package pe.uni.proyectorenta2019.prueba;

import pe.uni.proyectorenta2019.service.RentaService;

/**
 *
 * @author GUSTAVO
 */
public class Prueba01 {

    public static void main(String[] args) {
        double ingr=12000000;
        double ded01;
        
        RentaService service = new RentaService();
        ded01 = service.deduccion01(ingr);
        
        System.out.println(ded01);
        
    }

}
