package recursion;

/*
Given a positive integer, N. Find the factorial of N.


Example 1:

Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
Example 2:

Input:
N = 4
Output:
24
Explanation:
4*3*2*1 = 24
 */

public class factorial {

    static long factorial(int N){
        // code here
        if(N == 0 || N == 1)return 1;
        return N*factorial(N-1);
    }
}
