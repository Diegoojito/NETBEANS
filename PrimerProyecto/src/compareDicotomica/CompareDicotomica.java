/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareDicotomica;

/**
 *
 * @author alumno
 */
public class CompareDicotomica {

 
    public static int buscarString (String b, String[] v) {

        int cont=1;
        int i=0;
        int d=v.length;
        int c=(i+d)/2;
        int r=-1;
                           
        while(i<d && !v[c].equals(b)) {

            if(b.compareTo(v[c])<0) {

                i=c+1;
            }
            else {
            d=c-1;
            }
        cont++;
        c=(i+d)/2;
        }
        if(v[c].equals(b)){
        r=c;
        }
    System.out.println(cont);
    return r;

    }

}
