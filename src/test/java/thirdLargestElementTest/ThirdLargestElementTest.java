package thirdLargestElementTest;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import thirdLargestElement.ThirdLargestElement;

public class ThirdLargestElementTest {

    @Test
    public void testDistinctElements() {
        int[] arr = {2, 4, 1, 3, 5};
        assertEquals(3, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithDuplicates() {
        int[] arr = {2, 4, 1, 3, 5, 3, 5};
        assertEquals(3, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithExactlyThreeUnique() {
        int[] arr = {5, 3, 1, 3, 5, 1};
        assertEquals(1, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithLessThanThreeUnique() {
        int[] arr = {7, 7, 7};
        assertEquals(-1, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithTwoElements() {
        int[] arr = {10, 20};
        assertEquals(-1, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithNegativeValues() {
        int[] arr = {-1, -2, -3, -4};
        assertEquals(-3, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testWithMixedSigns() {
        int[] arr = {-10, 0, 10, 20, 30};
        assertEquals(10, ThirdLargestElement.thirdLargest(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        assertEquals(-1, ThirdLargestElement.thirdLargest(arr));
    }
}
