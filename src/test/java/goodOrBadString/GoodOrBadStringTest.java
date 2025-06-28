package goodOrBadString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GoodOrBadStringTest {
	@Test
	void testMoreThanFiveVowels()
	{
		assertEquals(0, GoodOrBadString.isGoodorBad("aeio??t"));
	}
	
	@Test
	void testMoreThanThreeConsonants()
	{
		assertEquals(0, GoodOrBadString.isGoodorBad("gaurav???"));
	}
	
	@Test
	void testLessThanThreeConsonants()
	{
		assertEquals(1, GoodOrBadString.isGoodorBad("gaurav"));
	}
	
	@Test
	void testLessThanFiveVowels()
	{
		assertEquals(1, GoodOrBadString.isGoodorBad("gaurav"));
	}
}
