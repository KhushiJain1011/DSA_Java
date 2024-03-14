// Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.

// Example 1:
// Input:
// n = 6, X = 13
// arr[] = [1 4 45 6 10 8]
// Output:
// true
// Explanation:
// The triplet {1, 4, 8} in 
// the array sums up to 13.

// Example 2:
// Input:
// n = 5, X = 10
// arr[] = [1 2 4 3 6]
// Output:
// true
// Explanation:
// The triplet {1, 3, 6} in 
// the array sums up to 10.

import java.util.Arrays;

public class TripletSumInArray {
    public static void main(String[] args) {
        int n1=6;
        int x1=13;
        int arr1[] = {1,4,45,6,10,8};
        System.out.println(find3Numbers(arr1, n1, x1));

        int n2=5;
        int x2=10;
        int arr2[] = {1,2,4,3,6};
        System.out.println(find3Numbers(arr2, n2, x2));
    }

    public static boolean find3Numbers(int A[], int n, int X) { 
       Arrays.sort(A);
       for(int i=0; i<n; i++){
           int j=i+1;
           int k=n-1;
           while(j<k){
               int sum = A[i]+A[j]+A[k];
               if(sum == X){
                   return true;
               }
               else if(sum > X){
                   k--;
               }
               else {
                   j++;
               }
           }
       }
       return false;
    }
}