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

   public class GestAlumnos2 {
    
    public static void leerNotas(String[] al, int[] not, String nombreAsignatura){
        //Creacion de los arrays.
        
        /*Metodo que recibe los vectores de nombres y notas vacios y carga las notas
        * @parm String[]al    nombres de alumnos
        * @param int[]not     notas
        * @param String nombreAsignatura  es el nombre de la asignatura que vamos a procesar
        * @return void no devuelve, quedan en memoria
        */
        
        for(int i=0;i<not.length;i++) {

            not[i]=util.Util.leerInt("Alumno: " + i + " Nombre: " + al[i] + " Nota de " + nombreAsignatura + ": ");
    }
    }
    
    public static void listarNotasAsignatura(String[] al, int[] not){
        //Visualizacion de los arrays.
        
        System.out.println("\n\nListado de alumnos");
        for(int i=0;i<al.length;i++){
            System.out.println("Alumno: " + i + " Nombre: " + al[i] + " Nota: " + not[i]);
        }
        System.out.println("\n\nFin del listado de los alumnos \n\n");
    }
    
    public static void listarNotasAlumnos(String[] al, int[] nProg,int[] nBbdd,int[] nEnt){
        //Visualizacion de los arrays.
        
        System.out.println("\n\nListado de alumnos");
        for(int i=0;i<al.length;i++){
            System.out.println("\n\tAlumno: " + i + " Nombre: " + al[i] 
                    + " Nota Programacion: " + nProg[i] 
                    + " Nota Bases de Datos: " + nBbdd[i] 
                    + " Nota Entornos: " + nEnt[i]);
        }
        System.out.println("\n\nFin del listado de los alumnos \n\n");
    }
    
    public static void main(String[] args){
    
    String[] nombres=new String[]{"Javier","Juan","Luis","Maria","Sonia"};
    int[] nProgramacion=new int[5];
    int[] nBbdd=new int[5];
    int[] nEntornos=new int[5];
    int numLista;
    
    //Introducir las notas de los alumnos en cada asignatura
    
    
    
    leerNotas(nombres,nProgramacion, "PROGRAMACION"); //Programacion
    leerNotas(nombres,nBbdd, "BASES DE DATOS"); //Bases de Datos
    leerNotas(nombres,nEntornos, "ENTORNOS"); //Entornos
    
    //Listamos
    System.out.println("LISTA DE NOTAS PROGRAMACION");
    listarNotasAsignatura(nombres,nProgramacion);
    System.out.println("LISTA DE NOTAS BASES DE DATOS");
    listarNotasAsignatura(nombres,nBbdd);
    System.out.println("LISTA DE NOTAS ENTORNOS");
    listarNotasAsignatura(nombres,nEntornos);
    }
   }
