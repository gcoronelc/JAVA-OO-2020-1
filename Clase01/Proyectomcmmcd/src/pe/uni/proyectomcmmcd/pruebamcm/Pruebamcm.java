package pe.uni.proyectomcmmcd.pruebamcm;

import pe.uni.proyectomcmmcd.servicemcm.mcmService;

public class Pruebamcm {

    public static void main(String[] args) {
       int n1 = 15;
       int n2= 20;
       //proceso
        mcmService service = new mcmService();
       int mcm = service.mcm(n1, n2);
       //reporte
       System.out.println("N1: " + n1);
       System.out.println("N2: " + n2);
       System.out.println("MCM: " + mcm);
    }
    
}
