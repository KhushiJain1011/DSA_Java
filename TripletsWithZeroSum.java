// Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 
// Note: Return 1, if there is at least one triplet following the condition else return 0.

// Example 1:
// Input: n = 5, arr[] = {0, -1, 2, -3, 1}
// Output: 1
// Explanation: 0, -1 and 1 forms a triplet
// with sum equal to 0.

// Example 2:
// Input: n = 3, arr[] = {1, 2, 3}
// Output: 0
// Explanation: No triplet with zero sum exists. 

import java.util.Arrays;

public class TripletsWithZeroSum {
    public static void main(String[] args) {
        int n1 = 5;
        int arr1[] = {0, -1, 2, -3, 1};
        System.out.println(findTriplets(arr1, n1));

        int n2 = 3;
        int arr2[] = {1, 2, 3};
        System.out.println(findTriplets(arr2, n2));
    }

    public static boolean findTriplets(int arr[] , int n){
        if(arr.length < 3) return false;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int j=i+1;
            int k=n-1;
            while (j<k) {
                if(arr[i] + arr[j] + arr[k] == 0){
                    return true;
                }
                else if(arr[i] + arr[j] + arr[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return false;
    }
}
