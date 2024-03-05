// Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.
// Note: for the reference of this question take first fibonacci number to be 1.

// Example 1:
// Input: 
// n = 2
// Output: 
// 1 
// Explanation: 
// 1 is the 2nd number of fibonacci series.

// Example 2:
// Input: 
// n = 5
// Output: 
// 5
// Explanation: 
// 5 is the 5th number of fibonacci series.

public class NthFibonacciNumber1 {
    public static void main(String[] args) {
        int n1 = 2;
        System.out.println(nthFibonacci(n1));

        int n2 = 5;
        System.out.println(nthFibonacci(n2));
    }

    public static int nthFibonacci(int n){
        int dp[]=new int[(int) (n+1)];
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[(int)n];
    }
}
