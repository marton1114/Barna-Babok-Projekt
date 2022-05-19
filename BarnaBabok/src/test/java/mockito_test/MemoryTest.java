package mockito_test;

import hu.unideb.inf.model.components.Memory;

public class MemoryTest {

    @Mock
    private Memory underTest1;

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
        underTest1.setCapacity(12);
        underTest1.setNumOfModules(1);
        underTest1.setFrequency(1234.567);
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
    public void getCapacityTest() {
        int expected = 12;
        assertEquals(expected, underTest1.getCapacity());
    }

    @Test
    public void getNumOfModulesTest() {
        int expected = 1;
        assertEquals(expected, underTest1.getNumOfModules());
    }

    @Test
    public void getFrequencyTest() {
        double expected = 1234.567;
        assertEquals(expected, underTest1.getFrequency());
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
                "Kapacitás: " + 12 + '\n' +
                "Modulok száma: " + 1 + '\n' +
                "Frekcencia: " + 1234.567 + '\n' +
                "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());
    }

}
