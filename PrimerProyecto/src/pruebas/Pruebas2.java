/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author alumno
 */
public class Pruebas2 {
    public static void main(String[] args){
        int[] vectorTocho = new int[100000];
        int busca = (int) Math.ceil(Math.random() * 100000);
        int posicion;
        
        for(int i=0; i<vectorTocho.length;i++){
            
            vectorTocho[i]= i*10 + (int) Math.ceil(Math.random() * 10);
            
        }
        
        do{
            busca = (int) Math.ceil(Math.random() * 100000);
            System.out.println("Valor que buscamos...."+busca);
            posicion =util.Util.buscarD(busca,vectorTocho);
            if (posicion!=-1){
                System.out.println("Posición= "+posicion+" valor"+vectorTocho[posicion]);
            }else{
                System.out.println("No encontrado: "+busca);
            }
        }while(posicion==-1);
    }
}
