package immediateSmallerElement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImmediateSmallerElementTest {

    @Test
    public void testFirstCase() {
        int[] input = {4, 2, 1, 5, 3};
        int[] expected = {2, 1, -1, 3, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testAllIncreasing() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {-1, -1, -1, -1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testAllDecreasing() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {4, 3, 2, 1, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testSingleElement() {
        int[] input = {10};
        int[] expected = {-1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    @Test
    public void testTwoElementsDecreasing() {
        int[] input = {10, 5};
        int[] expected = {5, -1};
        assertArrayEquals(expected, ImmediateSmallerElement.immediateSmaller(input, input.length));
    }

    
}
