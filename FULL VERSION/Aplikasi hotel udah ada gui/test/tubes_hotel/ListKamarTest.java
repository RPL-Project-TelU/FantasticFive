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
public class ListKamarTest {
    
    public ListKamarTest() {
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
     * Test of clearText method, of class ListKamar.
     */
    @Test
    public void testClearText() {
        System.out.println("clearText");
        ListKamar instance = new ListKamar();
        instance.clearText();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBornDate method, of class ListKamar.
     */
    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        ListKamar instance = new ListKamar();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
              // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getJKAM method, of class ListKamar.
     */
    @Test
    public void testGetJKAM() {
        System.out.println("getJKAM");
        ListKamar instance = new ListKamar();
        String expResult = "";
        String result = instance.getJKAM();
        
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of TampilText method, of class ListKamar.
     */
    @Test
    public void testTampilText() {
        System.out.println("TampilText");
        ListKamar instance = new ListKamar();
        instance.TampilText();
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of main method, of class ListKamar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListKamar.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
