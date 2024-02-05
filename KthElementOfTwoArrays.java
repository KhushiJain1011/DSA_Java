// Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.

// Example 1:
// Input:
// arr1[] = {2, 3, 6, 7, 9}
// arr2[] = {1, 4, 8, 10}
// k = 5
// Output:
// 6
// Explanation:
// The final sorted array would be -
// 1, 2, 3, 4, 6, 7, 8, 9, 10
// The 5th element of this array is 6.

// Example 2:
// Input:
// arr1[] = {100, 112, 256, 349, 770}
// arr2[] = {72, 86, 113, 119, 265, 445, 892}
// k = 7
// Output:
// 256
// Explanation:
// Final sorted array is - 72, 86, 100, 112,
// 113, 119, 256, 265, 349, 445, 770, 892
// 7th element of this array is 256.

import java.util.Arrays;

public class KthElementOfTwoArrays {
    public static void main(String[] args) {
        int nA = 5;
        int mA = 4;
        int A1[] = {2, 3, 6, 7, 9};
        int A2[] = {1, 4, 8, 10};
        int kA = 5;
        System.out.println(kthElement(A1, A2, nA, mA, kA));

        int nB = 5;
        int mB = 7;
        int B1[] = {100, 112, 256, 349, 770};
        int B2[] = {72, 86, 113, 119, 265, 445, 892};
        int kB = 7;
        System.out.println(kthElement(B1, B2, nB, mB, kB));
    }

    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int ans[] = new int[n+m];
        
        int j=0;
        for(int i=0; i<n; i++){
            ans[j++] = arr1[i];
        }
        for(int i=0; i<m; i++){
            ans[j++] = arr2[i];
        }
        
        long res = 0;
        Arrays.sort(ans);
        for(int i=0; i<ans.length; i++){
               if(i == k-1){
                   res = ans[i];
               }
        }
        return res;
    }
}
