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
public class Pruebas {
    public static void main(String[] args){
        
        String[] miArray = {"PEPE","LUIS","MARIA","CARLOS","ZACARIAS","AARON","LUISA","BERNARDO"};
        util.Util.verArray(miArray);
        String[] miArrayOrdenado = util.Util.ordenarStr(miArray);
        System.out.println("Array ordenados: ");
        util.Util.verArray(miArray);
        
    }
}
