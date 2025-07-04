package kthSmallestElement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KthSmallestElementTest {

    @Test
    public void testValidKthSmallest() {
        int[] arr = {7, 10, 4, 3, 20, 15};
        assertEquals(7, KthSmallestElement.kthSmallest(arr, arr.length, 3)); // Sorted: [3, 4, 7, 10, 15, 20]
    }

    @Test
    public void testKthSmallestWithDuplicates() {
        int[] arr = {1, 5, 1, 2, 2, 3};
        assertEquals(3, KthSmallestElement.kthSmallest(arr, arr.length, 3)); // Distinct: [1, 2, 3, 5]
    }

    @Test
    public void testKIsOne() {
        int[] arr = {10, 20, 5, 8};
        assertEquals(5, KthSmallestElement.kthSmallest(arr, arr.length, 1)); // Smallest
    }

    @Test
    public void testKIsSizeOfDistinct() {
        int[] arr = {8, 6, 4, 2};
        assertEquals(8, KthSmallestElement.kthSmallest(arr, arr.length, 4));
    }


    @Test
    public void testKTooLargeThrowsException() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            KthSmallestElement.kthSmallest(arr, arr.length, 10);
        });
    }

    @Test
    public void testKZeroThrowsException() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            KthSmallestElement.kthSmallest(arr, arr.length, 0);
        });
    }

    @Test
    public void testKNegativeThrowsException() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            KthSmallestElement.kthSmallest(arr, arr.length, -2);
        });
    }


    @Test
    public void testEmptyArrayThrowsException() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            KthSmallestElement.kthSmallest(arr, 0, 1);
        });
    }

    @Test
    public void testSingleElementK1() {
        int[] arr = {42};
        assertEquals(42, KthSmallestElement.kthSmallest(arr, 1, 1));
    }

    @Test
    public void testSingleElementK2ThrowsException() {
        int[] arr = {42};
        assertThrows(IllegalArgumentException.class, () -> {
            KthSmallestElement.kthSmallest(arr, 1, 2);
        });
    }


    @Test
    public void testNullArrayThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            KthSmallestElement.kthSmallest(null, 0, 1);
        });
    }
}
