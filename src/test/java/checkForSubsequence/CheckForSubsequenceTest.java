package checkForSubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckForSubsequenceTest {
	
    @Test
    public void testSubsequenceMatch() {
        assertEquals(1, CheckForSubsequence.isSubSequence("abc", "ahbgdc"));
    }

    @Test
    public void testSubsequenceNoMatch() {
        assertEquals(0, CheckForSubsequence.isSubSequence("axc", "ahbgdc"));
    }

    @Test
    public void testExactMatch() {
        assertEquals(1, CheckForSubsequence.isSubSequence("abc", "abc"));
    }

    @Test
    public void testWrongOrder() {
        assertEquals(0, CheckForSubsequence.isSubSequence("abc", "acb"));
    }

    @Test
    public void testEmptyS1() {
        assertEquals(1, CheckForSubsequence.isSubSequence("", "anything"));
    }

    @Test
    public void testEmptyS2() {
        assertEquals(0, CheckForSubsequence.isSubSequence("abc", ""));
    }

    @Test
    public void testRepeatedCharacters() {
        assertEquals(1, CheckForSubsequence.isSubSequence("aab", "aaab"));
    }
    
    @Test
    public void testNotEnoughRepeatedCharacters() {
        assertEquals(0, CheckForSubsequence.isSubSequence("aab", "ab"));
    }
}
