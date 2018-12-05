/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedadicotomica;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class BusquedaDicotomica {
      public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int[] vector= new int[10];
    int posicion=0;
    int busca=0;
    
    for(int i=0;i<vector.length;i++){
        vector[i]= i*10 +(int)Math.ceil(Math.random()*10);
    }
   
    System.out.println("¿Que posicion quieres saber?");
    busca=teclado.nextInt();
    
    do{
    posicion=buscar(busca,vector);
   
    if(posicion!=-1){
    System.out.println("La posicion es " + posicion + " el valor es " + vector[posicion]);
    }
    else{
        System.out.println("No encontrado ");
    }
    }
    while(posicion==-1);
    }
    
   public static int[] ordenar(int[]v){
        int aux=0;
        for(int i=0;i<v.length;i++){
           for(int j=i+1;j<v.length;j++){
                if(v[i]>v[j]){
                    aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
           }   
        }
       return v;
    }
    public static int buscar (int b,int[]v){
        int r=-1;
        int izq=0;
        int der=v.length-1;
        int cen=(izq+der)/2;
        int cont=0;
        
            while(izq<der && v[cen]!=b){
                if(v[cen]<b){
                    izq=cen+1;
                }
                else{
                    der=cen-1;
                }
                cont++;
                cen=(izq+der)/2;
            }
        if(v[cen]==b){
            r=cen; 
        }
        System.out.println("Ha dado " + cont + " vueltas");
        return r;
    }
}
