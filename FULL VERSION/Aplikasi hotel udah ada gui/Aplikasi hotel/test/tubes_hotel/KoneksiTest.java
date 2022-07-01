package tubes_hotel;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testGetData() {
        System.out.println("getData");
        String SQLString = "";
        Koneksi instance = new Koneksi();
        ResultSet expResult = null;
        ResultSet result = instance.getData(SQLString);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuery() {
        System.out.println("Query");
        String SQLString = "jdbc:mysql://localhost/hotel_tubes";
        Koneksi instance = new Koneksi();
        instance.query(SQLString);
    }
    
}
