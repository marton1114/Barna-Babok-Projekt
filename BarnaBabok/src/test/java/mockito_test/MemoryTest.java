package mockito_test;

import hu.unideb.inf.model.components.Memory;
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

public class MemoryTest {

    @Mock
    private Memory builder;
    private Memory underTest1;
    private Memory underTest2;

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
	    given(builder.getCapacity()).willReturn(12, 13);
	    given(builder.getNumOfModules()).willReturn(1, 2);
	    given(builder.getFrequency()).willReturn(1234.567, 3456.789);
	    given(builder.getPrice()).willReturn(123.45, 345.67);

		//TestObject1
	    underTest1 = new Memory();
	    underTest1.setId(builder.getId());
	    underTest1.setBrand(builder.getBrand());
	    underTest1.setSeries(builder.getSeries());
	    underTest1.setModel(builder.getModel());
	    underTest1.setCapacity(builder.getCapacity());
	    underTest1.setNumOfModules(builder.getNumOfModules());
	    underTest1.setFrequency(builder.getFrequency());
	    underTest1.setPrice(builder.getPrice());

	    //TestObject2
	    underTest2 = new Memory();
	    underTest2.setId(builder.getId());
	    underTest2.setBrand(builder.getBrand());
	    underTest2.setSeries(builder.getSeries());
	    underTest2.setModel(builder.getModel());
	    underTest2.setCapacity(builder.getCapacity());
	    underTest2.setNumOfModules(builder.getNumOfModules());
	    underTest2.setFrequency(builder.getFrequency());
	    underTest2.setPrice(builder.getPrice());

		verify(builder, times(2)).getId();
		verify(builder, times(2)).getBrand();
		verify(builder, times(2)).getSeries();
		verify(builder, times(2)).getModel();
		verify(builder, times(2)).getCapacity();
		verify(builder, times(2)).getNumOfModules();
		verify(builder, times(2)).getFrequency();
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
    public void getCapacityTest() {
        int expected = 12;
        int expected2 = 13;
        assertEquals(expected, underTest1.getCapacity());
        assertEquals(expected2, underTest2.getCapacity());
    }

    @Test
    public void getNumOfModulesTest() {
        int expected = 1;
        int expected2 = 2;
        assertEquals(expected, underTest1.getNumOfModules());
        assertEquals(expected2, underTest2.getNumOfModules());
    }

    @Test
    public void getFrequencyTest() {
        double expected = 1234.567;
        double expected2 = 3456.789;
        assertEquals(expected, underTest1.getFrequency());
        assertEquals(expected2, underTest2.getFrequency());
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
        String expected2 =  "Gyártó: " + "test_brand2" + '\n' +
                    "Sorozat: " + "test_series2" + '\n' +
                    "Modell: " + "test_model2" + '\n' +
                    "Kapacitás: " + 13 + '\n' +
                    "Modulok száma: " + 2 + '\n' +
                    "Frekcencia: " + 3456.789 + '\n' +
                    "Ár: " + 345.67;
        Assertions.assertEquals(expected2, underTest2.toString());
	    String expected =   "Gyártó: " + "test_brand" + '\n' +
		        "Sorozat: " + "test_series" + '\n' +
		        "Modell: " + "test_model" + '\n' +
		        "Kapacitás: " + 12 + '\n' +
		        "Modulok száma: " + 1 + '\n' +
		        "Frekcencia: " + 1234.567 + '\n' +
		        "Ár: " + 123.45;
	    Assertions.assertEquals(expected, underTest1.toString());
    }
}
