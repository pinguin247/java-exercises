package binarySearch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionRecursiveTest {
    @Test
    public void testBinarySearchRecursiveFound() {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        assertEquals(3, result, "Target found at index 3");
    }

    @Test
    public void testBinarySearchRecursiveNotFound() {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 5;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        assertEquals(-1, result, "Target not found in the array");
    }

    @Test
    public void testBinarySearchRecursiveEmptyArray() {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {};
        int target = 10;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        assertEquals(-1, result, "Target not found in an empty array");
    }

    @Test
    public void testBinarySearchRecursiveFirstElement() {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 2;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        assertEquals(0, result, "Target found at index 0");
    }

    @Test
    public void testBinarySearchRecursiveLastElement() {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 40;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        assertEquals(4, result, "Target found at index 4");
    }
}
