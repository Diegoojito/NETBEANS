/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

/**
 *
 * @author alumno
 */
public class PrimerProyecto {

    
    
    public static void main(String[] args) {
        int base;
        int altura;
        int contaBase;
        int contaAltura;
        
        altura = util.Util.leerInt("Introduce la altura del triángulo:");
        
        contaAltura = 0;
        while (contaAltura <= altura){
            
           contaBase = 1;
           while (contaBase <= contaAltura){
             System.out.print("*");
             contaBase++;
           }
           System.out.println("");
           contaAltura++;
        }
        System.out.println("ByeBye");
    }
}