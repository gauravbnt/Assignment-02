package countPairsWithGivenSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CountPairsWithGivenSumTest {

    @Test
    public void testBasicPairs() {
        int[] arr = {1, 5, 7, -1};
        assertEquals(2, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 6));
    }

    @Test
    public void testAllOnesSumTwo() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 2));
    }

    @Test
    public void testWithZeroesSumZero() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 0));
    }

    @Test
    public void testMixedPositiveNegative() {
        int[] arr = {-1, -2, 3, 7, 5};
        assertEquals(1, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 2)); 
    }

    @Test
    public void testLargeArrayMultiplePairs() {
        int[] arr = {1, 5, 7, -1, 5, 3, 2, 4, 2};
        assertEquals(5, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 6));
    }

    @Test
    public void testNoPairsFound() {
        int[] arr = {1, 2, 3};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 10));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 5));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 0));
    }

    @Test
    public void testNegativeSumTarget() {
        int[] arr = {-3, -1, -4, -2, 2};
        assertEquals(2, CountPairsWithGivenSum.getPairsCount(arr, arr.length, -5)); 
    }

    @Test
    public void testIntegerMaxMinValues() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 0));
    }

    @Test
    public void testNullArrayShouldThrowException() {
        assertThrows(NullPointerException.class, () -> {
            CountPairsWithGivenSum.getPairsCount(null, 0, 5);
        });
    }

    @Test
    public void testNegativeSizeParameterShouldWork() {
        int[] arr = {1, 2, 3};
        assertEquals(0, CountPairsWithGivenSum.getPairsCount(arr, -1, 3));
    }

    @Test
    public void testArrayContainsSameValueMultipleTimes() {
        int[] arr = {3, 3, 3, 3};
        assertEquals(6, CountPairsWithGivenSum.getPairsCount(arr, arr.length, 6)); 
    }
}
