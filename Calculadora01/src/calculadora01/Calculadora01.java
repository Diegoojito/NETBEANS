/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora01;


/**
 *
 * @author alumno
 */
public class Calculadora01 {
    public Calculadora01(){}
    public int sumar(int i, int j){return i+j;} 
    public int restar(int i, int j){return i-j;} 
    public int multiplicar(int i, int j){return i*j;} 
    public int dividir(int i, int j){return i/j;};
    
    public int mayor(int x, int y, int z){
        int mayor=x;
        if(y>mayor)mayor=y;
        if(z>mayor)mayor=z;
        return mayor;
    }
    
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.print("Introduzca primer número: ");
        x=sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        y=sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        z=sc.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.println("El mayor es: " + x);
            } else {
                System.out.println("el mayor es: " + z);
            }
        } else if (y > z) {
            System.out.println("el mayor es: " + y);
        } else {
            System.out.println("el mayor es: " + z);
        }
    }*/
}
