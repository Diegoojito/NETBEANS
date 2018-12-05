/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concesionario;

/**
 *
 * @author alumno
 */
public class coches {
     public static void main(String[] args){
        //EJERCICIO 1
        
        String[] vendedores=cargarVendedores();
        String[] modelos=cargarModelos();
        double[] precios=cargarPrecios();
        String[][] ventas=cargarVentas();
        
        //EJERCICIO 2
        
        listaPrecios(modelos, precios);
        
        //EJERCICIO 3 A
        
        int[] modelosvendidos=ventasCochesModelos(ventas,modelos);
        
        //EJERCICIO 3 B
        listadoModelosVendidos(modelos,modelosvendidos);
        
        //EJERCICIO 4 A
        int[] ventasvendedores=ventasCochesVendedores(ventas,vendedores);
        
        //EJERCICIO 4B
        ventasCochesVendedores(vendedores,ventasvendedores);
        
        //EJERCICIO 5
        int[][] vendidos=procesarVentas(vendedores,modelos,ventas);
        
        
        
        //EJERCICIO 6
        liquidarVentasVendedores(vendedores,modelos,vendidos,precios);
        
        //ESCRIBIR UN PROGRAMA QUE NOS MUESTRE UNA TABLA CON LAS VENTAS REALIZADAS DE CADA MODELO(FILA) POR CADA VENDEDOR(COLUMNA)
        imprimirTabla(modelos,vendedores,vendidos);
        
        // reescribir informe de ventas para que muestre los iguiente total coches 
        
    }
    public static void imprimirTabla(String[] modelos,String[] vendedores,int[][] vendidos){
        
         for (String vendedore : vendedores) {
             System.out.print("\t\t" + vendedore);
         }
        System.out.println();
        for(int fil=0;fil<vendidos.length;fil++){
            System.out.print(modelos[fil]+"\t\t");
            for(int col=0;col<vendidos[0].length;col++){
                System.out.print(vendidos[fil][col]+"\t\t");
            }
            System.out.println();
        }
        
    }
    
    public static void liquidarVentasVendedores(String[] vendedores,String[] modelos, int[][] vendidos,double[] precios) {
    	
    	for(int v=0;v<vendedores.length;v++) {
            System.out.println("NOMBRE"+"\t"+"MODELO"+"\t\t"+"PRECIO" +"\t\t"+"UNIDADES"+"\t"+"IMPORTE");
            System.out.println("\n"+vendedores[v] +"\n");
            int acu=0;
            for(int m=0;m<modelos.length;m++) {
    		acu+=vendidos[m][v]*precios[m];
    		System.out.println("\t"+modelos[m] + "\t\t" + precios[m] + "\t\t" + vendidos[m][v] + "\t ===> \t" + vendidos[m][v]*precios[m] + "\t€");
            }
            System.out.println("\n\tTOTAL IMPORTE " + vendedores[v] + " ==> "+ acu+ "  €"+"\n"+"==============================================================================================");
     	}   	
    }
    
    public static int[][] procesarVentas(String[] vendedores,String[] modelos, String[][] ventas){
        int[][] vendidos=new int[modelos.length][vendedores.length];
        int m,v;
         for (String[] venta : ventas) {
             m = util.Util.buscar(venta[1], modelos);
             v = util.Util.buscar(venta[0], vendedores);
             vendidos[m][v]++;
         }
        return vendidos;
    }
    
    public static void ventasCochesVendedores(String[] vendedores,int[] ventasvendedores){
        
        System.out.println("NUMERO DE COCHES POR VENDEDOR\n");
        for(int i=0;i<ventasvendedores.length;i++){
            System.out.println(vendedores[i]+ "  ==>\t" +ventasvendedores[i]);
        }
        System.out.println("\n");
    }
    
    public static int[] ventasCochesVendedores(String[][] ventas,String[] vendedores){
        int[] ventasvendedores=new int[vendedores.length];
        int v=0;
         for (String[] venta : ventas) {
             v = util.Util.buscar(venta[0], vendedores);
             ventasvendedores[v]++;
         }
        
        return ventasvendedores;
    }
    
    public static void listadoModelosVendidos(String[] modelos, int[] modelosvendidos){
        
        System.out.println("NUMERO DE COCHES VENDIDOS\n");
        for(int i=0;i<modelosvendidos.length;i++){
            System.out.println(modelos[i]+ "  ==>\t" +modelosvendidos[i]);
            
        }
        System.out.println("\n");
    }
    
    public static int[] ventasCochesModelos(String[][] ventas, String[] modelos){
        int[] modelosvendidos=new int[modelos.length];
        int m=0;
         for (String[] venta : ventas) {
             m = util.Util.buscar(venta[1], modelos);
             modelosvendidos[m]++;
         }
        
        return modelosvendidos;
    }
      public static int[] ventasCochesModelosTablas(String[][] ventas, String[] modelos,double [][] ventas2){
        int[] modelosvendidos=new int[modelos.length];
        int m=0;
        for(int i=0;i<ventas.length;i++){
            m=util.Util.buscar(ventas[i][1], modelos);
            modelosvendidos[m]++;
                  
        }
        
        return modelosvendidos;
    }
    
    public static void listaPrecios(String[] modelos, double[] precios){
        
        System.out.println("LISTADO DE PRECIOS DE LOS COCHES");
        for(int i=0;i<modelos.length;i++){
            System.out.println("EL COCHE => " + modelos[i] +"\tcuesta=>\t" + precios[i]);
        }
        System.out.println();
    }
    
    public static String[] cargarVendedores(){
        String[] vendedores=new String[]{"ADRIAN","CLARA","SATURNINO","TOMAS"};
        return vendedores;
    }
    
    public static String[] cargarModelos(){
        String[] modelos=new String[]{"CLIO","MEGANE","SCENIC","SPACE","TALISM","TWINGO"};
        return modelos;
    }
    
    public static double[] cargarPrecios(){
        double[] precios=new double[]{10000, 8000, 12000, 13000 , 25000, 7000};
        return precios;
    }
    
    public static String[][] cargarVentas(){
        String[][] ventas=new String[][]{{"TOMAS", "MEGANE"},{"ADRIAN", "SCENIC"},{"ADRIAN", "TWINGO"},{"CLARA", "MEGANE"},{"TOMAS", "SCENIC"},{"ADRIAN", "SPACE"},    
                {"ADRIAN", "TWINGO"},{"TOMAS", "SCENIC"},{"SATURNINO", "TALISM"},{"CLARA", "SPACE"},{"CLARA", "MEGANE"},{"TOMAS", "TWINGO"},{"ADRIAN", "TWINGO"},   
                {"SATURNINO", "TWINGO"},{"CLARA", "TWINGO"},{"ADRIAN", "SCENIC"},{"TOMAS", "SPACE"},{"CLARA", "CLIO"},{"ADRIAN", "TWINGO"},{"CLARA", "CLIO"}};
        return ventas;
    }
   
}
