/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
import java.util.Random;
/**
 *
 * @author alumno
 */
public class Parcticas {
    
public class sinduplicado {
    public static void main(String [] args){
    int[] a={100,80,90,50,60,70,30,40,10,20,20,50,80,40};
    int aux=0;
    boolean swOrdenado=false;
    //fusion
    FusionArray vec = new FusionArray();
    vec.rellenar();
    vec.visualizar();
    vec.ordenar();
    vec.visualizar();
    vec.fusion();
    vec.visualizar();
   
    
    // Delimitamos el Vector a ordenar ----
        int l = a.length -2;
        while( l>=0 && swOrdenado==false){
            
        
            // Ordenamos el Vector ------------              
            System.out.println("Ejecutando pasada nº: "+l+" Ordenamos 0 a: "+l); 
            
             swOrdenado=true;
             for( int i=0;i<=l;i++){
                 
                 if (a[i]>a[i+l]){
                  System.out.println("Intercambio elemento: "+i+" Valor: "+a[i]+" con ordenado: "+(i+l)+" valor: "+a[i+l]);
                  
                   aux=a[i];
                    a[i]=a[i+l];
                    a[i+l]=aux;
                    swOrdenado=false;
                 }
             }
             l--;
        } 
        for(int j=0; j<a.length; j++){
            System.out.println("Ordenados: "+j+" Valor: "+a[j]);
          }
         System.out.println("ByeBye");
    }
//Fusion
    public class FusionArray{
    int array1 [] = new int [5];
    int array2 [] = new int [5];
         public void rellenar(){
             
         Random rnd =new Random();
         //hast + desde +1) +desde
         for(int i=0; i< array1.length;i++){
             array1[i] = rnd.nextInt(10-0+1)+0;
             array2[i] = rnd.nextInt(20-11+1)+11;
         }
         }
         public void visualizar(){
         System.out.println("Array1");
         for(int i=0;i<array1.length;i++){
             
         System.out.println("pos["+i+"]: "array1[i]);
         
         }
          System.out.println("Array2");
         for(int i=0;i<array2.length;i++);
         System.out.println("pos["+i+"]: "array2[i]);
      }   
    
    public void ordenar(){
    int aux;
    for(int i=0;i<array1.length-1;i++){
        for(int j=0;j<array1.length;j++){
        if(array1[j-1]>array1[1]){
        aux =array1[j-1];
        array1[j-1]=array1[j];
        array1[j]=aux;
          }
        
        }
        
      }
    for(int i=0;i<array2.length-1;i++){
        for(int j=0;j<array2.length;j++){
        if(array2[j-1]>array2[1]){
        aux =array2[j-1];
        array2[j-1]=array2[j];
        array2[j]=aux;
        
       }
    }
}
   public void fusion(){
    int aProvisional[]= new int [array1.length];
    for(int i=0;i<array1.length;i++){
    aProvisional[i]=array1[i];
    array1[i] = array2[i];
    array2[i] = aProvisional[i];
    
      }
     }    
    }
  } 

    
}
