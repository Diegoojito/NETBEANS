/*
 * Leer un número de tecladon y calcular e imprimir los n primeros númerosprimos
 */
package primos;

/**
 *
 * @author alumno
 */
public class Primos {
   public static void main(String [] args){
       int n;            // Es el primer nùmero que va a leer
       int contaPrimos;  // para saber cuantos llevamos
       int num;          // el número que vamos a probar
       int div;          // el divisor que vamos a ver
       
       
       n = util.Util.leerInt("cunatos primos quieres?:");
       num = 1;
       
       contaPrimos = 0;
       while (contaPrimos < n){
           
           div= 2;
           while((div < num ) && (num % div != 0)){
             div++;
           }
           if (num <= div){// es primo
               contaPrimos++;
               
               System.out.println(contaPrimos+"ª primos"+num);
           }
           num++;
       }
       
       
   }
   
}