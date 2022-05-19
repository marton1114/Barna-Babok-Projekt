package mockito_test;

import hu.unideb.inf.control.FilterTools.Search;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

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

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SearchTest {
    public class MyBoolean{
        private boolean value = false;
        public boolean getValue() { return value; }
        public void setValue(boolean value) { this.value = value; }
    }
    public class MyString{
        private String s;
        public String getValue() { return s; }
        public void setValue(String value) { this.s = value; }
    }

    @Mock
    private MyString builder;
    private MyBoolean underTest1;
    private MyBoolean underTest2;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        given(builder.getValue()).willReturn("abcdef", "abcdef");

        //TestObject1
        underTest1 = new MyBoolean();
        underTest1.setValue(Search.contains((builder.getValue()), "cd"));

        //TestObject2
        underTest2 = new MyBoolean();
        underTest2.setValue(Search.contains(builder.getValue(), "xyz"));
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void containsTest() {
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1, underTest1.getValue());
        assertEquals(expected2, underTest2.getValue());
    }

}
