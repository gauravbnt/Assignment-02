package pallindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PallindromeTest {

    Pallindrome p = new Pallindrome();

    @Test
    public void testPalindromeNumber() {
        assertEquals("Yes", p.isPallindrome(121));
    }

    @Test
    public void testSingleDigit() {
        assertEquals("Yes", p.isPallindrome(7));
    }

    @Test
    public void testPalindromeEvenLength() {
        assertEquals("Yes", p.isPallindrome(1221));
    }

    @Test
    public void testNotPalindromeNumber() {
        assertEquals("No", p.isPallindrome(123));
    }

    @Test
    public void testZeroNotPalindromeFormat() {
        assertEquals("Yes", p.isPallindrome(0));
    }

    @Test
    public void testLargeNonPalindrome() {
        assertEquals("No", p.isPallindrome(123456));
    }

    @Test
    public void testNegativeNumberReturnsInvalid() {
        assertEquals("Invalid input", p.isPallindrome(-121));
    }

    @Test
    public void testNegativeSingleDigit() {
        assertEquals("Invalid input", p.isPallindrome(-7));
    }
}
