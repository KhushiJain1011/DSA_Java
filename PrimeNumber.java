// For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

// Example 1:
// Input:
// N = 5
// Output:
// 1
// Explanation:
// 5 has 2 factors 1 and 5 only.

// Example 2:
// Input:
// N = 25
// Output:
// 0
// Explanation:
// 25 has 3 factors 1, 5, 25


public class PrimeNumber {
    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(isPrime(n1));

        int n2 = 25;
        System.out.println(isPrime(n2));
    }

    static int isPrime(int N){
        if(N<=1){
            return 0;
        }
            
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                return 0;
            }
        }  
        return 1;
    }
}
