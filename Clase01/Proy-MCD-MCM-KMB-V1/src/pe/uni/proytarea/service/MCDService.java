/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.proytarea.service;

public class MCDService {
    
    public int MCD(int n1, int n2){
        if(n2==0){
           return n1;
        }
        else{
            return MCD(n2, n2 % n1);
        }
    }
    
    
}
