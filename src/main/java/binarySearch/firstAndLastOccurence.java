package binarySearch;


/*
Example 1:
Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 8
Result: 3 5
Explanation: The first occurrence of 8 is at index 3 and the last occurrence is at index 5.

Example 2:
Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 10
Result: -1 -1
Explanation: The target value is not present in the array. So, we have returned -1 as the indices of the first and the last occurrence.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class firstAndLastOccurence {


    public static int firstOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[] {first, last};
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
        int n = 8, k = 8;
        int[] ans = firstAndLastPosition(arr, n, k);
        System.out.println("The first and last positions are: "
                + ans[0] + " " + ans[1]);
    }

}
