package binarySearch;

public class SolutionIterative {

    /**
     * Performs a binary search on the given sorted array.
     *
     * @param arr the sorted array to search
     * @param target the value to search for
     * @return the index of the target if found, otherwise -1
     */
    public int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == target) {
                return mid;

                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1
            } else if (arr[mid] > target) {
                r = mid - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            } else {
                l = mid + 1;
            }
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    public static void main(String[] args) {
        SolutionIterative solution = new SolutionIterative();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = solution.binarySearch(arr, target);
        System.out.println("Index of " + target + ": " + result);
    }
}