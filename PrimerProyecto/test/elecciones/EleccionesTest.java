/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class EleccionesTest {
    
    public EleccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Elecciones.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Elecciones.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of votarMunicipio method, of class Elecciones.
     */
    @Test
    public void testVotarMunicipio() {
        System.out.println("votarMunicipio");
        int numVotos = 0;
        int[][] expResult = null;
        int[][] result = Elecciones.votarMunicipio(numVotos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuento method, of class Elecciones.
     */
    @Test
    public void testRecuento() {
        System.out.println("recuento");
        int[][] recuento = null;
        int[][] expResult = null;
        int[][] result = Elecciones.recuento(recuento);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of papeleta method, of class Elecciones.
     */
    @Test
    public void testPapeleta() {
        System.out.println("papeleta");
        int[][] expResult = null;
        int[][] result = Elecciones.papeleta();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of candidatoGanadorPorDistrito method, of class Elecciones.
     */
    @Test
    public void testCandidatoGanadorPorDistrito() {
        System.out.println("candidatoGanadorPorDistrito");
        int[][] votos = null;
        int[] expResult = null;
        int[] result = Elecciones.candidatoGanadorPorDistrito(votos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of votosXDistrito method, of class Elecciones.
     */
    @Test
    public void testVotosXDistrito() {
        System.out.println("votosXDistrito");
        int[][] votos = null;
        int ganador = 0;
        int[] expResult = null;
        int[] result = Elecciones.votosXDistrito(votos, ganador);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ganadorDistrito method, of class Elecciones.
     */
    @Test
    public void testGanadorDistrito() {
        System.out.println("ganadorDistrito");
        int[] votosdistrito = null;
        int expResult = 0;
        int result = Elecciones.ganadorDistrito(votosdistrito);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ganadorElecciones method, of class Elecciones.
     */
    @Test
    public void testGanadorElecciones() {
        System.out.println("ganadorElecciones");
        int[][] votos = null;
        int expResult = 0;
        int result = Elecciones.ganadorElecciones(votos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of votosTotalesXDistrito method, of class Elecciones.
     */
    @Test
    public void testVotosTotalesXDistrito() {
        System.out.println("votosTotalesXDistrito");
        int[][] votos = null;
        int[] expResult = null;
        int[] result = Elecciones.votosTotalesXDistrito(votos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of votosTotalesXCandidato method, of class Elecciones.
     */
    @Test
    public void testVotosTotalesXCandidato() {
        System.out.println("votosTotalesXCandidato");
        int[][] votos = null;
        int[] expResult = null;
        int[] result = Elecciones.votosTotalesXCandidato(votos);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirTabla method, of class Elecciones.
     */
    @Test
    public void testImprimirTabla() {
        System.out.println("imprimirTabla");
        String[] candidatos = null;
        String[] distritos = null;
        int[][] votos = null;
        Elecciones.imprimirTabla(candidatos, distritos, votos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarCandidatos method, of class Elecciones.
     */
    @Test
    public void testCargarCandidatos() {
        System.out.println("cargarCandidatos");
        String[] expResult = null;
        String[] result = Elecciones.cargarCandidatos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarDistritos method, of class Elecciones.
     */
    @Test
    public void testCargarDistritos() {
        System.out.println("cargarDistritos");
        String[] expResult = null;
        String[] result = Elecciones.cargarDistritos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarVotos method, of class Elecciones.
     */
    @Test
    public void testCargarVotos() {
        System.out.println("cargarVotos");
        int[][] expResult = null;
        int[][] result = Elecciones.cargarVotos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
