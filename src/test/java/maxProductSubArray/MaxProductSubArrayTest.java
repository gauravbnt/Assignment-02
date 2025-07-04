package maxProductSubArray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxProductSubArrayTest {

    @Test
    public void testPositiveNumbers() {
        assertEquals(120, MaxProductSubArray.maxProduct(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testWithZero() {
        assertEquals(6, MaxProductSubArray.maxProduct(new int[] {2, 3, -2, 4}));
    }

    @Test
    public void testAllNegative() {
        assertEquals(24, MaxProductSubArray.maxProduct(new int[] {-1, -2, -3, -4}));
    }

    @Test
    public void testNegativeAndZero() {
        assertEquals(0, MaxProductSubArray.maxProduct(new int[] {-2, 0, -1}));
    }

    @Test
    public void testSingleElement() {
        assertEquals(5, MaxProductSubArray.maxProduct(new int[] {5}));
    }

    @Test
    public void testLargeNegativeFirst() {
        assertEquals(120, MaxProductSubArray.maxProduct(new int[] {-2, 3, -4, -2, 5}));
    }

    @Test
    public void testMixedValues() {
        assertEquals(112, MaxProductSubArray.maxProduct(new int[] {1, -2, -3, 0, 7, -8, -2}));
    }

    @Test
    public void testZeroOnly() {
        assertEquals(0, MaxProductSubArray.maxProduct(new int[] {0, 0, 0}));
    }

    @Test
    public void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            MaxProductSubArray.maxProduct(null);
        });
    }

    @Test
    public void testEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            MaxProductSubArray.maxProduct(new int[] {});
        });
    }
}
