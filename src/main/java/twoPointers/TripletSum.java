package twoPointers;

/*
Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in
the array sums up to 13.
Example 2:

Input:
n = 5, X = 10
arr[] = [1 2 4 3 6]
Output:
1
Explanation:
The triplet {1, 3, 6} in
the array sums up to 10.
 */

//Using Two Pointers

import java.util.Arrays;
import java.util.HashSet;

public class TripletSum {
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];

                if (currentSum == X) {
                    return true;
                } else if (currentSum < X) {
                    // Skip duplicate elements
                    while (left < right && A[left] == A[left + 1]) {
                        left++;
                    }
                    left++;
                } else {
                    // Skip duplicate elements
                    while (left < right && A[right] == A[right - 1]) {
                        right--;
                    }
                    right--;
                }
            }
        }
        return false;

    }

    //Using Hashing
    public static boolean findTripletNumbers(int[] A, int arr_size, int sum)
    {
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) {

            // Create a HashSet to store potential second
            // elements that complement the desired sum
            HashSet<Integer> s = new HashSet<>();

            // Calculate the current sum needed to reach the
            // target sum
            int curr_sum = sum - A[i];

            // Iterate through the subarray A[i+1..n-1] to
            // find a pair with the required sum
            for (int j = i + 1; j < arr_size; j++) {

                // Calculate the required value for the
                // second element
                int required_value = curr_sum - A[j];

                // Check if the required value is present in
                // the HashSet
                if (s.contains(required_value)) {

                    // Triplet is found; print the triplet
                    // elements
                    System.out.println("Triplet is " + A[i]
                            + ", " + A[j] + ", "
                            + required_value);
                    return true;
                }

                // Add the current element to the HashSet
                // for future complement checks
                s.add(A[j]);
            }
        }

        // If no triplet is found, return false
        return false;
    }


}
