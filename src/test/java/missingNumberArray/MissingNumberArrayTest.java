package missingNumberArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberArrayTest {

    @Test
    public void testMissingMiddle() {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int expected = 3;
        assertEquals(expected, MissingNumberArray.missingNumber(arr, n));
    }

    @Test
    public void testMissingFirst() {
        int[] arr = {2, 3, 4, 5};
        int n = 5;
        int expected = 1;
        assertEquals(expected, MissingNumberArray.missingNumber(arr, n));
    }
 
    @Test
    public void testTwoElements() {
        int[] arr = {2};
        int n = 2;
        int expected = 1;
        assertEquals(expected, MissingNumberArray.missingNumber(arr, n));
    }

    @Test
    public void testOneElement() {
        int[] arr = {}; 
        int n = 1;
        int expected = 1;
        assertEquals(expected, MissingNumberArray.missingNumber(arr, n));
    }
}
