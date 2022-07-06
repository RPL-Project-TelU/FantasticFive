package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    @Test
    public void testClearText() {
        System.out.println("clearText");
        ListKamar instance = new ListKamar();
        instance.clearText();
        
    }

    @Test
    public void testGetBornDate() {
        System.out.println("getBornDate");
        ListKamar instance = new ListKamar();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
    }

    @Test
    public void testGetJKAM() {
        System.out.println("getJKAM");
        ListKamar instance = new ListKamar();
        String expResult = "";
        String result = instance.getJKAM();
    }

    @Test
    public void testTampilText() {
        System.out.println("TampilText");
        ListKamar instance = new ListKamar();
        instance.TampilText();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ListKamar.main(args);
    }
    
}
