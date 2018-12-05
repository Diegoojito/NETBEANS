/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaFor;

/**
 *
 * @author alumno
 */
public class For1 {
    public static void main(String[] args){
        /*
        for(int vc=0; vc<=10; vc++){
            System.out.println(vc);
        }*/
        int vc=0;
        for(System.out.println("hola"); vc<=10; System.out.println("--"+(vc+=2))){
            System.out.println(vc);
        }
        System.out.println(vc);
    }
}