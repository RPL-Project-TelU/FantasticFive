/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_hotel;

import java.sql.ResultSet;
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
public class KoneksiTest {
    
    public KoneksiTest() {
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
     * Test of getData method, of class Koneksi.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String SQLString = "";
        Koneksi instance = new Koneksi();
        ResultSet expResult = null;
        ResultSet result = instance.getData(SQLString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of query method, of class Koneksi.
     */
    @Test
    public void testQuery() {
        System.out.println("Query");
        String SQLString = "jdbc:mysql://localhost/hotel_tubes";
        Koneksi instance = new Koneksi();
        instance.query(SQLString);
        // TODO review the generated test code and remove the default call to fail.
 
    }
    
}
