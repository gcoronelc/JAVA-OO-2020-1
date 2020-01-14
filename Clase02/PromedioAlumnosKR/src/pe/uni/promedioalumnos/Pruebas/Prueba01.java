
package pe.uni.promedioalumnos.Pruebas;

import pe.uni.promedioalumnos.Service.Promedio;

public class Prueba01 {
    public static void main(String[] args) {
        //Datos
        int n1=10;
        int n2=15;
        int n3=11;
        int n4=10;
        //Proceso
        Promedio service = new Promedio();
        float prom = service.promedio(n1,n2,n3,n4);
        String cond = service.condicion(prom);
        //Reporte
        System.out.println("Promedio: " +prom);
        System.out.println("Condicion: " +cond);
    }
    
}
