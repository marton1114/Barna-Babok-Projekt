package mockito_test;

import hu.unideb.inf.model.components.Processor;

public class ProcessorTest {

    @Mock
    private Processor underTest1;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMock(this);
        underTest1.setBrand("test_brand");
        underTest1.setFrequency(2.0);
        underTest1.setId(12345);
        underTest1.setIntegratedGPU("test_gpu");
        underTest1.setModel("test_model");
        underTest1.setNumOfCores(12);
        underTest1.setPower(123);
        underTest1.setPrice(123.45);
        underTest1.setSeries("test_series");
        underTest1.setSocketType("test_socket");
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
    public void getPriceTest() {
        double expected = 123.45;
        assertEquals(expected, underTest1.getPrice());
    }

    @Test
    public void getFrequencyTest() {
        double expected = 2.0;
        assertEquals(expected, underTest1.getFrequency());
    }

    @Test
    public void getSocketTypeTest() {
        String expected = "test_socket";
        assertEquals(expected, underTest1.getSocketType());
    }

    @Test
    public void getNumOfCoresTest() {
        int expected = 12;
        assertEquals(expected, underTest1.getNumOfCores());
    }

    @Test
    public void getIntegratedGPUTest() {
        String expected = "test_gpu";
        assertEquals(expected, underTest1.getIntegratedGPU());
    }

    @Test
    public void getPowerTest() {
        int expected = 123;
        assertEquals(expected, underTest1.getPower());
    }

    @Test
    public void toStringShouldReturnString() {
        String expected = "Gyártó: " + "test_brand" + '\n' +
                "Sorozat: " + "test_series" + '\n' +
                "Modell: " + "test_model" + '\n' +
                "Maximális frekvencia: " + 2.0 + '\n' +
                "Foglalat típusa: " + "test_socket" + '\n' +
                "Magok száma: " + 12 + '\n' +
                "Integrált GPU: " + "test_gpu" + '\n' +
                "Fogyasztás: " + 123 + '\n' +
                "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());
    }

}
