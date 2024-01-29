// Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.
// Example 1:

// Input:
// N = 5
// Output: 1 1 2 3 5
// Example 2:

// Input:
// N = 7
// Output: 1 1 2 3 5 8 13

import java.util.Scanner;

public class PrintNFibonacciNo {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.print(n0+"  "+n1+"  ");
        for(int i=2; i<n; i++){
            n2 = n0+n1;
            n0 = n1;
            n1 = n2;
            System.out.print(n2+"  ");
        }
    }
}
