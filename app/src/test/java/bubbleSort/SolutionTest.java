package bubbleSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testBubbleSortUnsortedArray() {
        Solution solution = new Solution();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        solution.bubbleSort(arr);
        assertArrayEquals(expected, arr, "The array should be sorted in ascending order.");
    }

    @Test
    public void testBubbleSortAlreadySortedArray() {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        solution.bubbleSort(arr);
        assertArrayEquals(expected, arr, "The already sorted array should remain unchanged.");
    }

    @Test
    public void testBubbleSortSingleElementArray() {
        Solution solution = new Solution();
        int[] arr = {42};
        int[] expected = {42};

        solution.bubbleSort(arr);
        assertArrayEquals(expected, arr, "A single-element array should remain unchanged.");
    }

    @Test
    public void testBubbleSortEmptyArray() {
        Solution solution = new Solution();
        int[] arr = {};
        int[] expected = {};

        solution.bubbleSort(arr);
        assertArrayEquals(expected, arr, "An empty array should remain unchanged.");
    }

    @Test
    public void testBubbleSortArrayWithDuplicates() {
        Solution solution = new Solution();
        int[] arr = {5, 1, 4, 2, 8, 1, 4, 5};
        int[] expected = {1, 1, 2, 4, 4, 5, 5, 8};

        solution.bubbleSort(arr);
        assertArrayEquals(expected, arr, "The array with duplicates should be sorted in ascending order.");
    }
}