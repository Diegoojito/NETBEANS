/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesalumnosnotas3;

/**
 *
 * @author alumno
 */
public class GesAlumnosNotas3 {
    public static void listadoCompletoNotas(String[] alumnos,String[] asignaturas,int[][] notas){
             // Encabezamiento
        System.out.print("Alumno");
        for(int i=0;i<asignaturas.length;i++){
            System.out.print("\t"+asignaturas[i]);
        }
        System.out.println("\t -Media Alumno-");             
            // Cuerpo del listado
        for(int nAlu=0; nAlu<alumnos.length; nAlu++){
            System.out.print("\n"+alumnos[nAlu]);
            
            int acuNota = 0;  // Acumulador de notas de cada alumno            
            for(int nAsig=0; nAsig<asignaturas.length;nAsig++){
                System.out.print("\t\t"+notas[nAlu][nAsig]);
                acuNota+=notas[nAlu][nAsig];
            }
            System.out.println("\t->"+(double)acuNota/notas[nAlu].length);
        }
    }
    
    public static void listadoNotasAsignaturas(String[] alu, String[] asig,int[][]not){
        /*
        for(int nAsig=0;nAsig<alu.length;nAsig++){
            System.out.println("\n"+asig[nAsig]);
        for(int nAlu=0;nAlu<alu.length;nAlu++){
            System.out.println(alu[nAlu]+"\t\t"+not[nAlu][nAsig]);
        }
        }   */  
        // 1º leer nombre de asignatura buscar y ver su índice
        String aBuscar=util.Util.leerStr("Introduce nombre asignatura a listar");
        int nAsig=util.Util.buscar(aBuscar, asig);
        if(nAsig==-1)nAsig=0;
        int acuNota=0;
        // Mostrar listado para esa asignatura
        System.out.println("Listado de notas asignatura: " + asig[nAsig]);
        for(int nAlu=0; nAlu<alu.length;nAlu++){
            System.out.println(alu[nAlu]+" Nota: "+not[nAlu][nAsig]);
            acuNota+=not[nAlu][nAsig];
        }
        System.out.println("La media es: "+acuNota/alu.length);
        System.out.println("Fin del listado");
        };
    
    public static void BoletinNotasAlumno(String[] alu, String[] asig,int[][]not){
        String aBuscar=util.Util.leerStr("Introduce nombre del alumno: ");
        int nAlu=util.Util.buscar(aBuscar, alu);
        if(nAlu==-1)nAlu=0;
        int acuNota=0;
        
        System.out.println("Listado de notas del alumno: "+alu[nAlu]);
        for(int nAsig=0; nAsig<asig.length;nAsig++){
            System.out.println(asig[nAsig]+"  Nota: "+not[nAlu][nAsig]);
            acuNota+=not[nAlu][nAsig];
        }
        System.out.println("La media es: "+acuNota/asig.length);
        System.out.println("Fin del listado");
    };
    
    /*public static double [] mediasAlumnos(String[] alu, String[] asig,int[][]not){
      double[] mediaAlu = new double[not.length];
      double acuNota;
      for(int nAlu=0;nAlu<alu.length;nAlu++){
            
              acuNota=0;
                for(int nAsig=0;nAsig<asig.length;nAsig++){
                    acuNota+=not[nAlu][nAsig];
                }            
            mediaAlu[nAlu]=acuNota/asig.length;
        }
      return mediaAlu;
    }
    
    public static double [] mediasAsignaturas(String[] alu, String[] asig,int[][]not){
      double[] mediaAsig = new double[not[0].length];
      double acuNota=0;
      
          
      for(int nAsig=0;nAsig<asig.length;nAsig++){
            
              acuNota=0;
                for(int nAlu=0;nAlu<alu.length;nAlu++){
                    acuNota=acuNota+not[nAlu][nAsig];
                }            
            mediaAsig[nAsig]=acuNota/alu.length;
        }
        
      
      
      return mediaAsig;
    }*/
    public static double[] mediasAlumnos(int[][]notas){
        double[] mediaAlu = new double[notas.length];
        
        for(int nAlu=0; nAlu<notas.length;nAlu++){
            
            int acuNotas=0;
            
            for(int nAsig=0;nAsig<notas[nAlu].length;nAsig++){
                acuNotas+=notas[nAlu][nAsig];
            }
            mediaAlu[nAlu]=acuNotas/notas[nAlu].length;
        }
        return mediaAlu;
    }
    
