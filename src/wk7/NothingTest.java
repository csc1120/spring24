package wk7;

import org.junit.jupiter.api.*;

class NothingTest {
    private static int count;

    @BeforeAll
    public static void initialize() {
        count = 0;
        System.out.println("Starting all tests with a count of " + count++);
    }

    @BeforeEach
    public void setup() {
        System.out.println("Runs before each test with a count of " + count++);
    }

    @AfterEach
    public void teardown() {
        System.out.println("Runs after each test with a count of " + count++);
    }

    @Test
    public void firstTest() {
        System.out.println("Running first test with count of " + count++);
    }

    @Test
    public void secondTest() {
        System.out.println("Running second test with count of " + count++);
    }

    @AfterAll
    public static void windDown() {
        System.out.println("All test finished with count of " + count++);
    }

}
