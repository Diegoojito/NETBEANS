
import static pkgswitch.Switch.menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class meses {
    public static int menu(){
    System.out.println("Meses del Año");
        System.out.println("1 - Enero");
        System.out.println("2 - Febrero");
        System.out.println("3 - Marzo");
        System.out.println("4 - Abril");
        System.out.println("5 - Mayo");
        System.out.println("6 - Junio");
        System.out.println("7 - Julio");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setiembre");
        System.out.println("10 - Octubre");
        System.out.println("11 - Noviembre");
        System.out.println("12 - Diciembre");
     int meSes = util.Util.leerInt("Pulsa opción. 0 Salir del programa");
     return meSes;
    
    }
    
    public static void main(String [] args){
        
        
          int meSes=99;
          while(meSes!=0)
          switch (meSes){
              case 1:
            System.out.println("Enero");
            
            break;
            case 2:
            System.out.println("Febrero");
            break;
            case 3:
            System.out.println("Marzo");
            break;
            case 4:
            System.out.println("Abril");
            break;
            case 5:
            System.out.println("Mayo");
            break;
             case 6:
            System.out.println("Junio");
            break;
             case 7:
            System.out.println("Julio");
            break;
             case 8:
            System.out.println("Agosto");
            break;
             case 9:
            System.out.println("Setimbre");
            break;
             case 10:
            System.out.println("Octubre");
            break;
             case 11:
            System.out.println("Noviembre");
            break;
             case 12:
            System.out.println("Dicimbre");
            break;
            default: 
                System.out.println("Has pulsado un teclado equivocado");
    } // del swit
          System.out.println("Adios");
   }  // del while 
        
}
   

