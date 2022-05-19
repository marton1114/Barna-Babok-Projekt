package mockito_test;

import hu.unideb.inf.model.components.PowerSupply;

public class PowerSupplyTest {

    @Mock
    private PowerSupply underTest1;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMock(this);
        underTest1.setId(12345);
        underTest1.setBrand("test_brand");
        underTest1.setSeries("test_series");
        underTest1.setModel("test_model");
        underTest1.setPower(123);
        underTest1.setEnergyEfficiency("test_energ-eff");
        underTest1.setPrice(123.45);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getBrandTest() {
        String expected = "test_brand";
        assertEquals(expected, underTest1.getBrand());
    }

    @Test
    public void getSeriesTest() {
        String expected = "test_series";
        assertEquals(expected, underTest1.getSeries());
    }

    @Test
    public void getModelTest() {
        String expected = "test_model";
        assertEquals(expected, underTest1.getModel());
    }

    @Test
    public void getPowerTest() {
        int expected = 123;
        assertEquals(expected, underTest1.getPower());
    }

    @Test
    public void getEnergyEfficiencyTest() {
        String expected = "test_energ-eff";
        assertEquals(expected, underTest1.getEnergyEfficiency());
    }

    @Test
    public void getPriceTest() {
        double expected = 123.45;
        assertEquals(expected, underTest1.getPrice());
    }

    @Test
    public void toStringShouldReturnString() {
        String expected = "Gyártó: " + "test_brand" + '\n' +
                "Sorozat: " + "test_series" + '\n' +
                "Modell: " + "test_model" + '\n' +
                "Effektivitás: " + "test_energ-eff" + '\n' +
                "Teljesítmény: " + 123 + '\n' +
                "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());
    }

}
