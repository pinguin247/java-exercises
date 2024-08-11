package binarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionIterativeTest {

    @Test
    public void testBinarySearchFound() {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = solution.binarySearch(arr, target);
        assertEquals(3, result, "Target found at index 3");
    }

    @Test
    public void testBinarySearchNotFound() {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 5;
        int result = solution.binarySearch(arr, target);
        assertEquals(-1, result, "Target not found in the array");
    }

    @Test
    public void testBinarySearchEmptyArray() {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {};
        int target = 10;
        int result = solution.binarySearch(arr, target);
        assertEquals(-1, result, "Target not found in an empty array");
    }

    @Test
    public void testBinarySearchFirstElement() {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 2;
        int result = solution.binarySearch(arr, target);
        assertEquals(0, result, "Target found at index 0");
    }

    @Test
    public void testBinarySearchLastElement() {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 40;
        int result = solution.binarySearch(arr, target);
        assertEquals(4, result, "Target found at index 4");
    }
}
