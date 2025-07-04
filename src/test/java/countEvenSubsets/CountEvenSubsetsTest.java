package countEvenSubsets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountEvenSubsetsTest {

    @Test
    public void testThreeUniqueEvens() {
        assertEquals(7, CountEvenSubsets.getCountForEvenSubset(new int[]{2, 4, 6}, 3));
    }

    @Test
    public void testRepeatedEvenNumbers() {
        assertEquals(1, CountEvenSubsets.getCountForEvenSubset(new int[]{2, 2, 2}, 3));
    }

    @Test
    public void testMixedOddsAndEvens() {
        assertEquals(3, CountEvenSubsets.getCountForEvenSubset(new int[]{1, 3, 5, 2, 4}, 5));
    }

    @Test
    public void testWithZero() {
        assertEquals(31, CountEvenSubsets.getCountForEvenSubset(new int[]{0, 2, 4, 6, 8}, 5));
    }

    @Test
    public void testWithOneEven() {
        assertEquals(1, CountEvenSubsets.getCountForEvenSubset(new int[]{10}, 1));
    }

    @Test
    public void testNoEvens() {
        assertEquals(0, CountEvenSubsets.getCountForEvenSubset(new int[]{1, 3, 5, 7}, 4));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, CountEvenSubsets.getCountForEvenSubset(new int[]{}, 0));
    }

    @Test
    public void testNegativeOddsOnly() {
        assertEquals(0, CountEvenSubsets.getCountForEvenSubset(new int[]{-1, -3, -7}, 3));
    }

    @Test
    public void testNegativeEvens() {
        assertEquals(3, CountEvenSubsets.getCountForEvenSubset(new int[]{-2, -4}, 2));
    }

    @Test
    public void testMinMaxIntegerValues() {
        assertEquals(1, CountEvenSubsets.getCountForEvenSubset(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, 2));
    }

    @Test
    public void testNullArrayThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            CountEvenSubsets.getCountForEvenSubset(null, 0);
        });
    }
}
