package firstAndLastOccurences;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FirstAndLastOccurencesTest {
	@Test
    public void testMultipleOccurrences() {
        assertArrayEquals(new int[]{1, 5}, FirstAndLastOccurences.firstAndLast(new int[]{5, 3, 7, 3, 2, 3}, 3));
    }

    @Test
    public void testSingleOccurrence() {
        assertArrayEquals(new int[]{2, 2}, FirstAndLastOccurences.firstAndLast(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testNoOccurrence() {
        assertArrayEquals(new int[]{-1}, FirstAndLastOccurences.firstAndLast(new int[]{1, 2, 3}, 9));
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[]{-1}, FirstAndLastOccurences.firstAndLast(new int[]{}, 1));
    }
}

