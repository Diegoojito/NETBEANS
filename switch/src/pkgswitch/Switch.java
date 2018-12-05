
package pkgswitch;

/**
 *
 * @author alumno
 */
public class Switch {
    public static char menu() {
         
    System.out.println("Menú de seleccion");
        System.out.println("1 - Añadir datos");
        System.out.println("2 - Borrar datos");
        System.out.println("3 - Añadir datos");
        System.out.println("4 - Lista datos");
     char opc = util.Util.leerChar("Pulsa opción. 0 Salir del programa");
     return opc;
    }

    /**
     *Escribir un programa nos permita pulsar un opción 1.2.3.4.5,y 
     * que nos muestre  un texto en función de la
     * opción pulsada, el programa se repetirá  hasta que 
     * el programa llegue a cero.
     * @param args
     */
    
    public static void anadirDatos(){
        // codigo de añadir datos 
    
    }
     public static void borrarDatos(){
        // codigo de añadir datos 
    
    }
      public static void modificarDatos(){
        // codigo de añadir datos 
    
    }
       public static void listarDatos(){
        // codigo de añadir datos 
    
    }
    public static void main(String [] args){
        char opc='x';
       while (opc !='0'){
       opc=menu();
       
          switch (opc){
            case'1':
            System.out.println("has dicho Añadir datos");
            anadirDatos();
            break;
            case'2':
            System.out.println("has dicho Borrar datos");
            borrarDatos();
            break;
            case'3':
            System.out.println("has dicho Añadir datos");
            modificarDatos();
            break;
            case'4':
            System.out.println("has dicho Lista datos");
            listarDatos();
            break;
            case'0':
            System.out.println("has dicho Salir del programa");
            break;
            default: 
                System.out.println("Has pulsado un teclado equivocado");
    } // del swit
   }  // del while 
        System.out.println("Adios");
  }
   
}
