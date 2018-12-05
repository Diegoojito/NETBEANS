/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

/**
 *
 * @author alumno
 */
public class Cuadrado {
    
    
    public static void main(String[] args){
        int lado;
        int conta;
        int conta2;
        lado = util.Util.leerInt("Introduce lado:");
    
    conta = 0;
    while (conta < lado){
               
        conta2=0;
        while(conta2 < lado){
            System.out.print("3");
            conta2++;
        }
        
        System.out.println("");
        conta++;
        }
    }
}
