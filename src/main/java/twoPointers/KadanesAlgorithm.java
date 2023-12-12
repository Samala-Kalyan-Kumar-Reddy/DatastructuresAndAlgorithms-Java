package twoPointers;

/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1
of element (-1)
 */

public class KadanesAlgorithm {

/*

Kadane's Algorithm: Iterate through the array, maintain a running sum (max) and a maximum sum encountered so far (maxSum). Reset the running sum to 0 if it becomes negative. Update maxSum whenever the running sum exceeds it. Return the final maxSum.
 */
long maxSubarraySum(int arr[], int n){

    // Your code here
    long maxSum = Integer.MIN_VALUE;
    long max = 0;

    for (int i = 0; i < n; i++) {
        max = max + arr[i];

        if (maxSum < max) {
            maxSum = max;
        }

        if (max < 0) {
            max = 0;
        }
    }

    return maxSum;
}

}
