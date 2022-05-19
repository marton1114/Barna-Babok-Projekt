package mockito_test;

import hu.unideb.inf.model.components.Memory;
import hu.unideb.inf.model.components.PowerSupply;
import org.mockito.Mock;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

public class PowerSupplyTest {

    @Mock
    private PowerSupply builder;
    private PowerSupply underTest1;
    private PowerSupply underTest2;

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
        given(builder.getPower()).willReturn(123, 234);
        given(builder.getEnergyEfficiency()).willReturn("test_energ-eff", "test_energ-eff2");
        given(builder.getPrice()).willReturn(123.45, 345.67);

        //TestObject1
        underTest1 = new PowerSupply();
        underTest1.setId(builder.getId());
        underTest1.setBrand(builder.getBrand());
        underTest1.setSeries(builder.getSeries());
        underTest1.setModel(builder.getModel());
        underTest1.setPower(builder.getPower());
        underTest1.setEnergyEfficiency(builder.getEnergyEfficiency());
        underTest1.setPrice(builder.getPrice());

        //TestObject2
        underTest2 = new PowerSupply();
        underTest2.setId(builder.getId());
        underTest2.setBrand(builder.getBrand());
        underTest2.setSeries(builder.getSeries());
        underTest2.setModel(builder.getModel());
        underTest2.setPower(builder.getPower());
        underTest2.setEnergyEfficiency(builder.getEnergyEfficiency());
        underTest2.setPrice(builder.getPrice());

        verify(builder, times(2)).getId();
        verify(builder, times(2)).getBrand();
        verify(builder, times(2)).getSeries();
        verify(builder, times(2)).getModel();
        verify(builder, times(2)).getPower();
        verify(builder, times(2)).getEnergyEfficiency();
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
    public void getPowerTest() {
        int expected = 123;
        int expected2 = 234;
        assertEquals(expected, underTest1.getPower());
        assertEquals(expected2, underTest2.getPower());
    }

    @Test
    public void getEnergyEfficiencyTest() {
        String expected = "test_energ-eff";
        String expected2 = "test_energ-eff2";
        assertEquals(expected, underTest1.getEnergyEfficiency());
        assertEquals(expected2, underTest2.getEnergyEfficiency());
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
        String expected =   "Gyártó: " + "test_brand" + '\n' +
                            "Sorozat: " + "test_series" + '\n' +
                            "Modell: " + "test_model" + '\n' +
                            "Effektivitás: " + "test_energ-eff" + '\n' +
                            "Teljesítmény: " + 123 + '\n' +
                            "Ár: " + 123.45;
        Assertions.assertEquals(expected, underTest1.toString());
        String expected2 =  "Gyártó: " + "test_brand2" + '\n' +
                            "Sorozat: " + "test_series2" + '\n' +
                            "Modell: " + "test_model2" + '\n' +
                            "Effektivitás: " + "test_energ-eff2" + '\n' +
                            "Teljesítmény: " + 234 + '\n' +
                            "Ár: " + 345.67;
        Assertions.assertEquals(expected2, underTest2.toString());
    }
}
