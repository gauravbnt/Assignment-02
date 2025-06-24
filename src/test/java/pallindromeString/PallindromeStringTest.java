package pallindromeString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PallindromeStringTest {

	PallindromeString ps=new PallindromeString();
	
	@Test
	public void testPallindromeWord() {
		assertEquals(1, ps.pallindrome("dad"));
		assertEquals(1, ps.pallindrome("markram"));
	}
	
	@Test
	public void testnonPallindromeWord() {
		assertEquals(0,ps.pallindrome("gaurav"));
		assertEquals(0,ps.pallindrome("donald"));
	}
	@Test
	 public void testEmptyString() {
	    assertEquals(1, ps.pallindrome("")); 
	 }

	@Test
	public void testSingleCharacter() {
        assertEquals(1, ps.pallindrome("g"));
    }

	@Test
	public void testNullInput() {
	    assertEquals(0, ps.pallindrome(null));
	}
	@Test
    public void testPalindromeWithSpaces() {
        assertEquals(0, ps.pallindrome("varuag gaurav ")); 
    }
}
