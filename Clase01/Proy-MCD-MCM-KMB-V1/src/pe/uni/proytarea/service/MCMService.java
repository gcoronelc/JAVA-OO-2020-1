/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proytarea.service;

/**
 *
 * @author Alumno
 */
public class MCMService {
    
    
    public int MCM (int n1, int n2){
    int mcm;    
    MCDService o1 =new MCDService();
    
    mcm = (n1* n2 )/ o1.MCD(n1, n2);    
    
    return mcm;
    }

}
