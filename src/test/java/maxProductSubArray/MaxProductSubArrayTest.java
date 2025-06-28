package maxProductSubArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxProductSubArrayTest {

	@Test
	public void testAllPositive() {
		Integer arr[]= {1,2,3,4};
		assertEquals(24, MaxProductSubArray.maxProduct(arr));		
	}
	@Test
    public void testAllNegativeEvenCount() {
        Integer[] arr = {-1, -2, -3, -4}; // (-1)*(-2)*(-3)*(-4) = 24
        assertEquals(24, MaxProductSubArray.maxProduct(arr));
    }

    @Test
    public void testAllNegativeOddCount() {
        Integer[] arr = {-1, -2, -3}; 
        assertEquals(6, MaxProductSubArray.maxProduct(arr));
    }

    @Test
    public void testContainsZero() {
        Integer[] arr = {-1, -2, 0, 4}; 
        assertEquals(8, MaxProductSubArray.maxProduct(arr));
    }

    @Test
    public void testSingleElement() {
        Integer[] arr = {-5};
        assertEquals(-5, MaxProductSubArray.maxProduct(arr));
    }

}
