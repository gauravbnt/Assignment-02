package prime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeTest {

    @Test
    void testNegativeNumber() {
        assertEquals(0, PrimeNo.primeNo(-5));
    }

    @Test
    void testZero() {
        assertEquals(0, PrimeNo.primeNo(0));
    }

    @Test
    void testOne() {
        assertEquals(0, PrimeNo.primeNo(1));
    }

    @Test
    void testTwo() {
        assertEquals(1, PrimeNo.primeNo(2));
    }


    @Test
    void testLargePrime() {
        assertEquals(1, PrimeNo.primeNo(97));
    }

    @Test
    void testLargeNonPrime() {
        assertEquals(0, PrimeNo.primeNo(100));
    }
}
