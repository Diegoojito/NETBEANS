package elecciones;

/**
 *
 * @author alumno
 */
public class Elecciones {
    // 1.
    public static void main(String[] args) {
        //EJERCICIO 1
        String[] candidatos=cargarCandidatos();
        String[] distritos=cargarDistritos();
        int[][] votos=cargarVotos();
        
        int[] votosCandidato=new int[4];
        int[] votosDistrito=new int[5];
        
        //EJERCICIO 2
        System.out.println("\tELECCIONES\n");
        imprimirTabla(candidatos,distritos,votos);
        System.out.println("\n");
        
        //EJERCICIO 3
        votosCandidato=votosTotalesXCandidato(votos);
        for(int i=0;i<votosCandidato.length;i++){
            System.out.println(candidatos[i] + "\t\t" + votosCandidato[i]);
        }
        System.out.println("\n");
        
        //EJERCICIO 4
        votosDistrito=votosTotalesXDistrito(votos);
        for(int i=0;i<votosDistrito.length;i++){
            System.out.println(distritos[i] + "\t\t" +votosDistrito[i]);
        }
        System.out.println("\n");
        
        //EJERCICIO 5
        int posganador;
        posganador=ganadorElecciones(votos);
        System.out.println("El candidato ganador es: " + candidatos[posganador]);
        System.out.println("\n");
        
        //EJERCICIO 6
        /*String distrito=util.Util.leerStr("¿De que distrito quieres saber el ganador?");
        int posganadordistrito=util.Util.buscar(distrito, distritos);
        int[] votosdistritoganador=votosXDistrito(votos,posganadordistrito);
        int indice=ganadorDistrito(votosdistritoganador);
        
        System.out.println("El candidato ganador es: " + candidatos[indice]);
        System.out.println("\n");*/
        
        //EJERCICIO 7
        int[] ganadordistrito=new int[5];
        ganadordistrito=candidatoGanadorPorDistrito(votos);
         for(int i=0;i<ganadordistrito.length;i++){
            System.out.println(distritos[i] + "\t\t" +candidatos[ganadordistrito[i]] + "\t\t" + ganadordistrito[i]);   
        }
         System.out.println();
         
        //EJERCICIO 8
        int[][] listavotos=new int[5][4];
        listavotos=papeleta();
        
        //EJERCICIO 9
        int numvotosaleatorios=200;
        int[][] votosaleatorios=votarMunicipio(numvotosaleatorios);
        
        //EJERCICIO 10
        int[][] votospoblacion=recuento(votosaleatorios);
        System.out.println("\tTOTAL VOTOS ALEATORIOS\n");
        imprimirTabla(candidatos,distritos,votospoblacion);
       
        
    }
    public static int[][] votarMunicipio(int numVotos){
        int[][] votoaleatorio=new int[5][4];
        for(int i=0;i!=numVotos;i++){
            votoaleatorio=papeleta();
        }
        
        return votoaleatorio;
    	
    }
    public static int[][] recuento(int[][] recuento){
        int[][] listavotos=new int[5][4];
        int[][] votoaleatorio=new int[5][4];
	int numVotos=200;
        for(int i=0;i!=numVotos;i++) {
        	votoaleatorio=votarMunicipio(i);
        	for(int dis=0;dis<listavotos.length;dis++){
        		for(int can=0;can<listavotos[0].length;can++){
        			listavotos[dis][can]+=votoaleatorio[dis][can];
                	}
            	}
  
        	}  
        return listavotos;
    }
    public static int[][] papeleta (){
        // Fernando cod.
        // int [] new int[2];
        //voto[0]= [(int) (Math.random()*5)]
        //voto[1]= [(int) (Math.random()*4)]
       
        int[][] listavotos=new int[5][4];
        listavotos[(int) (Math.random()*5)][(int)(Math.random()*4)]++;
   
        return listavotos;
    }
    public static int[] candidatoGanadorPorDistrito(int[][] votos){
        int[] gdis=new int[votos.length];
        int cantidad=0;
        int pos=0;
        for(int dis=0;dis<votos.length;dis++){
            cantidad=0;
            for(int can=0;can<votos[0].length;can++){
                if(votos[dis][pos]<votos[dis][can]){
                    pos=can;
                }
            }
            gdis[dis]=pos;
        }
        
        return gdis;
    }
    public static int[] votosXDistrito(int[][] votos, int ganador){
        int[] distrito=new int[votos[0].length];
        for(int i=0;i<distrito.length;i++){
            distrito[i]=votos[ganador][i];
        }
        return distrito;
    }
    public static int ganadorDistrito(int[] votosdistrito){
       int dis=0; 
       int max=0;
       for(int i=0;i<votosdistrito.length;i++){
           if(votosdistrito[dis]<votosdistrito[i]){
               dis=i;
           }
       }
       
       return dis;
    }
    public static int ganadorElecciones(int[][] votos){
        int posganador=0;
        int max=0;
        int[] votcan=votosTotalesXCandidato(votos);
        
        for(int i=0;i<votcan.length;i++){
            if(max<votcan[i]){
                max=votcan[i];
            }
            if(votcan[i]==max){
                posganador=i;
            }
        }
        
        return posganador;
    }
    public static  int[] votosTotalesXDistrito(int[][] votos){
        int[] votdis=new int[votos.length];
        int cantidad=0;
        for(int dis=0;dis<votos.length;dis++){
            cantidad=0;
            for(int can=0;can<votos[0].length;can++){
                cantidad=cantidad+votos[dis][can];
            }
            votdis[dis]=cantidad;
        }
        
        return votdis; 
    }
    
