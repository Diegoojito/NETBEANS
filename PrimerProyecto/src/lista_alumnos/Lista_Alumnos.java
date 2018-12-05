/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_alumnos;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Lista_Alumnos {
    public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);

    String[] nombres=new String[5];
    String[] notas=new String[5];
    int[] notasnum=new int[5];
 
    for(int i=0;i<5;i++) {
       System.out.println("Introduce nombre");
       nombres[i]=teclado.nextLine();
       System.out.println("Introduce nota");
       notas[i]=teclado.nextLine();
    }

    for(int vc=0;vc<notasnum.length;vc++) {
               notasnum[vc]=Integer.parseInt(notas[vc]);
    }

    int opcion;
    System.out.println("¿Que opcion deseas?");
    System.out.println("1.-Busqueda por nombre");
    System.out.println("2.-Busqueda por lista");
    opcion=teclado.nextInt();
    
    while(opcion>0 && opcion<3){
    switch(opcion){

        case 1:
            String nombre;
            System.out.println("Introduce el nombre");
            nombre=teclado.nextLine();

            for(int i=0;i<nombres.length;i++){
                if(nombre.equals(nombres[i])){
                    System.out.println("La nota es " + notas[i]);
                }
            }
        break;

        case 2:
            int numlista;
            System.out.println("Introduce el numero de lista");
            numlista=teclado.nextInt();

            for(int i=0;i<notas.length;i++){
                if(numlista==i){
                    System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                }
            }
            break;
    }
    }
}
}
