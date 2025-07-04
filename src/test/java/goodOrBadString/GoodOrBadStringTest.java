package goodOrBadString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GoodOrBadStringTest {

    @Test
    public void testMoreThanFiveVowelsIncludingQuestionMarks() {
        assertEquals(0, GoodOrBadString.isGoodorBad("aeio??t"));  
    }

    @Test
    public void testMoreThanThreeConsonantsIncludingQuestionMarks() {
        assertEquals(0, GoodOrBadString.isGoodorBad("gaurav???")); 
    }

    @Test
    public void testMoreThanThreeConsonantsStrict() {
        assertEquals(0, GoodOrBadString.isGoodorBad("bcdfg")); 
    }

    @Test
    public void testAllUppercaseVowels() {
        assertEquals(0, GoodOrBadString.isGoodorBad("AEIOUA")); 
    }


    @Test
    public void testValidShortString() {
        assertEquals(1, GoodOrBadString.isGoodorBad("gaurav"));
    }

    @Test
    public void testVowelCountExactlyFive() {
        assertEquals(1, GoodOrBadString.isGoodorBad("aeiou"));
    }

    @Test
    public void testConsonantCountExactlyThree() {
        assertEquals(1, GoodOrBadString.isGoodorBad("bcd"));
    }

    @Test
    public void testOnlyQuestionMarks() {
        assertEquals(1, GoodOrBadString.isGoodorBad("???"));
    }

    @Test
    public void testShortSingleCharacterInputs() {
        assertEquals(1, GoodOrBadString.isGoodorBad("a"));
        assertEquals(1, GoodOrBadString.isGoodorBad("b"));
        assertEquals(1, GoodOrBadString.isGoodorBad("?"));
    }

    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad(""));
    }

    @Test
    public void testNullInputReturnsZero() {
        assertEquals(0, GoodOrBadString.isGoodorBad(null));
    }
}
