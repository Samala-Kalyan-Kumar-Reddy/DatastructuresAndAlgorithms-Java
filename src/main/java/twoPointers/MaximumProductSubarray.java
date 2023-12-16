package twoPointers;
/*
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
 */

public class MaximumProductSubarray {
    long maxProduct(int[] arr, int n) {
        // code here
        if (n == 0) {
            return 0;
        }

        // Initialize variables to track maximum and minimum products
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];

        // Iterate through the array
        for (int i = 1; i < n; i++) {
            // If the current element is negative, swap max and min products
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update max and min products for the current element
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the overall result
            result = Math.max(result, maxProduct);
        }

        return result;
    }

}
