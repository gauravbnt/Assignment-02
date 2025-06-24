package confusedPappu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConfusedPappuTest {

    ConfusedPappu cp = new ConfusedPappu();

    @Test
    public void testNoSixes() {
        assertEquals(0, cp.extraAmount(123));  
    }

    @Test
    public void testSingleSix() {
        assertEquals(3, cp.extraAmount(56));  
    }

    @Test
    public void testMultipleSixes() {
        assertEquals(333, cp.extraAmount(666));
    }


    @Test
    public void testAllNines() {
        assertEquals(0, cp.extraAmount(999)); 
    }

    @Test
    public void testZeroAmount() {
        assertEquals(0, cp.extraAmount(0));  
    }

    @Test
    public void testRevAmountWithSix() {
        assertEquals(999, cp.revAmount(666));
    }

    @Test
    public void testRevAmountWithoutSix() {
        assertEquals(123, cp.revAmount(123));
    }

    @Test
    public void testRevAmountMixedDigits() {
        assertEquals(993, cp.revAmount(663)); 
    }

    @Test
    public void testLargeNumber() {
        assertEquals(3333, cp.extraAmount(6666)); 
    }
}
