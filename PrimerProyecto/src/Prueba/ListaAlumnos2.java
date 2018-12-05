package Prueba;


public class ListaAlumnos2 {
    
   public static void leerNotas(String[] al, int[] not, String nombreAsignatura){
        //Creacion de los arrays.
        
        /*Metodo que recibe los vectores de nombres y notas vacios y carga las notas
        * @param String[]al    nombres de alumnos
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
    
    public static void listadoCompleto(String[] n, int[] nPr, int[] nBb, int[] nEnt){
       /*Metodo que recibe los vectores de nombres y notas vacios y carga las notas
        * @parm String[]al    nombres de alumnos
        * @param int[]not     notas
        * @param String nombreAsignatura  es el nombre de la asignatura que vamos a procesar
        * @return void no devuelve, quedan en memoria
        */
       System.out.println("\n\nListado de alumnos");
        for(int i=0;i<n.length;i++){
            System.out.println("Alumno: " + i + " Nombre: " + n[i] +  " Programación: " + nPr[i]+ " Bases de Datos: " + nBb[i]+ " Entornos: " + nEnt[i]);
        }
        System.out.println("\n\nFin del listado de los alumnos \n\n");
   };
    
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
    
    //Busqueda implementada por el profesor con el metodo de busqueda de la clase Util.
    
    //Busqueda por numero de lista.
    numLista=util.Util.leerInt("Buscar alumno por numero de lista");
    
    // Listado completos de alumnos con sus notas
    
    listadoCompleto(nombres, nProgramacion, nBbdd, nEntornos);
    
    while(numLista>=0 && numLista<nombres.length){
    System.out.println("Alumno : " + nombres[numLista] + 
            " \n\tNota de programacion es : " + nProgramacion[numLista] + 
            " \n\tNota de bases de datos es : " + nBbdd[numLista] + 
            " \n\tNota de entornos es : " + nEntornos[numLista]);
    
    
    nProgramacion[numLista]=util.Util.leerInt(" \n\tNota Programación\t: ");
    nBbdd[numLista]=util.Util.leerInt(" \n\tNota Bases de Datos        \t: ");
    nEntornos[numLista]=util.Util.leerInt(" \n\tNota Entornos    \t: ");
    
    numLista=util.Util.leerInt("Introduce Nº Lista: ");
    }
    /*
    //Busqueda por nombre del alumno.
    String nom=util.Util.leerStr("Nombre buscado del alumno ");
    
    numLista=util.Util.buscarString(nom, nombres);
    
    if(numLista>=0){
        System.out.println ("El alumno es " + nombres[numLista] + " su nota es " + notas[numLista]);
    }
    else{
        System.out.println("No existe el alumno");
    }
  
  //Modificar los datos de un array.
  System.out.println("Modificamos las notas del alumno ");
  numLista=util.Util.leerInt("Buscar el numero de lista que ocupa ");
  notas[numLista]=util.Util.leerInt("Su nota a modificar es ");
  System.out.println("La nueva nota del alumno " + nombres[numLista] + " es " + notas[numLista]); 
 */
    }
}
    


