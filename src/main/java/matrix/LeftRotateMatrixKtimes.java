/*
Given three integers N, M, and K and a matrix Mat of dimensions NxM. Left rotate the matrix K times.

Example 1:

Input:
N=3,M=3,K=1
Mat=[[1,2,3],[4,5,6],[7,8,9]]
Output:
2 3 1
5 6 4
8 9 7
Explanation:
Left rotating the matrix once gives this result.
Example 2:

Input:
N=3,M=3,K=2
Mat=[[1,2,3],[4,5,6],[7,8,9]]
Output:
3 1 2
6 4 5
9 7 8
Explanation:
Left rotating the matrix twice gives this result

Your Task:
You don't need to read input or print anything. Your task is to complete the function rotateMatrix() which takes the three integers N, M, K, and the matrix Mat and returns the matrix Mat left rotated K times.


Expected Time Complexity:O(N*M)
Expected Auxillary Space:O(N*M)
 */

package matrix;

public class LeftRotateMatrixKtimes {

    int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        // code here
        K = K % M;  // Ensure K is within the range of columns

        for (int i = 0; i < N; i++) {
            reverseArray(Mat[i], 0, K - 1);
            reverseArray(Mat[i], K, M - 1);
            reverseArray(Mat[i], 0, M - 1);
        }

        return Mat;
    }

    void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
