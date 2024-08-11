package linearSearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLinearSearchFound() {
        Solution solution = new Solution();
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int result = solution.linearSearch(arr, target);
        assertEquals(2, result, "Target found at index 2");
    }

    @Test
    public void testLinearSearchNotFound() {
        Solution solution = new Solution();
        int[] arr = {10, 20, 30, 40, 50};
        int target = 60;
        int result = solution.linearSearch(arr, target);
        assertEquals(-1, result, "Target not found in the array");
    }

    @Test
    public void testLinearSearchEmptyArray() {
        Solution solution = new Solution();
        int[] arr = {};
        int target = 10;
        int result = solution.linearSearch(arr, target);
        assertEquals(-1, result, "Target not found in an empty array");
    }
}