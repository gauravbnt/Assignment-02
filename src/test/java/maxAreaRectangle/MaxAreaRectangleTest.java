package maxAreaRectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxAreaRectangleTest {

    @Test
    void testSingleRectangle() {
        Rectangle[] rectangles = {
            new Rectangle(4, 5) 
        };
        int result = MaxAreaRectangle.calculate_Area(rectangles);
        assertEquals(20, result);
    }

    @Test
    void testMultipleRectangles() {
        Rectangle[] rectangles = {
            new Rectangle(4, 5),  
            new Rectangle(2, 3), 
            new Rectangle(6, 7)   
        };
        int result = MaxAreaRectangle.calculate_Area(rectangles);
        assertEquals(42, result);
    }

    
    @Test
    void testAllZeroArea() {
        Rectangle[] rectangles = {
            new Rectangle(0, 10),
            new Rectangle(5, 0)
        };
        int result = MaxAreaRectangle.calculate_Area(rectangles);
        assertEquals(0, result);
    }

    @Test
    void testNegativeValues() {
        Rectangle[] rectangles = {
            new Rectangle(-4, 5),
            new Rectangle(3, -7),
            new Rectangle(2, 3)
        };
        int result = MaxAreaRectangle.calculate_Area(rectangles);
        assertEquals(6, result);
    }

    @Test
    void testEmptyArray() {
        Rectangle[] rectangles = new Rectangle[0];
        int result = MaxAreaRectangle.calculate_Area(rectangles);
        assertEquals(0, result);
    }
}
