// Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.
 
// Example 1:
// Input:
// N = 6
// A[] = {1, 5, 1, 0, 6, 0}
// X = 7
// Output:
// 1
// Explantion:
// 1, 5, 1, 0 are the four elements which makes sum 7

import java.util.Arrays;

public class FourElements {
    public static void main(String[] args) {
        int n1 = 6;
        int A1[] = {1, 5, 1, 0, 6, 0};
        int x1 = 7;
        System.out.println(find4Numbers(A1, n1, x1));
    }

    public static boolean find4Numbers(int A[], int n, int X) 
    {
        if(A.length < 4) return false;
        Arrays.sort(A);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = A[i] + A[j] + A[k] +  A[l];
                    if(sum == X) return true;
                    else if(sum < X) k++;
                    else l--;
                }
            }
        }
        
        return false;
    }
}
