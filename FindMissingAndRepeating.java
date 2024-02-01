// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

// Example 1:
// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.

// Example 2:
// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.

import java.util.Arrays;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int n1 = 2;
        int arr1[] = {2,2};
        int ans1[] = findTwoElement(arr1, n1);
        display(ans1);

        int n2 = 3;
        int arr2[] = {1,3,3};
        int ans2[] = findTwoElement(arr2, n2);
        display(ans2);
    }

    static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] findTwoElement(int arr[], int n) {
        // code here
        int ans[] = new int[2];
        int dp[] = new int[n];
        Arrays.fill(dp, 0);
        for(int i=0; i<n; i++){
            dp[arr[i]-1]++;
        }
        for(int i=0; i<n; i++){
            if(dp[i] == 0)
            ans[1] = i+1;
            if(dp[i] == 2)
            ans[0] = i+1;
        }
        return ans;
    }
}
