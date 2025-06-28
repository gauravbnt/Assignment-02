package addMinimumCharacters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddMinimumCharactersTest {

    @Test
    public void testIfPalindrome() {
    	String str1="madam";
        assertEquals(0, AddMinimumCharacters.addMinChar(str1));
    }

    @Test
    public void testIfNonPalindrome() {
    	String str1="abcd";
        assertEquals(3, AddMinimumCharacters.addMinChar(str1));
    }

    @Test
    public void testEmptyString() {
    	String str1=" ";
        assertEquals(0, AddMinimumCharacters.addMinChar(str1));
    }

    @Test
    public void testSingleChar() {
    	String str1="x";
        assertEquals(0, AddMinimumCharacters.addMinChar(str1));
    }
}
