// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000

// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100

// Example 3:
// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

public class Power_recursion {
    public static void main(String[] args) {
        double x1 = 2.00000;
        int n1 = 10;
        System.out.println(myPow(x1, n1));

        double x2 = 2.10000;
        int n2 = 3;
        System.out.println(myPow(x2, n2));

        double x3 = 2.00000;
        int n3 = -2;
        System.out.println(myPow(x3, n3));
    }

    public static double myPow(double x, int n){
        if(n==1) return x;
        else if(n==0) return 1;
        else if(n<0){
            int y=-n;
            double smallAns = myPow(x, y-1);
            double ans = x*smallAns;
            return 1/ans;
        }
        else{
            double smallAns = myPow(x, n-1);
            return smallAns*x;
        }
    }
}
