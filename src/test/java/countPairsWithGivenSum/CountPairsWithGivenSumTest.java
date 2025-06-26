package countPairsWithGivenSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountPairsWithGivenSumTest {

    @Test
    public void testExampleCase() {
        int[] arr = {1, 5, 7, -1};
        assertEquals(2, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 6));
    }

    @Test
    public void testNoPairFound() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 100));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, 5};
        assertEquals(1, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 1)); // (-4, 5)
    }

    @Test
    public void testMultipleSameValues() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 2));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 0));
    }

   
}

