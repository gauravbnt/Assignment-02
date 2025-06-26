package secondLargestElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondLargestElementTest {

    @Test
    public void testNormalCase() {
        int[] arr = {12, 35, 1, 10, 34, 1};
        assertEquals(34, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testAllSameElements() {
        int[] arr = {10, 10, 10};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {3};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testDescendingOrder() {
        int[] arr = {100, 90, 80, 70};
        assertEquals(90, SecondLargestElement.secondLargest(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, SecondLargestElement.secondLargest(arr));
    }
}
