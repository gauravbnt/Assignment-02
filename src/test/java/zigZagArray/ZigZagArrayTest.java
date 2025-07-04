package zigZagArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ZigZagArrayTest {
	
    @Test
    public void testThreeElements() {
        int[] arr = {1, 3, 4};
        int[] expected = {1, 4, 3};
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }


    @Test
    public void testAlreadyZigZag() {
        int[] arr = {1, 3, 2, 4, 3};
        int[] expected = {1, 3, 2, 4, 3}; 
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testDescendingInput() {
        int[] arr = {9, 8, 7, 6, 5};
        int[] expected = {8, 9, 6, 7, 5}; 
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testTwoElementsIncreasing() {
        int[] arr = {1, 2};
        int[] expected = {1, 2}; // Already valid
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testTwoElementsDecreasing() {
        int[] arr = {5, 2};
        int[] expected = {2, 5};
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        int[] expected = {7};
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        ZigZagArray.zigZag(arr, arr.length);
        assertArrayEquals(expected, arr);
    }
    

    @Test
    public void testNegativeSize() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            ZigZagArray.zigZag(arr, -1);
        });
    }


}



