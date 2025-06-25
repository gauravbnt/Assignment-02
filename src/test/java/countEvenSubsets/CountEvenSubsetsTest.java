package countEvenSubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountEvenSubsetsTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, CountEvenSubsets.getCountForEvenSubset(arr, 0));
    }

    @Test
    void testAllOddNumbers() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, CountEvenSubsets.getCountForEvenSubset(arr, arr.length));
    }

    @Test
    void testSingleEvenNumber() {
        int[] arr = {2};
        assertEquals(1, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // 2^1 - 1 = 1
    }

    @Test
    void testDuplicateEvenNumbers() {
        int[] arr = {2, 2, 4, 4};
        assertEquals(3, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // unique = 2,4 → 2^2 - 1 = 3
    }

    @Test
    void testMixedEvenAndOddNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // even = 2,4 → 2^2 - 1 = 3
    }

    @Test
    void testMultipleUniqueEvenNumbers() {
        int[] arr = {2, 4, 6};
        assertEquals(7, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // 2^3 - 1 = 7
    }

    @Test
    void testAllSameEvenNumbers() {
        int[] arr = {8, 8, 8, 8};
        assertEquals(1, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // only one unique even → 2^1 - 1 = 1
    }

    @Test
    void testNegativeEvenNumbers() {
        int[] arr = {-2, -4, -6};
        assertEquals(7, CountEvenSubsets.getCountForEvenSubset(arr, arr.length)); // unique = 3 → 2^3 - 1 = 7
    }
}
