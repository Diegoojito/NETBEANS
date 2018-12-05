
package Concesionario;

public class EjercicioConcesionario {

    public static void main(String[] args) {

        String[] vendedores ={"ADRIAN", "CLARA", "SATURNINO", "TOMAS"};
        String[] modelos={ "CAUR", "CLIO", "MEGANE", "SCENIC", "SPACE", "TALISMAN", "TWINGO" };
        double[] precios={10000, 8000, 12000, 13000 , 25000, 14000, 7000};
        String[][] ventas={ {"ADRIAN", "TWINGO"},{"CLARA", "MEGANE"},{"TOMAS", "SCENIC"},{"ADRIAN", "SPACE"},
                            {"ADRIAN", "TWINGO"},{"TOMAS", "SCENIC"}, {"SATURNINO", "TALISMAN"},{"CLARA", "SPACE"},{"CLARA", "MEGANE"},
                            {"TOMAS", "TWINGO"},{"ADRIAN", "TWINGO"},{"SATURNINO", "TWINGO"},{"CLARA", "TWINGO"},{"ADRIAN", "SCENIC"},
                            {"TOMAS", "SPACE"},{"CLARA", "CLIO"},{"ADRIAN", "TWINGO"},{"CLARA", "CLIO"},{"TOMAS", "MEGANE"}};
        int[] vendidos=new int[modelos.length];
        double[] factur=new double[vendedores.length];
        //EJERCICIO 1
        masCaro(precios, modelos);
        //EJERCICIO 2
        vendidos=ventasCoches(ventas,modelos);
        System.out.println("\nARRAY DE COCHES VENDIDOS\n");
        for(int i=0;i<vendidos.length;i++){
            System.out.println(vendidos[i] + " del modelo " + modelos[i]);
        }
        //EJERCICIO 3
        factur=facturacionVendedores(vendedores, modelos, precios,ventas);
        System.out.println("\nARRAY DE DINERO RECAUDADO\n");
        for(int i=0;i<factur.length;i++){
            System.out.println(vendedores[i] + " ha conseguido " + factur[i] + "€");
        }
        }

        public static void masCaro (double[] pr, String[] mod) {
            double may=pr[0];
            int pos=0;
            for(int i=0;i<pr.length;i++) {
                if(pr[i]>may) {
                    may=pr[i];
                    pos=i;
                }
            }
            System.out.println("El coche mas caro es el: " + mod[pos] + " con un precio de " + may);
                }

        public static int[] ventasCoches(String[][] ven, String[] mod) {
            int[] vendidos=new int[mod.length];
            String aux;
            for(int m=0;m<mod.length;m++) {
                aux=mod[m];
                for(int fil=0;fil<ven.length;fil++) {
                    for(int col=0;col<ven[0].length;col++) {
                        if(aux.equals(ven[fil][col])) {
                            vendidos[m]++;
                        }
                    }
                }
            }
            return vendidos;
        }

        public static double[] facturacionVendedores(String[] vended,String[] mod, double[] pr, String[][]ven) {
            double[] ventas=new double[vended.length];
            int[] vendidos=new int[vended.length];
            int pos;
            String aux;
            String modelo;
            for(int vend=0;vend<vended.length;vend++) {
                aux=vended[vend];
                for(int fil=0;fil<ven.length;fil++) {
                    for(int col=0;col<ven[0].length;col++) {
                        if(aux.equals(ven[fil][col])) {
                            modelo=ven[fil][1];
                            pos=util.Util.buscar(modelo, mod);
                            ventas[vend]=ventas[vend]+pr[pos];
                            vendidos[vend]++;
                        }
                    }
                }
            }
            return ventas;
        }
}