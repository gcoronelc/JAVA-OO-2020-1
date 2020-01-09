package problema1.service;


public class ProblemaService {
    
    /**
     * Calcula el MCD de dos números.
     * @param n1 Numero 1
     * @param n2 Numero 2
     * @return 
     */
   
    
    public int mcd(int n1, int n2) {
        //Variables
        int mcd = 0, men;
        
        //Proceso
        if(n1>n2) {
            men = n2;
        }
        
        else {
            men = n1;
        }
        
        for (int a = 1; a <= men; a++) {
            
            if (n1 % a == 0 && n2 % a ==0) {
                
                mcd = a;
            }
        }
        
        //Reporte
        return mcd;   
    }
    
    public int mcm(int n1, int n2) {
           
       int mcm;
        
       mcm = n1 * n2 / mcd(n1, n2);
        
       return mcm;
    } 

}