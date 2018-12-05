/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos_01_test;

/**
 *
 * @author alumno
 */
public class Entornos_01_test {

    public int mayor(int x, int y, int z){
        int mayor=x;
        if(y>mayor)mayor=y;
        if(z>mayor)mayor=z;
        return mayor;
    }
}
