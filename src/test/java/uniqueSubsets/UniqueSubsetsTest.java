package uniqueSubsets;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UniqueSubsetsTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        List<List<Integer>> result=UniqueSubsets.getAllSubsets(arr, 0);
        assertEquals(expected, result);
    }

    @Test
    void testSingleElement() {
        int[] arr = {1};
        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(1)
        );

        List<List<Integer>> result = UniqueSubsets.getAllSubsets(arr, 1);
        assertEquals(expected, result);
    }

    @Test
    void testTwoUniqueElements() {
        int[] arr = {1, 2};
        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1, 2)
        );

        List<List<Integer>> result = UniqueSubsets.getAllSubsets(arr, 2);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {1, 2, 2};
        Arrays.sort(arr); 
        List<List<Integer>> result = UniqueSubsets.getAllSubsets(arr, arr.length);

        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1, 2),
                Arrays.asList(2, 2),
                Arrays.asList(1, 2, 2)
        );

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testAllSameElements() {
        int[] arr = {2, 2, 2};
        Arrays.sort(arr);
        List<List<Integer>> result = UniqueSubsets.getAllSubsets(arr, arr.length);

        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(2),
                Arrays.asList(2, 2),
                Arrays.asList(2, 2, 2)
        );

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected));
    }
}
