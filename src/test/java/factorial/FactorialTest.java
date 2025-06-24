package factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    Factorial f = new Factorial();

    @Test
    void testFactorialOfZero() {
        assertEquals(1, f.factorial(0), "0! should be 1");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, f.factorial(1), "1! should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, f.factorial(5), "5! should be 120");
        assertEquals(3628800, f.factorial(10), "10! should be 3628800");
    }

    @Test
    void testFactorialOfMaxValidInt() {
        assertEquals(2432902008176640000L, f.factorial(20), "20! should be correct");
    }

    @Test
    void testNegativeInput() {
        assertEquals(-1, f.factorial(-5), "Negative input should return -1");
    }
}
