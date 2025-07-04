package sieveOfEratosthenes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SieveOfEratosthenesTest {

    @Test
    public void testPrimesUpTo10() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(10));
    }

    @Test
    public void testPrimesUpTo30() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(30));
    }

    @Test
    public void testPrimesUpTo2() {
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(2));
    }


    @Test
    public void testZeroInput() {
        assertEquals(Collections.emptyList(), SieveOfEratosthenes.sieveOfEratosthenes(0));
    }

    @Test
    public void testOneInput() {
        assertEquals(Collections.emptyList(), SieveOfEratosthenes.sieveOfEratosthenes(1));
    }

    @Test
    public void testNegativeInput() {
        assertEquals(Collections.emptyList(), SieveOfEratosthenes.sieveOfEratosthenes(-10));
    }


    @Test
    public void testLargeInputWithinLimit() {
        List<Integer> result = SieveOfEratosthenes.sieveOfEratosthenes(1000);
        assertTrue(result.contains(997)); 
        assertFalse(result.contains(1000));
    }
}
