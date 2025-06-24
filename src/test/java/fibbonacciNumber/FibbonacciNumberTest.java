package fibbonacciNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibbonacciNumberTest {

    FibbonacciNumber fb = new FibbonacciNumber();

    @Test
    public void testBaseCases() {
        assertEquals(0, fb.fibbonacci(0));
        assertEquals(1, fb.fibbonacci(1));
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(1, fb.fibbonacci(2));
        assertEquals(3, fb.fibbonacci(4));
        assertEquals(5, fb.fibbonacci(5));
    }

    @Test
    public void testLargerNumbers() {
        assertEquals(55, fb.fibbonacci(10));
        assertEquals(6765, fb.fibbonacci(20));
        assertEquals(832040, fb.fibbonacci(30));
    }

    
}
