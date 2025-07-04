package firstAndLastOccurences;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FirstAndLastOccurencesTest {
	
	@Test
    public void testMultipleOccurrences() {
        assertArrayEquals(new int[]{1, 5}, FirstAndLastOccurences.firstAndLast(new int[]{5, 3, 7, 3, 2, 3}, 3));
    }

    @Test
    public void testSingleOccurrence() {
        assertArrayEquals(new int[]{2, 2}, FirstAndLastOccurences.firstAndLast(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testNoOccurrence() {
        assertArrayEquals(new int[]{-1}, FirstAndLastOccurences.firstAndLast(new int[]{1, 2, 3}, 9));
    }

    
    @Test
    public void testValueNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {-1};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, 6));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {-1};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, 3));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] arr = {-5, -3, -5, -1, 0};
        int[] expected = {0, 2};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, -5));
    }

    @Test
    public void testArrayWithAllSameButNotTarget() {
        int[] arr = {7, 7, 7};
        int[] expected = {-1};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, 3));
    }

    @Test
    public void testArrayWithSingleElementNotMatching() {
        int[] arr = {9};
        int[] expected = {-1};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, 5));
    }

    @Test
    public void testArrayWithSingleElementMatching() {
        int[] arr = {5};
        int[] expected = {0, 0};
        assertArrayEquals(expected, FirstAndLastOccurences.firstAndLast(arr, 5));
    }


    @Test
    public void testNullArrayShouldThrowException() {
        assertThrows(NullPointerException.class, () -> {
            FirstAndLastOccurences.firstAndLast(null, 3);
        });
    }


    @Test
    public void testMismatchedSizeAccess() {
        int[] arr = new int[5];
        int[] filled = {1, 2, 3};
        System.arraycopy(filled, 0, arr, 0, filled.length); 
        assertEquals(-1, FirstAndLastOccurences.firstAndLast(arr, 4)[0]); 
    }
}
