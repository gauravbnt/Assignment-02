package pallindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PallindromeTest {
	Pallindrome p =new Pallindrome();
	
	@Test
	void testValidPallindrome() {
        assertEquals("Yes", p.isPallindrome(121));
	}
    @Test
    void testNotPalindrome() {
        assertEquals("No", p.isPallindrome(123));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("Invalid input", p.isPallindrome(-121));
    }

    @Test
    void testSingleDigit() {
        assertEquals("Yes", p.isPallindrome(5));
    }

    @Test
    void testZero() {
        assertEquals("Yes", p.isPallindrome(0));
    }

}
