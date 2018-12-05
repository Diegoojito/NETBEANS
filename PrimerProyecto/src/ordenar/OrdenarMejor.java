/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author alumno
 */
public class OrdenarMejor {
    public static void main(String[] args){
        int[] e = {3,45,33,56,60,12,87,32,56,99,12,50,67,82,91,45};
        int aux = 0;
        // int = 0;
        boolean swOrdenado=false;
        
        // Delimitamos el segmento a ordenar ----
        int l = e.length -2;
        
        while(l >= 0 && swOrdenado==false){
            
            
            // Ordenamos el segmento ------------              
            System.out.println("Ejecutando pasada nº: "+1+" Segmento de 0 a: "+1); 
            
                      
           
            swOrdenado=true;
            /*while (i <= l)*/
            for(int i=0;i<=l;i++){
                if (e[i]>e[i+1]){
                    
                    System.out.println("Intercambio elemento: "+i+" Valor: "+e[i]+" con elemento: "+(i+1)+" valor: "+
                            e[i+1]);
                    aux=e[i];
                    e[i]=e[i+1];
                    e[i+1]=aux;
                    swOrdenado=false;
                }
             //   i++;
            }
            l--; // reducimos el segmento
        }
        
        // Visualizamos el vector ordenado
        for(int j=0; j<e.length; j++){
            System.out.println("Elemento: "+j+" Valor: "+e[j]);
        }
        
        System.out.println("ByeBye");
    }
    
    
}
