package mockito_test;

import hu.unideb.inf.model.components.*;
import hu.unideb.inf.model.configs.Config;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTest {

    //@Mock
    //private Config underTest1;
    //private HardDriveDisk hdr = new HardDriveDisk(); /*new HardDriveDisk("WD", "Blue", -, 512, 5400, 53.57);*/
    //private Memory mem = new Memory("G.SKILL", "Ripjaws V Series", -, 16, 2, 3200, 61.28);
    //private Motherboard mb = new Motherboard("ASUS", "TUF", "GAMING Z690-PLUS WIFI D4", "LGA 1700", "ATX", 4, 289.99);
    //private PowerSupply ps = new PowerSupply("CORSAIR", "RM850", "CP-9020235-NA", 850, "80 PLUS GOLD", 129.99);
    //private Processor p = new Processor("Intel", "Core i9 12th Gen", "Core i9-12900K", 3.2, "LGA 1700", 16, "Intel UHD Graphics 770", 125, 610.98);

//    public class TestObjects {
    /*public HardDriveDisk hdr = new HardDriveDisk();
    public Memory mem = null;
    public Motherboard mb = null;
    public PowerSupply psy = null;
    public Processor p = null;

    public HardDriveDisk hdrTest = new HardDriveDisk();
    public Memory memTest = null;
    public Motherboard mbTest = null;
    public PowerSupply psyTest = null;
    public Processor pTest = null;
//    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @Test
    public void setUp() {
        hdrTest.setBrand("WD");
        hdrTest.setSeries("Blue");
        hdrTest.setModel("-");
        hdrTest.setCapacity(520);
        hdrTest.setSpeed(5400);
        hdrTest.setPrice(53.57);
        hdrTest.setId(1);

        hdr.setBrand("WD");
        hdr.setSeries("Blue");
        hdr.setModel("-");
        hdr.setCapacity(520);
        hdr.setSpeed(5400);
        hdr.setPrice(53.57);
        hdr.setId(1);

        System.out.println(hdrTest.equals(hdr));
    }*/
/*
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getNameTest() {
        String expected = "test_config";
        assertEquals(expected, underTest1.getName());
    }

    @Test
    public void getHardDriveDiskTest() {
        HardDriveDisk expected = hdr;
        assertEquals(expected, underTest1.getHardDriveDisk());
    }

    @Test
    public void getMemoryTest() {
        Memory expected = mem;
        assertEquals(expected, underTest1.getMemory());
    }

    @Test
    public void getMotherBoardTest() {
        Motherboard expected = mb;
        assertEquals(expected, underTest1.getMotherboard());
    }

    @Test
    public void getPowerSupplyTest() {
        PowerSupply expected = ps;
        assertEquals(expected, underTest1.getPowerSupply());
    }

    @Test
    public void getProcessorTest() {
        Processor expected = p;
        assertEquals(expected, underTest1.getProcessor());
    }

    @Test
    public void getPriceTest() {
        double expected = 12345.6789;
        assertEquals(expected, underTest1.getPrice());
    }*/

}
