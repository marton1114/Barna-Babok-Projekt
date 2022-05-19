package mockito_test;

import hu.unideb.inf.control.FXMLSearchPageSceneController;
import hu.unideb.inf.model.components.*;

public class FXMLSearchPageSceneControllerTest {

    @Mock
    private FXMLSearchPageSceneController.PCComponentWrapper underTest1;
    private HardDriveDisk hdr = new HardDriveDisk("WD", "Blue", -, 512, 5400, 53.57);
    private Memory mem = new Memory("G.SKILL", "Ripjaws V Series", -, 16, 2, 3200, 61.28);
    private Motherboard mb = new Motherboard("ASUS", "TUF", "GAMING Z690-PLUS WIFI D4", "LGA 1700", "ATX", 4, 289.99);
    private PowerSupply ps = new PowerSupply("CORSAIR", "RM850", "CP-9020235-NA", 850, "80 PLUS GOLD", 129.99);
    private Processor p = new Processor("Intel", "Core i9 12th Gen", "Core i9-12900K", 3.2, "LGA 1700", 16, "Intel UHD Graphics 770", 125, 610.98);

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMock(this);
        underTest1.setHardDriveDisk(hdr);
        underTest1.setMemory(mem);
        underTest1.setMotherboard(mb);
        underTest1.setPowerSupply(ps);
        underTest1.setProcessor(p);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void PCComponentWrapper.getProcessorTest() {
        Processor expected = p;
        assertEquals(expected, underTest1.getProcessor());
    }

    @Test
    public void PCComponentWrapper.getPowerSupplyTest() {
        PowerSupply expected = ps;
        assertEquals(expected, underTest1.getPowerSupply());
    }

    @Test
    public void PCComponentWrapper.getMotherBoardTest() {
        Motherboard expected = mb;
        assertEquals(expected, underTest1.getMotherboard());
    }

    @Test
    public void PCComponentWrapper.getMemoryTest() {
        Memory expected = mem;
        assertEquals(expected, underTest1.getMemory());
    }

    @Test
    public void PCComponentWrapper.getHardDriveDiskTest() {
        HardDriveDisk expected = hdr;
        assertEquals(expected, underTest1.getHardDriveDisk());
    }

}
