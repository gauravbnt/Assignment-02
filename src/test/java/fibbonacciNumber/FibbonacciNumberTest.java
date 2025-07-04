package fibbonacciNumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibbonacciNumberTest {

    FibbonacciNumber fb = new FibbonacciNumber();


    @Test
    public void testFibonacciOfZero() {
        assertEquals(0, fb.fibbonacci(0));
    }

    @Test
    public void testFibonacciOfOne() {
        assertEquals(1, fb.fibbonacci(1));
    }

    @Test
    public void testFibonacciOfTwo() {
        assertEquals(1, fb.fibbonacci(2));
    }

    @Test
    public void testFibonacciOfFive() {
        assertEquals(5, fb.fibbonacci(5));
    }

    @Test
    public void testFibonacciOfTen() {
        assertEquals(55, fb.fibbonacci(10));
    }

    @Test
    public void testFibonacciOfFifty() {
        assertEquals(586268941, fb.fibbonacci(50)); 
    }


    @Test
    public void testNegativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            fb.fibbonacci(-10);
        });
    }


    @Test
    public void testVeryLargeFibonacciValue() {
        int result = fb.fibbonacci(100000); // Should not crash or overflow
        assertTrue(result >= 0 && result < 1_000_000_007); // modulo range
    }
}
