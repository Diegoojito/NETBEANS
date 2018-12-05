/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Util {

    public static int[] buscarD;
    public static int leerInt(String texto){   
        /** @param texto String es el texto a mostrar
         *  @param return int devuelve el número leido
         */
        Scanner s = new Scanner(System.in);
        System.out.println(texto);
        int num = s.nextInt();
        return num;
    }
    
    public static String leerStr(String texto){   
        /** @param texto String es el texto a mostrar
         *  @param return Str devuelve la cadena leida
         */
        Scanner s = new Scanner(System.in);
        System.out.println(texto);
        String c = s.nextLine();
        return c;
    }   

    public static String[] ordenarStr(String[] e){
        
        String aux;
        int i;
        boolean swOrdenado=false;
        
        // Delimitamos el segmento a ordenar ----
        int l = e.length -2;        
        while(l >= 0 && !swOrdenado){            
            
            // Ordenamos el segmento ------------
                      
            i=0; 
            swOrdenado=true;
            while (i <= l){
                if (e[i].compareTo(e[i+1]) > 0){
                    
                    aux=e[i];
                    e[i]=e[i+1];
                    e[i+1]=aux;
                    swOrdenado=false;
                }
                i++;
            }
            l--; // reducimos el segmento
        }
        return e;
    }
    
    public static void verArray(String[] a){
        for(int i = 0; i< a.length; i++){
            System.out.println("Elemento: "+i+" Contenido: "+ a[i]);
        }
    }
    
    public static void verArray(double[] a){
        for(int i = 0; i< a.length; i++){
            System.out.println("Elemento: "+i+" Contenido: "+ a[i]);
        }
    }
    
    public static int buscarD(String b, String[] v){
        /** @param b String (-b-uscar) int es el valor a buscar
         *  @param v String[] (-v-ector) es el vector donde buscaremos
         *  @param return int devuelve la posición donde se encuentra o -1 (si no se encuentra)
         */
        int i=0;
        int d=v.length;
        int c=(i+d)/2;
        
        while(i<d && v[c].compareTo(b)!=0){
            if (v[c].compareTo(b)<0){
                i=c+1;
            }else{
                d=c-1;
            }
            c=(i+d)/2;
        }
        
        if(v[c].compareTo(b)==0){
        }else{
            c=-1;    // devolvemos -1 si no lo encuentra
        }
        
        return c;
    }
    
    public static int buscar(String b,String[] v){
    int i=0;    
    while(i<v.length && !b.equals(v[i])){
        i++;
    }
    if(i<v.length){
        //Si lo encuentra dejamos el valor de i.
    }
    else{
        //Si no lo encuentra devolvemos el valor de -1 de la i.
        i=-1;
    }
    return i;
    }

    public static int buscarD(int busca, int[] vectorTocho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static char leerChar(String pulsa_opción_0_Salir_del_programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}    
