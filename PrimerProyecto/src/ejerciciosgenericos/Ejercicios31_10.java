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
public class Ejercicios31_10 {
    public static void main(String[] args) {
		
	int[] vector1=new int[]{1,2,3,5,7,8};
        int[] vector2=new int[]{1,4,6,9};
        int[] vectorresultado=new int[vector1.length+vector2.length];
		
        
	int [][] matriz1=new int[][] {{2,3,4},{25,2,10},{7,14,30}};
	int [][] matriz2=new int[][] {{6,10,11},{12,5,20},{9,4,19}};
	int [][] resul=new int[matriz1.length][matriz1[0].length];
		
		
	int[] v1=new int[]{1,3,9,5,7,10,12,56,87};
        int pos=4;
        int valor=28;
        int[] nuevo=new int[v1.length+1];
        
        
        String[] asig=new String[] {"Programacion","Bases de Datos","Entornos"};
        String[] alumnos=new String[] {"Pepe","Mery","Pipo","Rulas"};
        int[][] notas=new int[][] {{5,7,6},{8,9,10},{9,9,7},{3,2,5}};
        int[] fre=new int[11];
        
        
        int[][] tabla ={{1,1,1},{2,2,2},{3,6,3},{4,5,3}};
        int[] posiciones=new int[2];
        
        //EJERCICIO 1
        vectorresultado=fusion(vector1,vector2);
        for(int i=0;i<vectorresultado.length;i++) {
        	System.out.println(vectorresultado[i]);
        }
        
	//EJERCICIO 2
	resul=sumaMatrices(matriz1,matriz2);
	impresion(resul);
		
	//EJERCICIO 3
	nuevo=moverElemento(valor,pos,v1);
	System.out.println();
	for(int j=0;j<nuevo.length;j++){
            System.out.print(nuevo[j] + "\t");
	} 
	System.out.println();
        
	//EJERCICIO 4
	fre=frecuenciasNotas(alumnos,asig,notas);
	for(int j=0;j<fre.length;j++){
            System.out.println("Nota: " + j + " : " + fre[j]);
	} 
       
	//EJERCICIO 5
       
      
	int columna=util.Util.leerInt("¿Cuantas columnas quieres?");
	int[] r=new int[columna];
       
	r=rellenar(columna);
	for(int j=0;j<r.length;j++){
            System.out.print(r[j] + "\t");
	}
       
	//EJERCICIO 6
	int fila=util.Util.leerInt("¿Cuantas filas quieres?");
	int colum=util.Util.leerInt("¿Cuantas columnas quieres?");
      
	int[][] matrizr=new int[fila][colum];
	matrizr=rellenarMatriz(fila,colum);
	impresion(matrizr);
       
	//EJERCICIO 7
	posiciones=arrayMayor(tabla);
	System.out.println("La fila " + posiciones[0] + " Columna " + posiciones[1]);
    
	}
	public static int[] fusion(int[] v1, int[] v2) {
		int[] vr=new int[v1.length+v2.length];
		int i=0;
		int j=0;
		
            while(i<v1.length && j<v2.length){
                if(v1[i]<=v2[j]){
                    vr[i+j]=v1[i];
                    i++;
                }
                else{
                    vr[i+j]=v2[j];
                    j++;
                }
            }
            while(i<v1.length){
		vr[i+j]=v1[i];
		i++;
            }
            while(j<v2.length){
		vr[i+j]=v2[j];
		j++;
            }

        return vr;
	}
	
	public static int[] arrayMayor(int[][] tabla) {
            int[] pos=new int[2];
            int filaM=0;
            int colM=0;
		
            for(int fila=0;fila<tabla.length;fila++) {
		for(int col=0;col<tabla[0].length;col++) {
			if(tabla[filaM][colM]<tabla[fila][col]) {
				filaM=fila;
				colM=col;
			}
		}
            }
            pos[0]=filaM;
            pos[1]=colM;
            return pos;
	}
	
	public static int[][] rellenarMatriz(int fila, int columna){
		int[][] matrizr=new int[fila][columna];
		
		for(int f=0;f<matrizr.length;f++) {
			for(int c=0;c<matrizr[0].length;c++) {
				matrizr[f][c]= (int) Math.ceil(Math.random()*100);
			}
		}
		return matrizr;
	}
	
	public static int[] rellenar(int columna) {
		int resul[]=new int[columna];
		
		for(int i=0;i<resul.length;i++) {
			resul[i]= (int) Math.ceil(Math.random()*100);
		}
		
		return resul;
	}
        
	public static int[] frecuenciasNotas(String[] al,String[] asig, int[][] not) {
		int[] frecuencias=new int[11];
		String asignatura=util.Util.leerStr("¿De qué asignatura quieres saber la frecuencia?");
		int pos=util.Util.buscar(asignatura, asig);
		
		for(int nAl=0;nAl<not.length;nAl++) {
			frecuencias[not[nAl][pos]]++;
		}
		
		return frecuencias;
	}
         
	public static int[] moverElemento(int valor, int pos, int[] v1) {
		
		int i=0;
		int[] nuevo=new int[v1.length+1];
		while(i!=pos+1){
			nuevo[i]=v1[i];
			if(i==pos){
				nuevo[pos]=valor;
			}
	                i++;
		}
	       
		for(int j=pos+1;j<nuevo.length;j++){
			nuevo[j]=v1[j-1];
		}
		
		return nuevo;
		
	}
	
	public static int[][] sumaMatrices(int[][] m1, int[][] m2){
		int [][] r=new int[m1.length][m1[0].length];
		
		for(int fila=0;fila<r.length;fila++) {
			
			for(int col=0;col<r[0].length;col++) {
				
				r[fila][col]=m1[fila][col]+m2[fila][col];
			}
		}
		
		return r;
	}
	
	public static void impresion(int[][] mat) {
		
		System.out.println("\tMATRIZ RESULTADO\n");
		for(int fila=0;fila<mat.length;fila++) {
			
			for(int col=0;col<mat[0].length;col++) {
				System.out.print(mat[fila][col] + "\t");
			}
			System.out.println();
		}
	}
}
