/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    public static void main(String[] args){
            String[] alumnos;           //declaración    
            alumnos = new String[5];    //creación
            
            int[] notas;
            notas = new int[5];
            
            //1º Leer alumnos de teclado
            int i=0;
            while (i<5){
                alumnos[i]=util.Util.leerStr("Introduce nombre del alumno" +i);
                notas[i]=util.Util.leerInt("Introduce nota");
                i++;
            }
            
            //2º recorrer los vectores escribiendolos
            i=0;
            while (i<5){
                System.out.println("Alumno: "+i+" Nombre: "+ alumnos[i] + " Nota: "+ notas[i]);
                
                i++;
            }
            System.out.println("ByeBye");
    }
}
