/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes;

/**
 *
 * @author alumno
 */
public class Apuntes {
    private int numero1;
    public void calcular(){
        int a=1;
        { // Bloque 1 que hace patatin
            System.out.println(a+","+numero1);
            int b=2;
            System.out.println(a+","+b);
            
            { //Bloque_2 hace patatan
                int c=3;
                System.out.println(a+","+b+","+c);
            } //Fin bloque_2
        } //Fin bloque 1
      
    }  
}
