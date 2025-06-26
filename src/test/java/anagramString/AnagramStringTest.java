package anagramString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnagramStringTest {

    @Test
    public void testSameStrings() {
        assertEquals(0, AnagramString.remAnagram("abc", "abc"));
    }

    @Test
    public void testLowercaseLetters() {
        assertEquals(3, AnagramString.remAnagram("bcadeh", "hea")); 
    }

    @Test
    public void testWithNumbers() {
        assertEquals(0, AnagramString.remAnagram("abc123", "321cba"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertEquals(1, AnagramString.remAnagram("abc123!", "321cba")); 
    }

    @Test
    public void testCompletelyDifferentStrings() {
        assertEquals(6, AnagramString.remAnagram("abc", "123")); 
    }

    @Test
    public void testEmptyStrings() {
        assertEquals(0, AnagramString.remAnagram("", ""));
    }


    @Test
    public void testCaseSensitive() {
        assertEquals(1, AnagramString.remAnagram("aA", "A")); 
    }

    @Test
    public void testLongStringWithSpaces() {
        assertEquals(1, AnagramString.remAnagram("hello world", "world hello!"));
    }
}
