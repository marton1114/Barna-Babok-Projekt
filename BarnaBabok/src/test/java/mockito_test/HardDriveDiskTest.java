package mockito_test;

import hu.unideb.inf.model.components.HardDriveDisk;
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

public class HardDriveDiskTest {

    @Mock
    private HardDriveDisk underTest1;
    private HardDriveDisk uT;
    private HardDriveDisk uT2;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        given(underTest1.getId()).willReturn(12345, 182838);
        given(underTest1.getBrand()).willReturn("test_brand", "test_brand2");
        given(underTest1.getSeries()).willReturn("test_series", "test_series2");
        given(underTest1.getModel()).willReturn("test_model", "test_model2");
        given(underTest1.getCapacity()).willReturn(12, 13);
        given(underTest1.getSpeed()).willReturn(12345, 34567);
        given(underTest1.getPrice()).willReturn(123.45, 345.67);

        //TestObjec1
        uT = new HardDriveDisk();
        uT.setId(underTest1.getId());
        uT.setBrand(underTest1.getBrand());
        uT.setSeries(underTest1.getSeries());
        uT.setModel(underTest1.getModel());
        uT.setCapacity(underTest1.getCapacity());
        uT.setSpeed(underTest1.getSpeed());
        uT.setPrice(underTest1.getPrice());

        //TestObjec2
        uT2 = new HardDriveDisk();
        uT2.setId(underTest1.getId());
        uT2.setBrand(underTest1.getBrand());
        uT2.setSeries(underTest1.getSeries());
        uT2.setModel(underTest1.getModel());
        uT2.setCapacity(underTest1.getCapacity());
        uT2.setSpeed(underTest1.getSpeed());
        uT2.setPrice(underTest1.getPrice());

        verify(underTest1, times(2)).getId();
        verify(underTest1, times(2)).getBrand();
        verify(underTest1, times(2)).getSeries();
        verify(underTest1, times(2)).getModel();
        verify(underTest1, times(2)).getCapacity();
        verify(underTest1, times(2)).getSpeed();
        verify(underTest1, times(2)).getPrice();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getBrandTest() {
        String expected = "test_brand";
        String expected2 = "test_brand2";
        assertEquals(expected, uT.getBrand());
        assertEquals(expected2, uT2.getBrand());
    }

    @Test
    public void getSeriesTest() {
        String expected = "test_series";
        String expected2 = "test_series2";
        assertEquals(expected, uT.getSeries());
        assertEquals(expected2, uT2.getSeries());
    }

    @Test
    public void getModelTest() {
        String expected = "test_model";
        String expected2 = "test_model2";
        assertEquals(expected, uT.getModel());
        assertEquals(expected2, uT2.getModel());
    }

    @Test
    public void getCapacityTest() {
        int expected = 12;
        int expected2 = 13;
        assertEquals(expected, uT.getCapacity());
        assertEquals(expected2, uT2.getCapacity());
    }

    @Test
    public void getSpeedTest() {
        int expected = 12345;
        int expected2 = 34567;
        assertEquals(expected, uT.getSpeed());
        assertEquals(expected2, uT2.getSpeed());
    }

    @Test
    public void getPriceTest() {
        double expected = 123.45;
        double expected2 = 345.67;
        assertEquals(expected, uT.getPrice());
        assertEquals(expected2, uT2.getPrice());
    }

    @Test
    public void toStringShouldReturnString() {
        String expected =   "Gyártó: " + "test_brand" + '\n' +
                            "Sorozat: " + "test_series" + '\n' +
                            "Modell: " + "test_model" + '\n' +
                            "Kapacitás: " + 12 + '\n' +
                            "Fordulatszám: " + 12345 + '\n' +
                            "Ár: " + 123.45;
        Assertions.assertEquals(expected, uT.toString());
        String expected2 =  "Gyártó: " + "test_brand2" + '\n' +
                            "Sorozat: " + "test_series2" + '\n' +
                            "Modell: " + "test_model2" + '\n' +
                            "Kapacitás: " + 13 + '\n' +
                            "Fordulatszám: " + 34567 + '\n' +
                            "Ár: " + 345.67;
        Assertions.assertEquals(expected2, uT2.toString());
    }
}
