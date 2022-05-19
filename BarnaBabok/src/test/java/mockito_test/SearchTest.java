package mockito_test;

import hu.unideb.inf.control.FilterTools.Search;

public class SearchTest {

    @Mock
    private boolean underTest1;
    private boolean underTest2;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMock(this);
        underTest1 = Search.contains("abcdef", "cd");
        underTest2 = Search.contains("abcdef", "xyz");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void containsTest() {
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1, underTest1);
        assertEquals(expected2, underTest1);
    }

}
