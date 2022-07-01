package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        LocalDate expResult = null;
    }

    @Test
    public void testGetJKAM() {
        System.out.println("getJKAM");
        PesanKamar instance = new PesanKamar();
        String expResult = "";
        String result = instance.getJKAM();
    }

    @Test
    public void testClearText() {
        System.out.println("clearText");
        PesanKamar instance = new PesanKamar();
        instance.clearText();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PesanKamar.main(args);
    }
    
}
