
package pe.uni.proyectomcmmcd.pruebamcd;

import pe.uni.proyectomcmmcd.servicemcd.mcdService;

public class Pruebamcd {

    public static void main(String[] args) {
        int n1 = 15;
        int n2= 20;
        //proceso
        mcdService service = new mcdService();
        int mcd = service.mcd(n1, n2);
        //reporte
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        System.out.println("MCD: " + mcd);
    }
    
}
