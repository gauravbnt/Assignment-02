package maxAreaRectangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MaxAreaRectangleTest {

    @Test
    public void testMultipleRectangles() {
        Rectangle[] rects = {
            new Rectangle(2, 3),   
            new Rectangle(5, 2),  
            new Rectangle(1, 7)    
        };
        assertEquals(10, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testAllSameArea() {
        Rectangle[] rects = {
            new Rectangle(2, 2),
            new Rectangle(1, 4), 
            new Rectangle(4, 1) 
        };
        assertEquals(4, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testSingleRectangle() {
        Rectangle[] rects = {
            new Rectangle(10, 10)
        };
        assertEquals(100, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testZeroAreaRectangle() {
        Rectangle[] rects = {
            new Rectangle(0, 5),
            new Rectangle(5, 0),
            new Rectangle(0, 0)
        };
        assertEquals(0, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testEmptyArray() {
        Rectangle[] rects = {};
        assertEquals(0, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testMaxAreaWithLargeNumbers() {
        Rectangle[] rects = {
            new Rectangle(1000, 2000),
            new Rectangle(3000, 1000)
        };
        assertEquals(3000000, MaxAreaRectangle.calculate_Area(rects));
    }

    @Test
    public void testNullArrayThrowsException() {
        assertThrows(NullPointerException.class, () -> {
            MaxAreaRectangle.calculate_Area(null);
        });
    }

    @Test
    public void testNegativeDimensionsManuallyCreated() {
        Rectangle[] rects = {
            new Rectangle(3, -2)
        };
        assertEquals(0, MaxAreaRectangle.calculate_Area(rects)); 
    }

    @Test
    public void testMixedZeroAndPositive() {
        Rectangle[] rects = {
            new Rectangle(0, 10),
            new Rectangle(5, 2)
        };
        assertEquals(10, MaxAreaRectangle.calculate_Area(rects));
    }
}