    public static  int[] votosTotalesXCandidato(int[][] votos){
        int[] votcan=new int[votos[0].length];
        int cantidad=0;
        for(int can=0;can<votos[0].length;can++){
            cantidad=0;
            for(int dis=0;dis<votos.length;dis++){
                cantidad=cantidad+votos[dis][can];
            }
            votcan[can]=cantidad;
        }
        
        return votcan; 
    }
    
    public static void imprimirTabla(String [] candidatos, String [] distritos,int[][] votos){
        // int [][] aRecuento = new int[distrito.length][candidatos.length];
        //for( int v=0; v<votosPapeleta.length;v++{
    // d=votosPapeletas[v][0]
    // c=votosPapeletas[v][1]
    //aRecuentos[d][c]++;
    //}
    //retum aRecuento;
    //}
        /**
         * la llamada puede se
         * int [][] votosMunicipio=votarMunicipio(150000);
         */
        
        System.out.print("\t\t");
        for(int i=0;i<candidatos.length;i++){
            System.out.print(candidatos[i] + "\t");
        }
        System.out.println();
	for(int fila=0;fila<votos.length;fila++) {
            System.out.print(distritos[fila] + "\t");
            for(int col=0;col<votos[0].length;col++) {
		System.out.print( votos[fila][col] + "\t\t");
            }
            System.out.println();
	}
        
    }
    
    public static String[] cargarCandidatos(){
       
        String[] candidatos=new String[]{"CARMINA   ","ALCORNOCAL","CARAVACA","VILLAPLIS"};
        return candidatos;
        
    }
    
    public static String[] cargarDistritos(){
       
        String[] distritos=new String[]{"CHAMBERI","MALASANA","MONCLOA  ","USERA   ","VALLECAS"};
        return distritos;
        
    }
    
    public static int[][] cargarVotos(){
        
        int[][] votos=new int[][]{{194,280,206,450},{180,200,320,160},{221,150,140,200},{432,260,521,140},{820,310,846,180}};
        return votos;
    }
}
    
/**
 * 11 Escribe un metodo que genere un array de tipo String de dos elementos que correspondera el elementos(0)al nombre del distrito y el 1 al nombre  del candidato.Se generara
 *  ambos de manera aleatorioa
 * Strting[] papeletasVotostexto(String[] distritos,String[] candidatos);* /
 
 
 /* 12 lo mismo que el 9  pero con votos de tipo String
 *   String[][] votarMunicipioTexto(int numPersonas)
 * 
 * 13Igual que el 10 pero con votos de tipo String
 *
 * int[][] recuentoPapeletaTexto(String [] candidatos, String [] distritos,String[][] votosPapeletasTexto)
 */
public static int[][] recuentroPapeletaTexto(String[]distrito,String[]candidatos,String[][]votosPapeletasTexto){

}