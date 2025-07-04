package immediateSmallerElement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImmediateSmallerElementTest {

    @Test
    public void testStandardArray() {
        int[] arr = {4, 2, 1, 5, 3};
        int[] expected = {2, 1, -1, 3, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testAllDecreasing() {
        int[] arr = {9, 7, 5, 3, 1};
        int[] expected = {7, 5, 3, 1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testAllIncreasing() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {-1, -1, -1, -1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testWithRepeatedElements() {
        int[] arr = {5, 5, 5, 5};
        int[] expected = {-1, -1, -1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testMixedValues() {
        int[] arr = {8, 1, 6, 3, 9};
        int[] expected = {1, -1, 3, -1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {10};
        int[] expected = {-1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(arr, arr.length));
    }

    @Test
    public void testMismatchedSize() {
        int[] arr = {3, 2};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ImmediateSmallerElement.immediateSmaller(arr, 5); 
        });
    }
}
