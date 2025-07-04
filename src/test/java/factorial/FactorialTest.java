package factorial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    Factorial factorial = new Factorial();


    @Test
    public void testFactorialOfZero() {
        assertEquals(1, factorial.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, factorial.factorial(1));
    }

    @Test
    public void testFactorialOfSmallNumber() {
        assertEquals(120, factorial.factorial(5));
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(3628800, factorial.factorial(10));
    }


    @Test
    public void testFactorialOfNegativeNumber() {
        assertEquals(-1, factorial.factorial(-5));
    }

    @Test
    public void testFactorialOfNegativeOne() {
        assertEquals(-1, factorial.factorial(-1));
    }


    @Test
    public void testFactorialOfLargeNumberCausingOverflow() {
        long result = factorial.factorial(21);
        assertTrue(result < 0, "Expected overflow to result in negative value");
    }

    @Test
    public void testFactorialOf20ShouldBeCorrect() {
        assertEquals(2432902008176640000L, factorial.factorial(20));
    }
}
