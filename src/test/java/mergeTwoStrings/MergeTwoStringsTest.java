package mergeTwoStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeTwoStringsTest {
	
		@Test
	    public void testEqualLength() {
	        assertEquals("axbycz", MergeTwoStrings.merge("abc", "xyz"));
	    }

	    @Test
	    public void testFirstShorter() {
	        assertEquals("awbxyz", MergeTwoStrings.merge("ab", "wxyz"));
	    }

	    @Test
	    public void testSecondShorter() {
	        assertEquals("pxqyrst", MergeTwoStrings.merge("pqrst", "xy"));
	    }

	    @Test
	    public void testEmptyFirst() {
	        assertEquals("hello", MergeTwoStrings.merge("", "hello"));
	    }

	    @Test
	    public void testEmptySecond() {
	        assertEquals("world", MergeTwoStrings.merge("world", ""));
	    }

}
