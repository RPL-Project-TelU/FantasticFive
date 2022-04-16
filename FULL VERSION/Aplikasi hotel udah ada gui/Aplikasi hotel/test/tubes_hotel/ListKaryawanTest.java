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


public class ListKaryawanTest {
    
    public ListKaryawanTest() {
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
     * Test of TampilText method, of class ListKaryawan.
     */
    @Test
    public void testTampilText() {
        System.out.println("TampilText");
        ListKaryawan instance = new ListKaryawan();
        instance.TampilText();
        // TODO review the generated test code and remove the default call to fail.
          }

    /**
     * Test of getTxtName method, of class ListKaryawan.
     */
    @Test
    public void testGetTxtName() {
        System.out.println("getTxtName");
        ListKaryawan instance = new ListKaryawan();
        String expResult = "";
        String result = instance.getTxtName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getRadioPosisi method, of class ListKaryawan.
     */
    @Test
    public void testGetRadioPosisi() {
        System.out.println("getRadioPosisi");
        ListKaryawan instance = new ListKaryawan();
        String expResult = "";
        String result = instance.getRadioPosisi();
        // TODO review the generated test code and remove the default call to fail.
         }

    /**
     * Test of getRadioPosisi2 method, of class ListKaryawan.
     */
    @Test
    public void testGetRadioPosisi2() {
        System.out.println("getRadioPosisi2");
        String expResult = "";
    
        // TODO review the generated test code and remove the default call to fail.
            }

    /**
     * Test of getBornDate method, of class ListKaryawan.
     */
    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        ListKaryawan instance = new ListKaryawan();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
        // TODO review the generated test code and remove the default call to fail.
       }

    /**
     * Test of clearText method, of class ListKaryawan.
     */
    @Test
    public void testClearText() {
        System.out.println("clearText");
        ListKaryawan instance = new ListKaryawan();
        instance.clearText();
        // TODO review the generated test code and remove the default call to fail.
           }

    /**
     * Test of main method, of class ListKaryawan.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListKaryawan.main(args);
        // TODO review the generated test code and remove the default call to fail.
         }
    
}
