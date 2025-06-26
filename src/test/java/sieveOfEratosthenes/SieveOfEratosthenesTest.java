package sieveOfEratosthenes;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SieveOfEratosthenesTest {

    @Test
    public void testNIs10() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(10));
    }

    @Test
    public void testNIs2() {
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(2));
    }

    @Test
    public void testNIs1() {
        List<Integer> expected = List.of();
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(1));
    }

    @Test
    public void testNIs0() {
        List<Integer> expected = List.of();
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(0));
    }

    @Test
    public void testNIs35() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
        assertEquals(expected, SieveOfEratosthenes.sieveOfEratosthenes(35));
    }

    
}
