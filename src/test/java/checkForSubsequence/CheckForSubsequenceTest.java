package checkForSubsequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CheckForSubsequenceTest {

    @Test
    public void testValidSubsequence() {
        assertEquals(1, CheckForSubsequence.isSubSequence("abc", "a1b2c3"));
        assertEquals(1, CheckForSubsequence.isSubSequence("ace", "abcdef"));
    }

    @Test
    public void testInvalidSubsequence() {
        assertEquals(0, CheckForSubsequence.isSubSequence("abc", "acb"));  // order matters
        assertEquals(0, CheckForSubsequence.isSubSequence("xyz", "abcde"));
    }

    @Test
    public void testSameStrings() {
        assertEquals(1, CheckForSubsequence.isSubSequence("hello", "hello"));
    }

    @Test
    public void testEmptyS1() {
        assertEquals(1, CheckForSubsequence.isSubSequence("", "anything"));
    }

    @Test
    public void testEmptyS2() {
        assertEquals(0, CheckForSubsequence.isSubSequence("something", ""));
    }

    @Test
    public void testBothEmpty() {
        assertEquals(1, CheckForSubsequence.isSubSequence("", ""));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals(1, CheckForSubsequence.isSubSequence("@!", "a@b!c"));
        assertEquals(0, CheckForSubsequence.isSubSequence("@#", "abc"));
    }

    @Test
    public void testS1LongerThanS2() {
        assertEquals(0, CheckForSubsequence.isSubSequence("abcdef", "abc"));
    }

    @Test
    public void testNullInputs() {
        assertThrows(NullPointerException.class, () -> {
            CheckForSubsequence.isSubSequence(null, "abc");
        });

        assertThrows(NullPointerException.class, () -> {
            CheckForSubsequence.isSubSequence("abc", null);
        });

        assertThrows(NullPointerException.class, () -> {
            CheckForSubsequence.isSubSequence(null, null);
        });
    }
}
