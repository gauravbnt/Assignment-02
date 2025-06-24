package fibbonacciSeries;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibbonacciSeriesTest {

    FibbonacciSeries fs = new FibbonacciSeries();

    @Test
    public void testZeroAsInput() {
        assertArrayEquals(new int[0], fs.fibbonacciSeries(0));
    }

    @Test
    public void testNegativeAsInput() {
        assertArrayEquals(new int[0], fs.fibbonacciSeries(-5));
    }

    @Test
    public void testSingleTerm() {
        assertArrayEquals(new int[]{1}, fs.fibbonacciSeries(1));
    }

    @Test
    public void testFiveTerms() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 5}, fs.fibbonacciSeries(5));
    }

    @Test
    public void testTenTerms() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, fs.fibbonacciSeries(10));
    }
}
