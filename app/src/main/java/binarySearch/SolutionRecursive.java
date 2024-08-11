package binarySearch;

public class SolutionRecursive {

    /**
     * Performs a recursive binary search on the given sorted array.
     *
     * @param arr the sorted array to search
     * @param target the value to search for
     * @param left the starting index of the range to search
     * @param right the ending index of the range to search
     * @return the index of the target if found, otherwise -1
     */
    public int binarySearchRecursive(int[] arr, int target, int left, int right) {
        // Base case: if the range is invalid, the target is not in the array
        if (left > right) {
            return -1;
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // If the target is at the mid index, return mid
        if (arr[mid] == target) {
            return mid;
        }

        // If the target is smaller than mid, search the left half
        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        // If the target is larger than mid, search the right half
        return binarySearchRecursive(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        SolutionRecursive solution = new SolutionRecursive();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = solution.binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("Index of " + target + ": " + result);
    }
}