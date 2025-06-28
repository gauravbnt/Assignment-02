package equillibriumPoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EquillibriumPointTest {
	
	@Test
	public void testEquillibriumPointFound() {
		assertEquals(2,EquillibriumPoint.equillibriumPoint(new int[] {1,3,1}, 3));			
	}
	
	@Test
	public void testEquillibriumPointNotFound() {
		assertEquals(-1,EquillibriumPoint.equillibriumPoint(new int[] {1,4,5,4}, 4));			
	}
	
	@Test
	public void testEquillibriumPointForSizeOne() {
		
		assertEquals(1,EquillibriumPoint.equillibriumPoint(new int[] {3}, 1));			
	}
	
	@Test
	public void testEquillibriumPointForSizeTwo() {
		assertEquals(-1,EquillibriumPoint.equillibriumPoint(new int[] {1,3}, 2));			
	}

}
