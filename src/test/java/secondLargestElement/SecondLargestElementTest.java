package secondLargestElement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SecondLargestElementTest {


    @Test
    public void testDistinctPositiveNumbers() {
        int[] arr = {5, 10, 3, 8, 12};
        assertEquals(10, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testWithNegativeAndPositiveNumbers() {
        int[] arr = {-10, -5, 0, 5, 10};
        assertEquals(5, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testSecondLargestAtStart() {
        int[] arr = {9, 12, 15, 1};
        assertEquals(12, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testSecondLargestAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, SecondLargestElement.secondLargest(arr));
    }


    @Test
    public void testAllSameElements() {
        int[] arr = {7, 7, 7, 7};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testOnlyOneElement() {
        int[] arr = {42};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testArrayWithTwoDistinctElements() {
        int[] arr = {100, 200};
        assertEquals(100, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testArrayWithDuplicatesButOnlyOneDistinct() {
        int[] arr = {5, 5, 5, 5};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }


    @Test
    public void testNullArrayShouldThrowException() {
        assertThrows(NullPointerException.class, () -> {
            SecondLargestElement.secondLargest(null);
        });
    }
}
