/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesAlumNotas;

/**
 *
 * @author alumno
 */
public class GesAlumNotas {
    
    public static void main(String args[]){
        /*Este es el programa ppal que:
            1º Carga vectores
            2º Visualiza vectores
            3º Lee numLista y muestra datos correspodientes
            4º Lee nombre y muestra datos correspondientes
        */
        String[] nombres = new String[5];
        int[] notas = new int[5];
        
        //Introducir datos
        for (int i=0; i<nombres.length;i++){
            nombres[i]=util.Util.leerStr("\nIntroduce nombre alumno :"+ i + " ");
            notas[i]=util.Util.leerInt("Introduce nota alumno :"+ i + " ");
        }
        
        //Listar
        for (int i=0; i<nombres.length;i++){
            System.out.println("Alumno:" + i + " Nombre:" + nombres[i]+ " Nota: " + notas[i]);
        }
        
        //Leer numLista y mostrar datos
        
        //Leer nombre, buscar mostrar datos
    }
    
}
