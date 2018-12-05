/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar;

/**
 *
 * @author alumno
 */
public class Buscar {
    public static int buscarD (int b, int[] v) {
                               int izq=0;
                               int der=v.length-1;
                               int cen=(izq+der)/2;
                               int r=-1;
                              
    while(izq<der && v[cen]!=b) {
        if(v[cen]<b) {
            izq=cen+1;
        }
        else {
            der=cen-1;
        }
        cen=(izq+der)/2;
    }
        if(v[cen]==b){
        r=cen;
        }
                                              
    return r;
    }
    
}
