/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos_01_test;

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
public class Entornos_01_testTest {

    private static Object mayor(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Entornos_01_testTest() {
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
     * Test of mayor method, of class Entornos_01_test.
     */
    @Test
    public void testMayor() {
        System.out.println("mayor");
        
        assertEquals(3,Entornos_01_testTest.mayor(3,2,1));
        assertEquals(3,Entornos_01_testTest.mayor(2,1,3));
        assertEquals(3,Entornos_01_testTest.mayor(2,3,2));
        assertEquals(2,Entornos_01_testTest.mayor(-3,2,1));
        assertEquals(0,Entornos_01_testTest.mayor(0,-2,-1));
        assertEquals(1,Entornos_01_testTest.mayor(-3,-2,-1));
        /*int x = 0;
        int y = 0;
        int z = 0;
        Entornos_01_test instance = new Entornos_01_test();
        int expResult = 0;
        int result = instance.mayor(x, y, z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
}
