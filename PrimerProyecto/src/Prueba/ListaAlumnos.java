
public class ListaAlumnos {
    
    public static void leerDatosAlumnos(String[] al, int[] not){
        //Creacion de los arrays.
        
        for(int i=0;i<al.length;i++) {
            al[i]=util.Util.leerStr("Introduce nombre " + i + " ");
            not[i]=util.Util.leerInt("Introduce nota " + i + " ");
    }
    }
    
    public static void listarDatosAlumnos(String[] al, int[] not){
        //Visualizacion de los arrays.
        
        System.out.println("\n\nListado de alumnos");
        for(int i=0;i<al.length;i++){
            System.out.println("Alumno: " + i + " Nombre: " + al[i] + " Nota: " + not[i]);
        }
        System.out.println("\n\n Fin del listado de los alumnos \n\n");
    }
   
    public static void main(String[] args){
    
    String[] nombres=new String[3];
    int[] notas=new int[3];
    int numLista;
    
    leerDatosAlumnos(nombres,notas);
    
    //Listamos
    
    listarDatosAlumnos(nombres,notas);
    
    //Busqueda implementada por el profesor con el metodo de busqueda de la clase Util.
    
    //Busqueda por numero de lista.
    numLista=util.Util.leerInt("Buscar numero de lista");
    System.out.println("Alumno : " + nombres[numLista] + " su nota es : " + notas[numLista]);
    
    //Busqueda por nombre del alumno.
    String nombre=util.Util.leerStr("Nombre buscado");
    
    numLista=util.Util.buscarD[notas,nombres];
    
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
 
}
    

}
