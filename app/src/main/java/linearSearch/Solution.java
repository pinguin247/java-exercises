package linearSearch;

public class Solution {

    /**
     * Performs a linear search on the given array.
     *
     * @param arr the array to search
     * @param target the value to search for
     * @return the index of the target if found, otherwise -1
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //Time Complexity is O(N)
    //Space Complexity is O(1)

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int result = solution.linearSearch(arr, target);
        System.out.println("Index of " + target + ": " + result);
    }
}