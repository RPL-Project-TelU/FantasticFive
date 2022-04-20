/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rashaad
 */
public class PesanKamarTest {
    
    public PesanKamarTest() {
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
     * Test of getBornDate method, of class PesanKamar.
     */
    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        LocalDate expResult = null;
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getJKAM method, of class PesanKamar.
     */
    @Test
    public void testGetJKAM() {
        System.out.println("getJKAM");
        PesanKamar instance = new PesanKamar();
        String expResult = "";
        String result = instance.getJKAM();
       // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of clearText method, of class PesanKamar.
     */
    @Test
    public void testClearText() {
        System.out.println("clearText");
        PesanKamar instance = new PesanKamar();
        instance.clearText();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class PesanKamar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PesanKamar.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
