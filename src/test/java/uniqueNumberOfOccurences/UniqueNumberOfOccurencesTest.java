package uniqueNumberOfOccurences;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UniqueNumberOfOccurencesTest {
	@Test
	public void testSampleTrue() {
		int arr[]= {1,2,2,3,3,3};
		boolean expected=true;
		assertEquals(expected, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}
	@Test
	public void testSampleFalse() {
		int arr[]= {1,2,3,3,3};
		boolean expected=false;
		assertEquals(expected, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}
	@Test
	public void testOnlyOneValue() {
		int arr[]= {1,1,1,1,1,1};
		boolean expected=true;
		assertEquals(expected, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}
	@Test
	public void testTwoElementValue() {
		int arr[]= {1,1,2,2,2,2,2};
		boolean expected=true;
		assertEquals(expected, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}
	
	@Test
	public void testPositiveAndNegative() {
		int arr[]= {1,1,-1,-2,-2,-2,4,4,4,4};
		assertTrue(UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}
	
	@Test
	public void testEmptyArray() {
	    int[] arr = {};
	    assertEquals(true, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}

	@Test
	public void testSingleElement() {
	    int[] arr = {5};
	    assertEquals(true, UniqueNumberOfOccurences.isFrequencyUnique(arr));
	}

}
