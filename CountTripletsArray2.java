// Given an array arr[] of distinct integers of size N and a value sum, the task is to find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

// Example 1:
// Input: N = 4, sum = 2
// arr[] = {-2, 0, 1, 3}
// Output:  2
// Explanation: Below are triplets with 
// sum less than 2 (-2, 0, 1) and (-2, 0, 3). 
 
// Example 2:
// Input: N = 5, sum = 12
// arr[] = {5, 1, 3, 4, 7}
// Output: 4
// Explanation: Below are triplets with 
// sum less than 12 (1, 3, 4), (1, 3, 5), 
// (1, 3, 7) and (1, 4, 5).

import java.util.Arrays;

public class CountTripletsArray2 {
    public static void main(String[] args) {
        int n1 = 4;
        int sum1 = 2;
        long arr1[] = {-2, 0, 1, 3};
        System.out.println(countTriplets(arr1, n1, sum1));

        int n2 = 5;
        int sum2 = 12;
        long arr2[] = {5, 1, 3, 4, 7};
        System.out.println(countTriplets(arr2, n2, sum2));
    }

    public static long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long count = 0;
        for(int i=0; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i] + arr[j] + arr[k] < sum){
                    count = count+(k-j);
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return count;
    }
}
