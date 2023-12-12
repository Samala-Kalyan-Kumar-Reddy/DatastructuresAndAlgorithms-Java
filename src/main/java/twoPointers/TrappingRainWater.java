package twoPointers;

/*
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.


Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation:

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above
block of height 4 is 3 units and above
block of height 0 is 7 units. So, the
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.
 */

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) {
        // Your code here

        if (n <= 2) {
            return 0;
        }

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        long result = 0;

        while (left < right) {
            leftMax = Math.max(arr[left], leftMax);
            rightMax = Math.max(arr[right], rightMax);

            if (arr[left] < arr[right]) {
                result += leftMax - arr[left];
                left++;
            } else {
                result += rightMax - arr[right];
                right--;
            }
        }

        return result;
    }
}
