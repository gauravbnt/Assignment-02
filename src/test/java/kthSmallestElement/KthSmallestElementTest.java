package kthSmallestElement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KthSmallestElementTest {

    @Test
    public void testKthSmallest() {
        int[] arr = {7, 2, 5, 3, 5, 1};
        int n = arr.length;
        int k = 3;
        assertEquals(3, KthSmallestElement.kthSmallest(arr, n, k));
    }

    @Test
    public void testKthSmallestFirstElement() {
        int[] arr = {10, 20, 5, 15};
        int n = arr.length;
        int k = 1;
        assertEquals(5, KthSmallestElement.kthSmallest(arr, n, k));
    }

    @Test
    public void testKthSmallestLastElement() {
        int[] arr = {3, 6, 8, 1, 6};
        int n = arr.length;
        int k = 4;
        assertEquals(8, KthSmallestElement.kthSmallest(arr, n, k));
    }

    @Test
    public void testWithDuplicates() {
        int[] arr = {2, 2, 2, 2, 3};
        int n = arr.length;
        int k = 2;
        assertEquals(3, KthSmallestElement.kthSmallest(arr, n, k));
    }


    @Test
    public void testSingleElement() {
        int[] arr = {42};
        int n = arr.length;
        int k = 1;
        assertEquals(42, KthSmallestElement.kthSmallest(arr, n, k));
    }

    @Test
    public void testLargeInput() {
        int n = 1000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        int k = 500;
        assertEquals(500, KthSmallestElement.kthSmallest(arr, n, k));
    }
}
