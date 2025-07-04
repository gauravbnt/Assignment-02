package stockBuyAndSellPartTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StockBuyAndSellPartTwoTest {
	@Test
    public void testExampleDemo() {
        int[] prices = {3, 4, 1, 5};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(5, result);
    }

    @Test
    public void testAscendingPrices() {
        int[] prices = {1, 2, 3, 4, 5};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(4, result);
    }

    @Test
    public void testDescendingPrices() {
        int[] prices = {5, 4, 3, 2, 1};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElement() {
        int[] prices = {7};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(0, result);
    }

    @Test
    public void testAllSamePrices() {
        int[] prices = {3, 3, 3, 3};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(0, result);
    }

    @Test
    public void testZerosAndOnes() {
        int[] prices = {2, 1, 2, 0, 1};
        int result = StockBuyAndSellPartTwo.maxProfit(prices, prices.length);
        assertEquals(2, result);
    }
    
    
}
