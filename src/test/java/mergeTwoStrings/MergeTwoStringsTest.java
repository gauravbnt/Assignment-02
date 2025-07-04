package mergeTwoStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MergeTwoStringsTest {

    @Test
    public void testEqualLengthStrings() {
        assertEquals("a1b2c3", MergeTwoStrings.merge("abc", "123"));
    }

    @Test
    public void testFirstLonger() {
        assertEquals("a1b2c3d", MergeTwoStrings.merge("abcd", "123"));
    }

    @Test
    public void testSecondLonger() {
        assertEquals("a1b2c34", MergeTwoStrings.merge("abc", "1234"));
    }

    @Test
    public void testFirstEmpty() {
        assertEquals("xyz", MergeTwoStrings.merge("", "xyz"));
    }

    @Test
    public void testSecondEmpty() {
        assertEquals("hello", MergeTwoStrings.merge("hello", ""));
    }

    @Test
    public void testBothEmpty() {
        assertEquals("", MergeTwoStrings.merge("", ""));
    }

    @Test
    public void testSpecialCharacters() {
        assertEquals("a@b#c$", MergeTwoStrings.merge("abc", "@#$"));
    }

    @Test
    public void testWhitespaceStrings() {
        assertEquals("a b ", MergeTwoStrings.merge("ab", "  "));
    }

    @Test
    public void testNullInputs() {
        assertThrows(NullPointerException.class, () -> {
            MergeTwoStrings.merge(null, "abc");
        });

        assertThrows(NullPointerException.class, () -> {
            MergeTwoStrings.merge("abc", null);
        });

        assertThrows(NullPointerException.class, () -> {
            MergeTwoStrings.merge(null, null);
        });
    }
}
