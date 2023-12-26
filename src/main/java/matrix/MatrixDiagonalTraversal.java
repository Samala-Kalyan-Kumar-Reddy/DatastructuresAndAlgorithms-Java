/*
Given a matrix M of n*n size, the task is to complete the function which prints its elements in a diagonal pattern as depicted below.





Example 1:

Input:
N = 3
mat[][] = {{1 2 3},{4 5 6},{7 8 9}}
Output: 1 2 4 7 5 3 6 8 9
Example 2:

Input:
N = 2
mat[][] = {{1 2},{3 4}}
Output: 1 2 3 4

Your Task:
You only need to implement the given function matrixDiagonally() which returns a list containing the matrix diagonally. Do not read input, instead use the arguments given in the function. Print the elements in Matrix in a diagonal pattern.

Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(1)
Constraints:
1<=N<=100
 */

package matrix;

public class MatrixDiagonalTraversal {
    public static void main(String[] args) {
        int N = 3;
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        MatrixDiagonalTraversal solution = new MatrixDiagonalTraversal();
        int[] result = solution.matrixDiagonally(mat);

        System.out.println("Diagonal Traversal:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public int[] matrixDiagonally(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) return new int[0];

        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n]; // made an empty array to return the ans.

        int i = 0;
        int rows = 0;
        int cols = 0;
        boolean up = true; // as there are 2 directions one up other down

        while (rows < m && cols < n) {
            // if diagonal is going upwards
            if (up) {
                while (rows > 0 && cols < n - 1) {
                    arr[i++] = mat[rows][cols];
                    rows--;
                    cols++;
                }
                arr[i++] = mat[rows][cols];
                if (cols == n - 1) {
                    rows++;
                } else {
                    cols++;
                }
            } else {
                while (cols > 0 && rows < m - 1) {
                    arr[i++] = mat[rows][cols];
                    rows++;
                    cols--;
                }
                arr[i++] = mat[rows][cols];
                if (rows == m - 1) {
                    cols++;
                } else {
                    rows++;
                }
            }
            up = !up;
        }
        return arr;
    }
}
