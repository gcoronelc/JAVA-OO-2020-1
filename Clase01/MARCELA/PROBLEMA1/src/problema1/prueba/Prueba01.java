package problema1.prueba;

import problema1.service.ProblemaService;

public class Prueba01 {

    public static void main(String[] args) {
        
        //Datos
       int n1 = 10;
       int n2 = 48;
       
       //Proceso
       ProblemaService service = new ProblemaService();
       int mcd = service.mcd(n1, n2);
       int mcm = service.mcm(n1, n2);
       
       //Reporte
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        System.out.println("MCD: " + mcd);
        System.out.println("MCM: " + mcm);
    }
    
}