// Given a positive integer N, check if it is a perfect square or not.
// Note: Try to solve the question using only addition and subtraction operation.

// Example 1:
// Input:
// N = 35
// Output:
// 0
// Explanation:
// 35 is not a perfect 
// square.
 
// Example 2:
// Input:
// N = 49
// Output:
// 1
// Explanation:
// 49 is a perfect
// square.

public class CheckPerfectSquare {
    public static void main(String[] args) {
        int N1 = 35;
        System.out.println(checkSquare(N1));

        int N2 = 49;
        System.out.println(checkSquare(N2));
    }

    public static int checkSquare(int N){
        int low = 0;
        int high = N;
        while(low <= high){
            int mid = (low + high)/2;
            int midSq = mid*mid;

            if(midSq == N){
                return 1;
            }else if(midSq > N){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return 0;
    }
}
