package twoPointers;

/*
Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.

Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the number of distinct elements(X) in the array, the driver code will print all the elements of the modified array from index 0 to X-1 as output of your code.

Example 1:

Input:
N = 5
Array = {2, 2, 2, 2, 2}
Output: 2
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. {2} so modify array will contains 2 at first position and you should return 1 after modify the array.
Example 2:

Input:
N = 4
Array = {1, 2, 2, 4}
Output: 1 2 4
Explation: After removing all duplicates modify array will contains {1, 2, 4} at first 3 positions so you should return 3 after modify the array.

 */

public class RemoveduplicateelementsfromsortedArray {

    int remove_duplicate(int A[],int N){
        // code here
        if (N == 0 || N == 1) {
            return N;
        }

        int index = 1; // index to keep track of the position to insert the next distinct element

        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                A[index++] = A[i];
            }
        }

        return index;
    }

    //Naive method

    // Function to remove duplicate elements This function
    // returns new size of modified array.
    static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)

            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
