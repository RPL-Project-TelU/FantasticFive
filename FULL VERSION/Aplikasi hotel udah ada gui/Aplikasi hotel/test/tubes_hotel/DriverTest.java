package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DriverTest {
    
    public DriverTest() {
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
    public void testTampilText() {
        System.out.println("TampilText");
        Driver instance = new Driver();
        instance.TampilText();
    }

    @Test
    public void testGetTxtName() {
        System.out.println("getTxtName");
        Driver instance = new Driver();
        String expResult = "";
        String result = instance.getTxtName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRadioPosisi() {
        System.out.println("getRadioPosisi");
        Driver instance = new Driver();
        String expResult = "";
        String result = instance.getRadioPosisi();
    }

    @Test
    public void testGetRadioPosisi2() {
        System.out.println("getRadioPosisi2");
        Driver instance = new Driver();
        String expResult = "";
        String result = instance.getRadioPosisi2();
    }

    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        Driver instance = new Driver();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
    }

    @Test
    public void testClearText() {
        System.out.println("clearText");
        Driver instance = new Driver();
        instance.clearText();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Driver.main(args);
    }
    
}
