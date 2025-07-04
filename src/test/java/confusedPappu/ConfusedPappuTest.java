package confusedPappu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConfusedPappuTest {

    ConfusedPappu cp = new ConfusedPappu();

    @Test
    public void testWithSix() {
        assertEquals(3, cp.extraAmount(456));  
    }

    @Test
    public void testMultipleSixes() {
        assertEquals(333, cp.extraAmount(666)); 
    }

    @Test
    public void testNoSix() {
        assertEquals(0, cp.extraAmount(123));
    }

    @Test
    public void testZero() {
        assertEquals(0, cp.extraAmount(0));
    }

    @Test
    public void testAllSixes() {
        assertEquals(3333, cp.extraAmount(6666));  
    }

    @Test
    public void testEndsWithSix() {
        assertEquals(3, cp.extraAmount(786)); 
    }

    @Test
    public void testStartsWithSix() {
        assertEquals(300, cp.extraAmount(612));  
    }

    @Test
    public void testNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            cp.extraAmount(-456);
        });
    }



    @Test
    public void testLargeNoSix() {
        assertEquals(0, cp.extraAmount(999999));
    }
}
