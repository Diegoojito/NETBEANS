/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztraspuesta;

/**
 *
 * @author alumno
 */
public class matrizTranspuesta {
    
public static void main (String[] args){
    int[][] array= new int[][] {{1,0,0},{0,1,0},{0,2,1},{2,3,4},{4,5,1}};
    int[][] tr=new int[array[0].length][array.length];
    
    tr=traspuesta(array);
    for(int fil=0;fil<tr.length;fil++) {
        for(int col=0;col<tr[0].length;col++) {
            System.out.print(tr[fil][col] +"\t");
        }
        System.out.println();
    }
}

public static int[][] traspuesta(int[][] ar) {
    int[][] tr=new int[ar[0].length][ar.length];
    for(int fil=0;fil<ar.length;fil++) {
        for(int col=0;col<ar[0].length;col++) {
            tr[col][fil]=ar[fil][col];
        }
    }
    return tr;
    
}         
 }

