package mockito_test;

import hu.unideb.inf.model.components.Motherboard;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class MotherBoardTest {

    @Mock
    private Motherboard builder;
    private Motherboard underTest1;
    private Motherboard underTest2;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        given(builder.getId()).willReturn(12345, 182838);
        given(builder.getBrand()).willReturn("test_brand", "test_brand2");
        given(builder.getSeries()).willReturn("test_series", "test_series2");
        given(builder.getModel()).willReturn("test_model", "test_model2");
        given(builder.getSocketType()).willReturn("test_socket", "test_socket2");
        given(builder.getFormFactor()).willReturn("test_factor", "test_factor2");
        given(builder.getNumOfRamSockets()).willReturn(12, 13);
        given(builder.getPrice()).willReturn(123.45, 345.67);

        //TestObjec1
        underTest1 = new Motherboard();
        underTest1.setId(builder.getId());
        underTest1.setBrand(builder.getBrand());
        underTest1.setSeries(builder.getSeries());
        underTest1.setModel(builder.getModel());
        underTest1.setSocketType(builder.getSocketType());
        underTest1.setFormFactor(builder.getFormFactor());
        underTest1.setNumOfRamSockets(builder.getNumOfRamSockets());
        underTest1.setPrice(builder.getPrice());

        //TestObjec2
        underTest2 = new Motherboard();
        underTest2.setId(builder.getId());
        underTest2.setBrand(builder.getBrand());
        underTest2.setSeries(builder.getSeries());
        underTest2.setModel(builder.getModel());
        underTest2.setSocketType(builder.getSocketType());
        underTest2.setFormFactor(builder.getFormFactor());
        underTest2.setNumOfRamSockets(builder.getNumOfRamSockets());
        underTest2.setPrice(builder.getPrice());

        verify(builder, times(2)).getId();
        verify(builder, times(2)).getBrand();
        verify(builder, times(2)).getSeries();
        verify(builder, times(2)).getModel();
        verify(builder, times(2)).getSocketType();
        verify(builder, times(2)).getFormFactor();
        verify(builder, times(2)).getNumOfRamSockets();
        verify(builder, times(2)).getPrice();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getBrandTest() {
        String expected = "test_brand";
        String expected2 = "test_brand2";
        assertEquals(expected, underTest1.getBrand());
        assertEquals(expected2, underTest2.getBrand());
    }

    @Test
    public void getSeriesTest() {
        String expected = "test_series";
        String expected2 = "test_series2";
        assertEquals(expected, underTest1.getSeries());
        assertEquals(expected2, underTest2.getSeries());
    }

    @Test
    public void getModelTest() {
        String expected = "test_model";
        String expected2 = "test_model2";
        assertEquals(expected, underTest1.getModel());
        assertEquals(expected2, underTest2.getModel());
    }

    @Test
    public void getSocketTypeTest() {
        String expected = "test_socket";
        String expected2 = "test_socket2";
        assertEquals(expected, underTest1.getSocketType());
        assertEquals(expected2, underTest2.getSocketType());
    }

    @Test
    public void getFormFactorTest() {
        String expected = "test_factor";
        String expected2 = "test_factor2";
        assertEquals(expected, underTest1.getFormFactor());
        assertEquals(expected2, underTest2.getFormFactor());
    }

    @Test
    public void getNumOfRamSocketsTest() {
        int expected = 12;
        int expected2 = 13;
        assertEquals(expected, underTest1.getNumOfRamSockets());
        assertEquals(expected2, underTest2.getNumOfRamSockets());
    }

    @Test
    public void getPriceTest() {
        double expected = 123.45;
        double expected2 = 345.67;
        assertEquals(expected, underTest1.getPrice());
        assertEquals(expected2, underTest2.getPrice());
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

        String expected2 = "Gyártó: " + "test_brand2" + '\n' +
            "Sorozat: " + "test_series2" + '\n' +
            "Modell: " + "test_model2" + '\n' +
            "Foglalat típusa: " + "test_socket2" + '\n' +
            "Form factor: " + "test_factor2" + '\n' +
            "RAM foglalatok száma:" + 13 + '\n' +
            "Ár: " + 345.67;
        Assertions.assertEquals(expected2, underTest2.toString());
    }
}