    public static double[] mediasAsignaturas(int[][]notas){
        double[] mediaAsig = new double[notas[0].length];
        
        for(int nAsig=0; nAsig<notas[0].length;nAsig++){
            
            int acuNotas=0;
            
            for(int nAlu=0;nAlu<notas.length;nAlu++){
                acuNotas+=notas[nAlu][nAsig];
            }
            mediaAsig[nAsig]=acuNotas/notas.length;
        }
        return mediaAsig;
    }
    
    
    private static void listadoMediasALumnos(String[] alu, int[][] notas){
        System.out.println("\n\nLISTADO DE MEDIAS DE ALUMNOS");
        for(int nAlu=0; nAlu<alu.length;nAlu++){
            System.out.print("Alumno: "+alu[nAlu]);
            int acuNotas=0;
            for(int nAsig=0; nAsig<notas[nAlu].length;nAsig++){
                acuNotas+=notas[nAlu][nAsig];
            }
            System.out.print("\t Media: "+acuNotas/notas[nAlu].length);
        }
        System.out.println("***FIN DEL LISTADO");
    }
    private static void listadoMediasAsignaturas(String[] asig, int[][] notas){
        System.out.println("\n\nLISTADO DE MEDIAS DE ASIGNATURAS");
        for(int nAsig=0; nAsig<asig.length;nAsig++){
            System.out.print("Asignatura: "+asig[nAsig]);
            int acuNotas=0;
            for(int nAlu=0; nAlu<notas.length;nAlu++){
                acuNotas+=notas[nAlu][nAsig];
            }
            System.out.print("\t Media: "+acuNotas/notas.length);
        }
        System.out.println("***FIN DEL LISTADO");
    }
    
    public static void introducirNotasAsig(int[][] n, String[] a){
    //Introducir nombre asignatura, y las notas de los alumnos introduciendo su numero de lista
        
    String asiB = util.Util.leerStr("Introduce asignatura: ");
    int nAsig = util.Util.buscar(asiB, a);
    
    int nAlumno=util.Util.leerInt("Introduce numero de lista: ");
    
    while(nAlumno >= 0 && nAlumno < n.length){
        n[nAlumno][nAsig] = util.Util.leerInt("Nota?: ");        
        nAlumno = util.Util.leerInt("Introduce numero de lista: ");
        }
        
    }
    
    
    // Crear y cargar datos
    public static void main(String[] args){
        
        // Crear y cargar datos
        String[] alumnos = {"Pedro","Juan","Maria","Fran"};
        String[] asignaturas = {"Programación", "Bases de datos", "Entorno"};
        int[][] notas ={{3,4,5},{5,6,7},{2,1,3},{6,5,9}};
        
/*
        // Listado de alumnos y notas
        listadoCompletoNotas(alumnos,asignaturas,notas);
       // Listado de notas por asignaturas
       listadoNotasAsignaturas(alumnos,asignaturas,notas);
       // Listado de notas por alumno
       BoletinNotasAlumno(alumnos,asignaturas,notas);
       // programa que escriba un informa con la nota media de cada alumno
       listadoMediasALumnos(alumnos,notas);
       // programa que escriba un informa con la nota media de cada asignatura
       listadoMediasAsignaturas(asignaturas,notas);
       
    //Progrma que cree y devuelva un vector con las notas medias de los alumnos.   
    double[] mAl= mediasAlumnos(notas);
    System.out.println("***Medias alumnos");
    util.Util.verArray(mAl);
    
    //Programa que cree y devuelva un vector con las notas medias de las asignaturas.
    double[] mAs= mediasAsignaturas(notas);
    util.Util.verArray(mAs);
    System.out.println("***Medias asignaturas");*/

    introducirNotasAsig(notas, asignaturas);
    listadoCompletoNotas(alumnos,asignaturas,notas);
}
}