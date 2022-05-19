package mockito_test;


import hu.unideb.inf.model.components.Motherboard;

public class MotherboardTest {

    @Mock
    private Motherboard underTest1;

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
        underTest1.setSocketType("test_socket");
        underTest1.setFormFactor("test_factor");
        underTest1.setNumOfRamSockets(12);
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
    public void getSocketTypeTest() {
        String expected = "test_socket";
        assertEquals(expected, underTest1.getSocketType());
    }

    @Test
    public void getFormFactorTest() {
        String expected = "test_factor";
        assertEquals(expected, underTest1.getFormFactor());
    }

    @Test
    public void getNumOfRamSocketsTest() {
        int expected = 12;
        assertEquals(expected, underTest1.getNumOfRamSockets());
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
                "Foglalat típusa: " + "test_socket" + '\n' +
                "Form factor: " + "test_factor" + '\n' +
                "RAM foglalatok száma:" + 12 + '\n' +
                "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());
    }

}
