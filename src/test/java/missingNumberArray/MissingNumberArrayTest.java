package missingNumberArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MissingNumberArrayTest {

    @Test
    public void testMissingMiddle() {
        int[] arr = {1, 2, 4, 5};
        assertEquals(3, MissingNumberArray.missingNumber(arr, 5));
    }

    @Test
    public void testMissingFirst() {
        int[] arr = {2, 3, 4, 5};
        assertEquals(1, MissingNumberArray.missingNumber(arr, 5));
    }

    @Test
    public void testMissingLast() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(5, MissingNumberArray.missingNumber(arr, 5));
    }

    @Test
    public void testOnlyOneNumber() {
        int[] arr = {};
        assertEquals(1, MissingNumberArray.missingNumber(arr, 1));
    }

    @Test
    public void testLargeInput() {
        int n = 100;
        int[] arr = new int[n - 1];
        int missing = 57;

        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i == missing) continue;
            arr[index++] = i;
        }

        assertEquals(missing, MissingNumberArray.missingNumber(arr, n));
    }

    @Test
    public void testNegativeNumbersIncluded() {
        int[] arr = {-3, -2, -1, 0};
        assertThrows(IllegalArgumentException.class, () -> {
            MissingNumberArray.missingNumber(arr, 1);
        });
    }


    @Test
    public void testUnsortedInput() {
        int[] arr = {3, 1, 5, 2};
        assertEquals(4, MissingNumberArray.missingNumber(arr, 5));
    }

    @Test
    public void testNullInputThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            MissingNumberArray.missingNumber(null, 5);
        });
    }

    @Test
    public void testIncorrectSizeArray() {
        int[] arr = {1, 2, 3, 4, 5}; 
        assertThrows(IllegalArgumentException.class, () -> {
            MissingNumberArray.missingNumber(arr, 5);
        });
    }
}
