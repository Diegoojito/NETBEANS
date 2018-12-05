/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora01;

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
public class Calculadora01Test {
    
    public Calculadora01Test() {
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
     * Test of sumar method, of class Calculadora01.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int i = 0;
        int j = 0;
        Calculadora01 instance = new Calculadora01();
        int expResult = 0;
        int result = instance.sumar(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora01.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int i = 0;
        int j = 0;
        Calculadora01 instance = new Calculadora01();
        int expResult = 0;
        int result = instance.restar(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora01.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int i = 0;
        int j = 0;
        Calculadora01 instance = new Calculadora01();
        int expResult = 0;
        int result = instance.multiplicar(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora01.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int i = 0;
        int j = 0;
        Calculadora01 instance = new Calculadora01();
        int expResult = 0;
        int result = instance.dividir(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayor method, of class Calculadora01.
     */
    @Test
    public void testMayor() {
        System.out.println("el mayor");
        
        assertEquals(3,Calculadora01Test.mayor(3,2,1));
        assertEquals(3,Calculadora01Test.mayor(2,1,3));
        assertEquals(3,Calculadora01Test.mayor(2,3,2));
        assertEquals(3,Calculadora01Test.mayor(-3,2,1));
        assertEquals(3,Calculadora01Test.mayor(0,-2,-1));
        assertEquals(3,Calculadora01Test.mayor(-3,-2,-1));
    }
        /*int x = 0;
        int y = 0;
        int z = 0;
        Calculadora01 instance = new Calculadora01();
        int expResult = 0;
        int result = instance.mayor(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
