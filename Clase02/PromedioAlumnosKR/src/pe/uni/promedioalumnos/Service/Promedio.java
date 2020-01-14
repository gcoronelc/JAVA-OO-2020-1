
package pe.uni.promedioalumnos.Service;

public class Promedio {
    public float promedio(float n1, float n2, float n3, float n4){
        //Indica el menor número
        float aux1=n1,aux2=n3,prom,menor=aux1;
        if(n1>=n2){
            aux1=n2;
        }
        if(n3>=n4){
            aux2=n4;
        }

        if(aux1>=aux2){
            menor=aux2;
        }
        // realiza el promedio
        prom=(n1+n2+n3+n4-menor)/3;
        return prom;
    }
    //indica la condicion
    public String condicion(float prom){
        String cond;
        if(prom>=14){
            cond="Aprobado";
        }
        else{
            cond="Desaprobado";
        }
        return cond;
    }
}
