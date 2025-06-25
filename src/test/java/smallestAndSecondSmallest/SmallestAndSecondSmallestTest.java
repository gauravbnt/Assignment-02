package smallestAndSecondSmallest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestAndSecondSmallestTest {

    @Test
    void testEmptyArray() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{}, 0);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testSingleElementArray() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{7}, 1);
        assertArrayEquals(new int[]{7, -1}, result);
    }

    @Test
    void testAllElementsSame() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{5, 5, 5, 5}, 4);
        assertArrayEquals(new int[]{5, -1}, result);
    }

    @Test
    void testTwoDifferentElements() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{10, 20}, 2);
        assertArrayEquals(new int[]{10, 20}, result);
    }

    @Test
    void testMultipleElementsWithDuplicates() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{3, 1, 2, 2, 3, 4, 1}, 7);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testNegativeAndPositiveNumbers() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{-1, 0, 3, 3, -2, 4}, 6);
        assertArrayEquals(new int[]{-2, -1}, result);
    }

    @Test
    void testAlreadySortedArray() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testArrayWithZeros() {
        int[] result = SmallestAndSecondSmallest.minAndSecondMin(new int[]{0, 0, 1}, 3);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
