/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosgenericos;

/**
 *
 * @author Alex
 */
public class ejerciciosGenericos {
     public static void listadoTabla(String[] filas,String[] columnas,int[][] tabla){

        System.out.print("");
        for(int i=0;i<columnas.length;i++){
            System.out.print("\t"+columnas[i]);
        }           

        for(int nFil=0; nFil<filas.length; nFil++){
            System.out.print("\n"+filas[nFil]);
            
            int acuTab = 0;  // Acumulador de notas de cada alumno            
            for(int nCol=0; nCol<columnas.length;nCol++){
                System.out.print("\t\t"+tabla[nFil][nCol]);
                acuTab+=tabla[nFil][nCol];
            }
        }
        System.out.println();
    }
     
     public static void contarFilasColumnas(String[] filas,int[][] tabla){
        System.out.println("Numero de filas: "+tabla.length);
        System.out.println("Numero de columnas:"+tabla[0].length);
        }

     /*for(int nFil=0; nFil<filas.length;nFil++){
            for(int nCols=0;nCols<tabla.length;nCols++){
            System.out.print(tabla[nFil][nCols]+"\t\nNumero de filas: ");
        }*/
        
        /*for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
     }*/
    
      
    public static void main(String[] args){
        // Crear y cargar datos
        String[] filas = {"FILA 1","FILA 2","FILA 3","FILA 4"};
        String[] columnas = {"COLUMNA 1", "COLUMNA 2", "COLUMNA 3"};
        int[][] tabla ={{1,1,1},{2,2,2},{3,6,3},{4,5,3}};
              
       
        listadoTabla(filas,columnas,tabla);
        contarFilasColumnas(filas,tabla);
    }
}
