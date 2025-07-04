package fibbonacciSeries;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibbonacciSeriesTest {

    FibbonacciSeries fb = new FibbonacciSeries();


    @Test
    public void testFibonacciSeriesOfOne() {
        int[] expected = {1};
        assertArrayEquals(expected, fb.fibbonacciSeries(1));
    }

    @Test
    public void testFibonacciSeriesOfTwo() {
        int[] expected = {1, 1};
        assertArrayEquals(expected, fb.fibbonacciSeries(2));
    }

    @Test
    public void testFibonacciSeriesOfFive() {
        int[] expected = {1, 1, 2, 3, 5};
        assertArrayEquals(expected, fb.fibbonacciSeries(5));
    }

    @Test
    public void testFibonacciSeriesOfTen() {
        int[] expected = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        assertArrayEquals(expected, fb.fibbonacciSeries(10));
    }


    @Test
    public void testFibonacciSeriesOfZero() {
        int[] expected = {};
        assertArrayEquals(expected, fb.fibbonacciSeries(0));
    }
    
    @Test
    public void testNegativeInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            fb.fibbonacciSeries(-5);
        });
    }



    @Test
    public void testFibonacciSeriesOfThirty() {
        int[] result = fb.fibbonacciSeries(30);
        assertEquals(30, result.length);
        assertEquals(832040, result[29]); 
    }
}
