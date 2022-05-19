package mockito_test;

import hu.unideb.inf.model.components.Processor;
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

public class ProcessorTest {

    @Mock
    private Processor builder;
    private Processor underTest1;
    private Processor underTest2;

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
        given(builder.getFrequency()).willReturn(1.0, 2.0);
        given(builder.getIntegratedGPU()).willReturn("test_gpu", "test_gpu2");
        given(builder.getNumOfCores()).willReturn(12, 13);
        given(builder.getPower()).willReturn(123, 150);
        given(builder.getSocketType()).willReturn("test_socket", "test_socket2");
        given(builder.getPrice()).willReturn(123.45, 345.67);

        //TestObjec1
        underTest1 = new Processor();
        underTest1.setId(builder.getId());
        underTest1.setBrand(builder.getBrand());
        underTest1.setSeries(builder.getSeries());
        underTest1.setModel(builder.getModel());
        underTest1.setFrequency(builder.getFrequency());
        underTest1.setIntegratedGPU(builder.getIntegratedGPU());
        underTest1.setNumOfCores(builder.getNumOfCores());
        underTest1.setPower(builder.getPower());
        underTest1.setSocketType(builder.getSocketType());
        underTest1.setPrice(builder.getPrice());

        //TestObjec2
        underTest2 = new Processor();
        underTest2.setId(builder.getId());
        underTest2.setBrand(builder.getBrand());
        underTest2.setSeries(builder.getSeries());
        underTest2.setModel(builder.getModel());
        underTest2.setFrequency(builder.getFrequency());
        underTest2.setIntegratedGPU(builder.getIntegratedGPU());
        underTest2.setNumOfCores(builder.getNumOfCores());
        underTest2.setPower(builder.getPower());
        underTest2.setSocketType(builder.getSocketType());
        underTest2.setPrice(builder.getPrice());

        verify(builder, times(2)).getId();
        verify(builder, times(2)).getBrand();
        verify(builder, times(2)).getSeries();
        verify(builder, times(2)).getModel();
        verify(builder, times(2)).getFrequency();
        verify(builder, times(2)).getIntegratedGPU();
        verify(builder, times(2)).getNumOfCores();
        verify(builder, times(2)).getPower();
        verify(builder, times(2)).getSocketType();
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
    public void getPriceTest() {
        double expected = 123.45;
        double expected2 = 345.67;
        assertEquals(expected, underTest1.getPrice());
        assertEquals(expected2, underTest2.getPrice());
    }

    @Test
    public void getFrequencyTest() {
        double expected = 1.0;
        double expected2 = 2.0;
        assertEquals(expected, underTest1.getFrequency());
        assertEquals(expected2, underTest2.getFrequency());
    }

    @Test
    public void getSocketTypeTest() {
        String expected = "test_socket";
        String expected2 = "test_socket2";
        assertEquals(expected, underTest1.getSocketType());
        assertEquals(expected2, underTest2.getSocketType());
    }

    @Test
    public void getNumOfCoresTest() {
        int expected = 12;
        int expected2 = 13;
        assertEquals(expected, underTest1.getNumOfCores());
        assertEquals(expected2, underTest2.getNumOfCores());
    }

    @Test
    public void getIntegratedGPUTest() {
        String expected = "test_gpu";
        String expected2 = "test_gpu2";
        assertEquals(expected, underTest1.getIntegratedGPU());
        assertEquals(expected2, underTest2.getIntegratedGPU());
    }

    @Test
    public void getPowerTest() {
        int expected = 123;
        int expected2 = 150;
        assertEquals(expected, underTest1.getPower());
        assertEquals(expected2, underTest2.getPower());
    }

    @Test
    public void toStringShouldReturnString() {
        String expected = "Gyártó: " + "test_brand" + '\n' +
            "Sorozat: " + "test_series" + '\n' +
            "Modell: " + "test_model" + '\n' +
            "Maximális frekvencia: " + 1.0 + '\n' +
            "Foglalat típusa: " + "test_socket" + '\n' +
            "Magok száma: " + 12 + '\n' +
            "Integrált GPU: " + "test_gpu" + '\n' +
            "Fogyasztás: " + 123 + '\n' +
            "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());

        String expected2 = "Gyártó: " + "test_brand2" + '\n' +
            "Sorozat: " + "test_series2" + '\n' +
            "Modell: " + "test_model2" + '\n' +
            "Maximális frekvencia: " + 2.0 + '\n' +
            "Foglalat típusa: " + "test_socket2" + '\n' +
            "Magok száma: " + 13 + '\n' +
            "Integrált GPU: " + "test_gpu2" + '\n' +
            "Fogyasztás: " + 150 + '\n' +
            "Ár: " + 345.67;
        Assertions.assertEquals(expected2, underTest2.toString());
    }
}