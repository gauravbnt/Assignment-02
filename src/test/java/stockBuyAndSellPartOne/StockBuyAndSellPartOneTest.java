package stockBuyAndSellPartOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class StockBuyAndSellPartOneTest {

    @Test
    public void testTypicalCase() {
        int[] input = {100, 180, 260, 310, 40, 535, 695};
        int[] is = StockBuyAndSellPartOne.stockBuySell(input).get(0);
        int[] is1 = StockBuyAndSellPartOne.stockBuySell(input).get(1);
        int arr[]=new int[] {0,3};
        int arr1[]=new int[] {4,6};
        assertArrayEquals(is, arr);
        assertArrayEquals(is1, arr1);
        
    }

    @Test
    public void testStrictlyIncreasing() {
        int[] input = {10, 20, 30, 40, 50};
        List<int[]> result = StockBuyAndSellPartOne.stockBuySell(input);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{0, 4}, result.get(0));
    }

    @Test
    public void testStrictlyDecreasing() {
        int[] input = {50, 40, 30, 20, 10};
        List<int[]> result = StockBuyAndSellPartOne.stockBuySell(input);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSingleElement() {
        int[] input = {100};
        List<int[]> result = StockBuyAndSellPartOne.stockBuySell(input);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTwoIncreasing() {
        int[] input = {100, 200};
        List<int[]> result = StockBuyAndSellPartOne.stockBuySell(input);
        assertEquals(1, result.size());
        assertArrayEquals(new int[]{0, 1}, result.get(0));
    }

 
}
