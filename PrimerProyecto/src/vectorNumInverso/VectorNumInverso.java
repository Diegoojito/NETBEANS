/*
 * Programa que lea 5 números, los guarde en un vector y
 * los muestre en orden inverso
 */
package vectorNumInverso;

/**
 *
 * @author alumno
 */
public class VectorNumInverso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] numeros;
       numeros= new int[5];
       
       // for (int=0;i<=4; i++)
       int i=0;
       while(i<=4){
           numeros[i]= util.Util.leerInt("Introduce número"+i+":");
           
           i++;
       }
       
       i=4;
       while(i>=0){
           System.out.println("Número "+i+" Contiene: "+numeros[i]);
           i--;
       }
       System.out.println("ByeBye");
       }
    
}
