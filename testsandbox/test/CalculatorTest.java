import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculator c;

    @BeforeAll
    static void setupBeforeClass() throws Exception {
        c = new Calculator();   // same object in every test
    }
    @BeforeEach
    void setUp() {
        c.clear();              // clear the calculator before every test
    }
    @Test
    void testClear() {
        c.add(5);
        assertTrue(c.giveResult() != 0);
        c.clear();
        assertEquals(0, c.giveResult());
    }
    @Test
    void testAdd() {
        c.add(5);
        c.add(10);
        assertEquals(15, c.giveResult());
    }
    @Test
    void testSub() {
        c.sub(5);
        assertEquals(-5, c.giveResult());
    }
    @Test
    void testMul() {
        c.add(10);
        c.mul(5);
        assertEquals(50, c.giveResult());
        c.mul(-2);
        assertEquals(-100, c.giveResult());
    }
    @Test
    void testDiv() {
        c.add(10);
        c.div(2);
        assertEquals(5, c.giveResult());
        c.div(-5);
        assertEquals(-1, c.giveResult());
    }
    @Test
    void testGetResult() {
        assertEquals(0, c.giveResult());
        c.add(1000);
        assertEquals(1000, c.giveResult());
    }
}