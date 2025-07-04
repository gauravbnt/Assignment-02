package equillibriumPoint;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EquillibriumPointTest {

    @Test
    public void testMiddleEquilibrium() {
        int[] arr = {1, 3, 5, 2, 2};
        assertEquals(3, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

  
    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(2, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        assertEquals(4, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {10};
        assertEquals(1, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

    @Test
    public void testNoEquilibrium() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

    @Test
    public void testTwoElements() {
        int[] arr = {5, 5};
        assertEquals(-1, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, EquillibriumPoint.equillibriumPoint(arr, arr.length));
    }

 
    @Test
    public void testMultipleEquilibriumsReturnFirst() {
        int[] arr = {2, 4, 2, 4, 2};
        assertEquals(3, EquillibriumPoint.equillibriumPoint(arr, arr.length)); 
    }

    @Test
    public void testNullArrayShouldThrowException() {
        assertThrows(NullPointerException.class, () -> {
            EquillibriumPoint.equillibriumPoint(null, 0);
        });
    }

    @Test
    public void testNegativeSizeButValidArray() {
        int[] arr = {1, 2, 3};
        assertEquals(-1, EquillibriumPoint.equillibriumPoint(arr, -1));
    }

    @Test
    public void testMismatchedSizeLargerThanArray() {
        int[] arr = {1, 2, 3};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            EquillibriumPoint.equillibriumPoint(arr, 10);
        });
    }
}
