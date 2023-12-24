/*
Given a 2D binary matrix A of dimensions NxM, determine the row that contains a minimum number of 1's.
Note-The matrix contains only 1s and 0s. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.

Example 1:

Input:
N=4,M=4
A=[[1,1,1,1],[1,1,0,0],[0,0,1,1],[1,1,1,1]]
Output:
2
Explanation:
Rows 2 and 3 contain the minimum number
of 1's(2 each).Since, 2 is less than 3.
Thus, the answer is 2.
Example 2:

Input:
N=3,M=3
A=[[0,0,0],[0,0,0],[0,0,0]]
Output:
1
Explanation:
All the rows contain the same number
of 1's(0 each).Among them, index 1
is the smallest, so the answer is 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function minRow() which takes the two integers N, M as well as the 2D matrix A as input parameters and returns the minimum index of the row which contains the least number of 1's.


Expected Time Complexity:O(N*M)
Expected Auxillary Space:O(1)
 */

package matrix;

public class Rowwithminimumnumberof1s {
    int minRow(int N, int M, int A[][]) {
        // code here
        int minCount = Integer.MAX_VALUE;
        int minRow = -1;

        // Iterate through each row
        for (int i = 0; i < N; i++) {
            int count = 0;

            // Count the number of 1's in the current row
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 1) {
                    count++;
                }
            }

            // Update minimum count and corresponding row index
            if (count < minCount || (count == minCount && i < minRow)) {
                minCount = count;
                minRow = i;
            }
        }

        return minRow + 1; // Adding 1 to convert from 0-based index to 1-based index
    }
}
