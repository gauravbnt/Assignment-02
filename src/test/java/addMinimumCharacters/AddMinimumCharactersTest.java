package addMinimumCharacters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddMinimumCharactersTest {

    @Test
    public void testPalindrome() {
        assertEquals(0, AddMinimumCharacters.addMinChar("madam"));
    }

    @Test
    public void testNonPalindrome() {
        assertEquals(3, AddMinimumCharacters.addMinChar("abcd")); 
    }

    @Test
    public void testComplexPalindromeAddition() {
        assertEquals(1, AddMinimumCharacters.addMinChar("aacecaaa")); 
    }

    @Test
    public void testAlreadyPalindrome() {
        assertEquals(0, AddMinimumCharacters.addMinChar("racecar"));
    }


    @Test
    public void testWithSpecialCharacters() {
        assertEquals(3, AddMinimumCharacters.addMinChar("ab#c")); // makes "c#bab#c"
    }

    @Test
    public void testWithNumbers() {
        assertEquals(4, AddMinimumCharacters.addMinChar("123ab")); // "ba32123ab"
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(0, AddMinimumCharacters.addMinChar("x"));
    }

    @Test
    public void testSingleSpaceCharacter() {
        assertEquals(0, AddMinimumCharacters.addMinChar(" "));
    }

    @Test
    public void testEvenLengthPalindrome() {
        assertEquals(0, AddMinimumCharacters.addMinChar("aa"));
    }

    @Test
    public void testOddLengthPalindrome() {
        assertEquals(0, AddMinimumCharacters.addMinChar("aba"));
    }

    @Test
    public void testNullInput() {
        assertThrows(NullPointerException.class, () -> {
            AddMinimumCharacters.addMinChar(null);
        });
    }
    @Test
    public void testEmptyString() {
        assertThrows(NullPointerException.class, () -> {
            AddMinimumCharacters.addMinChar("");
        });
    }

    @Test
    public void testVeryLargeInput() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append('a');
        }
        assertEquals(0, AddMinimumCharacters.addMinChar(sb.toString()));
    }

}
