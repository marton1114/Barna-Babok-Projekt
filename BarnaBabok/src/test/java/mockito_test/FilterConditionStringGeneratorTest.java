package mockito_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class FilterConditionStringGeneratorTest {
    public class MyString {
        private String s;
        public String getValue() { return s; }
        public void setValue(String value) { this.s = value; }
    }
    public class MyInteger {
        private int n;
        public int getValue() { return n; }
        public void setValue(int value) { this.n = value; }
    }
    public class MySlider {
        private double value;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    @Mock
    private MyString builderSocketType;
    @Mock
    private MySlider builderSlider;
    @Mock
    private MyInteger builderNumOfRAMSockets;
    @Mock
    private MyInteger builderNumOfModules;
    private MyInteger underTest1NumOfRAMSockets;
    private MyInteger underTest1NumOfModules;
    private MyString underTest1SocketType;
    private MySlider underTest1Slider;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        given(builderSlider.getValue()).willReturn(123.45);
        given(builderSocketType.getValue()).willReturn("test_socket");
        given(builderNumOfRAMSockets.getValue()).willReturn(2);
        given(builderNumOfModules.getValue()).willReturn(2);

        //TestObject1
        underTest1Slider = new MySlider();
        underTest1Slider.setValue(builderSlider.getValue());
        underTest1SocketType = new MyString();
        underTest1SocketType.setValue(builderSocketType.getValue());
        underTest1NumOfRAMSockets = new MyInteger();
        underTest1NumOfRAMSockets.setValue(builderNumOfRAMSockets.getValue());
        underTest1NumOfModules = new MyInteger();
        underTest1NumOfModules.setValue(builderNumOfModules.getValue());

    }

    @Test
    public void generateConditionsMaxSlider() {
        String expected = "price <= 123.45";
        assertEquals(expected, "price <= " + underTest1Slider.getValue());
    }

    @Test
    public void generateConditionsSocketType() {
        String expected = "socketType = 'test_socket'";
        assertEquals(expected, "socketType = '" + underTest1SocketType.getValue() + "'");
    }

    @Test
    public void generateConditionsNumOfRAMSockets() {
        String expected = "NumOfRAMSockets = 2";
        assertEquals(expected, "NumOfRAMSockets = " + underTest1NumOfRAMSockets.getValue());
    }

    @Test
    public void generateConditionsNumOfModules() {
        String expected = "numOfRAMSockets >= 2";
        assertEquals(expected, "numOfRAMSockets >= " + underTest1NumOfModules.getValue());
    }
}