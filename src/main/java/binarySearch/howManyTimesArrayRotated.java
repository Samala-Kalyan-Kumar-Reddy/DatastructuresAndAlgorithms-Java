package binarySearch;

/*
Example 1:
Input Format: arr = [4,5,6,7,0,1,2,3]
Result: 4
Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

Example 2:
Input Format: arr = [3,4,5,1,2]
Result: 3
Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.Example 1:
Input Format: arr = [4,5,6,7,0,1,2,3]
Result: 4
Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

Example 2:
Input Format: arr = [3,4,5,1,2]
Result: 3
Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.
 */

public class howManyTimesArrayRotated {
        public static int findKRotation(int[] arr) {
            int low = 0, high = arr.length - 1;
            int ans = Integer.MAX_VALUE;
            int index = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                //search space is already sorted
                //then arr[low] will always be
                //the minimum in that search space:
                if (arr[low] <= arr[high]) {
                    if (arr[low] < ans) {
                        index = low;
                        ans = arr[low];
                    }
                    break;
                }

                //if left part is sorted:
                if (arr[low] <= arr[mid]) {
                    // keep the minimum:
                    if (arr[low] < ans) {
                        index = low;
                        ans = arr[low];
                    }

                    // Eliminate left half:
                    low = mid + 1;
                } else { //if right part is sorted:

                    // keep the minimum:
                    if (arr[mid] < ans) {
                        index = mid;
                        ans = arr[mid];
                    }

                    // Eliminate right half:
                    high = mid - 1;
                }
            }
            return index;
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
            int ans = findKRotation(arr);
            System.out.println("The array is rotated " + ans + " times.");
        }
    }

