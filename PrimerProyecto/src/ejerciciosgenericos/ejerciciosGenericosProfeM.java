/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosgenericos;

/**
 *
 * @author alumno
 */
public class ejerciciosGenericosProfeM {
    /*1. */ public static void cuantasFilasyColumnas(int[][] miArray){
        System.out.println("Filas= "+miArray.length);
        System.out.println("Columnas= "+miArray[0].length);
    }
    
    
    /*2. */ public static void verArray2D(int[][] miArray){
        for(int f=0; f<miArray.length; f++){
            System.out.print("Fila: "+f+"\t");
            for(int c=0; c<miArray[f].length; c++){
                System.out.print("\t"+miArray[f][c]);
            }
            System.out.println("");
        }
    }
    
    
    /*3. */ public static boolean simetrica2D(int[][] miArray){
        boolean simetrica = true;
        
        if (miArray.length != miArray[0].length){
            simetrica = false;
        }else{
            for(int f=0; f<miArray.length && simetrica; f++){
            
                    for(int c=0; c<miArray[f].length && simetrica; c++){
                        simetrica = (miArray[f][c]==miArray[c][f]);
                    }
            
            }
        }
        return simetrica;
    }
    
    public static boolean simetrica2DMejor(int[][] miArray){
        boolean simetrica = true;
        
        if (miArray.length != miArray[0].length){
            simetrica = false;
        }else{
            for(int f=0; f<miArray.length && simetrica; f++){
            
                    for(int c=1+f; c<miArray[f].length && simetrica; c++){
                        simetrica = (miArray[f][c]==miArray[c][f]);
                    }
            
            }
        }
        return simetrica;
    }
    
    public static void main(String[] args){
        int[][] ar={{1,2,3},{2,7,4},{3,4,6}};
        cuantasFilasyColumnas(ar);
        verArray2D(ar);
        System.out.println(simetrica2D(ar));
        System.out.println(simetrica2DMejor(ar));
    }
    
}
