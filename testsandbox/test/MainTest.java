import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Fun fun;

    @BeforeAll
    static void beforeAll() {
        System.out.println("**--- Executed once before all test methods in this class ---**");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("**--- Executed before each test method in this class ---**");
        fun = new Fun("Hello Metropolia!");
    }

    @Test
    void isEven() {
        System.out.println("**--- Test isEven executed ---**");
        justForFun();
        assertEquals(false, Main.isEven(3));
        assertEquals(true, Main.isEven(2));
    }

    @Test
    void addOne() {
        System.out.println("**--- Test addOne executed ---**");
        assertEquals(4, Main.addOne(3));
        assertEquals(3, Main.addOne(2));
    }

    @Test
    void multiplyByTwo() {
        System.out.println("**--- Test multiplyByTwo executed ---**");
        assertEquals(6, Main.multiplyByTwo(3));
        assertEquals(4, Main.multiplyByTwo(2));
        //assertEquals(-4, Main.multiplyByTwo(-2));
    }

    @Test
    void testMethod1() {
        System.out.println("**--- Test method1 executed ---**");
    }

    @DisplayName("Test method2 with condition")
    @Test
    void testMethod2() {
        System.out.println("**--- Test method2 executed ---**");
    }

    @Test
    @Disabled("implementation pending")
    void testMethod3() {
        System.out.println("**--- Test method3 executed ---**");
    }

    @AfterEach
    void afterEach() {
        System.out.println("**--- Executed after each test method in this class ---**");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("**--- Executed once after all test methods in this class ---**");
    }

    void justForFun() {
        System.out.println("**--- This method is just for fun ---**: " + fun);
    }
}