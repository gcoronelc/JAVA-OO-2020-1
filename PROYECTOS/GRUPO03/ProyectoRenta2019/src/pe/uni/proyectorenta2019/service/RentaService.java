package pe.uni.proyectorenta2019.service;

public class RentaService {
       
    

    private int uit = 4200;

    
    /**
     * Calula la deducción de la reta bruta obtenida por el ejericio individual
     * @param ingInd Renta bruta obtenida por el ejercicio individual.
     * Profesión, arte, ciencia u oficio)
     * @return Deducción (20% del monto consignado max 100.800 )
     */
    public double deduccion01(double ingInd) {
        //datos
        double ded01;
        //procesos

        ded01 = 0.2 * ingInd;
        if (ded01 > uit * 24) {
            ded01 = uit * 24;//100800
        }
        //reporte
        return ded01;
    }

    
    /**
     * calcula la renta neta = ingreso - deduccion 1;
     * @param ingInd Renta bruta obtenida por el ejercicio individual
     * @return renta neta de la 4ta categoria
     */
    public double rentaNeta01(double ingInd) {
        //Datos 
        double rentaNeta;
        double ded01;

        //Proceso
        ded01 = deduccion01(ingInd);

        rentaNeta = ingInd - ded01;
        //reporte
        return rentaNeta;
    }

    /**
     * calcular la renta total de la 4ta categoria 
     * @param ingInd Renta bruta obtenida por el ejercicio individual
     * @param otrosRent4 otras retas obtenidas en la 4ta categoria
     * dietas y otros comprobantes.
     * @return la renta total de la 4ta categoria 
     */
    
    
    public double totalRenta4ta(double ingInd, double otrosRent4) {
        //datos
        double totalrent4;
        double rentanet;

        //procesos
        rentanet = rentaNeta01(ingInd);
        totalrent4 = rentanet + otrosRent4;
        // Reporte 
        return totalrent4;
    }

    
    /**
     * Calcula el total entre la renta de 4ta y 5ta categoria
     * @param ing05 ingreso neto de la 5ta categoria 
     * @param totalR4 es la renta total de la 4ta categoria 
     * @return renta total de la 4ta y 5ta categoria 
     */
    public double totalRentR4R5(double ing05, double totalR4) {
        //datos
        double totalrent;
        //procesos        
        totalrent = ing05 + totalR4;
        //reporte        
        return totalrent;
    }

    /**
     * Reduccion que se aplica al total de renta de 4ta y 5ta categoria
     * @param totalR4R5 renta total de la 4ta y 5ta categoria 
     * @return deduccion de 7 UIT - 29 400
     */
    public double deduccion02(double totalR4R5) {
        //datos
        double ded02;
        //procesos
        if (totalR4R5 < 7 * uit) {
            ded02 = totalR4R5;
        } else {
            ded02 = 7 * uit;
        }
        //reporte
        return ded02;
    }

    /**
     * Reducción hecha a los gasto adicionales
     * @param alqui alquileres de bienes inmuebles
     * @param gast gastos en restaurantes, hoteles, bares 
     * @param medicos medicos y odotologos y servicios de profesionales independientes
     * @param aport aportaciones a essalud de trabajadores del hogar
     * @return deduccion adicional (3UIT)
     */
    public double deduccion03(double alqui, double gast, double medicos, double aport) {

        //datos
        double ded03;
        double suma;
        //procesos
        suma = 0.3 * alqui + gast * 0.15 + medicos * 0.3 + aport;
        if (suma >= 3 * uit) {
            ded03 = 3 * uit;
        } else {
            ded03 = suma;
        }
        //reporte
        return ded03;
    }

    
    /**
     * Total de renta NETA de 4ta y 5ta categoria.
     * @param totalR4R5 renta total de la 4ta y 5ta categoria 
     * @param ded02 deduccion de 7UIT
     * @param ded03 deduccion adicional 3UIT
     * @return Renta total neta de 4ta y 5ta categoria
     */
    public double totalRentNetaR4R5(double totalR4R5, double ded02, double ded03) {
        //datos
        double totalRentR4R5;
        //proceso
        totalRentR4R5 = totalR4R5 - ded02 - ded03;
        //reporte
        return totalRentR4R5;
    }
    
    /**
     * Calculo de reduccion por donacion
     * @param donacion monto de donacion
     * @param rentaNetaR4R5 renta neta de la 4ta y 5ta categoria 
     * @param rentaNetaExtr renta neta de fuente extranjera
     * @return deduccion por deonaciones 
     */
    
    public double deduccionDon( double donacion, double rentaNetaR4R5,double rentaNetaExtr){
        //datos
        double dedDon;
        //procesos
        if( donacion> 0.1 * ( rentaNetaExtr + rentaNetaR4R5  )){
            dedDon = 0.1 * ( rentaNetaExtr + rentaNetaR4R5  );
        }else if (donacion == 0){
            dedDon = 0;
        }else {
            dedDon = donacion;
        }
        //reporte
        return dedDon;
    }
    
    /**
     * Calcula la renta imponible
     * @param totalRentaR4R5 renta total de la 4ta y 5ta categoria
     * @param dedDon deduccion por donaciones 
     * @param extran renta neta de fuente extranjera
     * @return total renta imponible de trabajo y fuente extranjera
     */
    public double rentaImponible(double totalRentaR4R5, double dedDon , double extran){
        //dato
        double rentaimp;
        double subtotal;
        //proceso
        subtotal=totalRentaR4R5-dedDon;
        
        if(subtotal<0){
           subtotal=0;
       }
        
             rentaimp=subtotal+extran;

        //retorno
    return rentaimp;
    }
    
    
    /**
     * Calcula el impuesto a la renta TOTAL.
     * @param rentaimp total renta imponible de trabajo y fuente extranjera
     * @return impuesto a la renta 
     */
    public double impuestoRenta(double rentaimp){
        double renta = 0;
        
        if(rentaimp==0){
            renta=0;
        }
        else if(rentaimp<= 5*uit){          // 12 000
            renta=0.08*rentaimp;
        }
        else if(rentaimp>5*uit && rentaimp<=20*uit){ //48 000
            renta=0.14*(rentaimp-5*uit);
        }
        
        else if(rentaimp>20*uit && rentaimp<=35*uit){ // 84 000
            renta=0.17*(rentaimp-20*uit);
        }
        else if(rentaimp>35*uit && rentaimp<=45*uit){ // 108 000
            renta=0.2*(rentaimp-35*uit);
        }
        else if(rentaimp>45*uit ){
            renta=0.3*(rentaimp-45*uit);
        }
        return renta;
    }
    
  
}
