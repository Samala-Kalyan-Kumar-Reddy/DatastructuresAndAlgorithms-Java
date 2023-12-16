package twoPointers;
/*
Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.

Example 1:

Input:
N = 10

Output:
2 3 5 7

Explanation:
Prime numbers less than equal to N
are 2 3 5 and 7.
Example 2:

Input:
N = 35

Output:
2 3 5 7 11 13 17 19 23 29 31

Explanation:
Prime numbers less than equal to 35 are
2 3 5 7 11 13 17 19 23 29 and 31.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sieveOfEratosthenes() which takes an integer N as an input parameter and return the list of prime numbers less than equal to N.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SieveofEratosthenes {
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(n<=1)
            return res;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=2*i; j<=n; j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
                res.add(i);
        }
        return res;
    }

}
