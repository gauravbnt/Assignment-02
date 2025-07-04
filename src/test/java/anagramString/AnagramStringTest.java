package anagramString;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnagramStringTest {

    @Test
    public void testAnagrams() {
        assertEquals(0, AnagramString.remAnagram("listen", "silent"));
    }

    @Test
    public void testCompletelyDifferent() {
        assertEquals(6, AnagramString.remAnagram("abc", "def"));
    }

    @Test
    public void testOneEmptyString() {
        assertEquals(3, AnagramString.remAnagram("abc", ""));
        assertEquals(3, AnagramString.remAnagram("", "xyz"));
    }

    @Test
    public void testBothEmptyStrings() {
        assertEquals(0, AnagramString.remAnagram("", ""));
    }

    @Test
    public void testSubset() {
        assertEquals(3, AnagramString.remAnagram("aabbcc", "abc"));
    }

    @Test
    public void testUnequalFrequencies() {
        assertEquals(4, AnagramString.remAnagram("aaabbb", "ab"));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals(0, AnagramString.remAnagram("a b@c", "c b@a"));
    }

    @Test
    public void testCaseSensitivity() {
        assertEquals(6, AnagramString.remAnagram("AbC", "cBa"));
    }

    @Test
    public void testLargeInput() {
        String a = "a".repeat(1000);
        String b = "a".repeat(800);
        assertEquals(200, AnagramString.remAnagram(a, b));
    }

    @Test
    public void testPalindromes() {
        assertEquals(0, AnagramString.remAnagram("madam", "adamm"));
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            AnagramString.remAnagram(null, "abc");
        });
        assertThrows(NullPointerException.class, () -> {
            AnagramString.remAnagram("abc", null);
        });
        assertThrows(NullPointerException.class, () -> {
            AnagramString.remAnagram(null, null);
        });
    }

    @Test
    public void testUnicodeCharacters() {
        assertEquals(2, AnagramString.remAnagram("café", "face"));
    }
}
