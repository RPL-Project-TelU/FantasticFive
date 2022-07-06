package tubes_hotel;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RegistrasiTest {
    
    public RegistrasiTest() {
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
        Registrasi instance = new Registrasi();
        LocalDate expResult = null;
        LocalDate result = instance.getBornDate();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registrasi.main(args);
    }
    
}
