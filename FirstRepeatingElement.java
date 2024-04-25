// Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
// Note:- The position you return should be according to 1-based indexing. 

// Example 1:
// Input:
// n = 7
// arr[] = {1, 5, 3, 4, 3, 5, 6}
// Output: 2
// Explanation: 
// 5 is appearing twice and 
// its first appearence is at index 2 
// which is less than 3 whose first 
// occuring index is 3.

// Example 2:
// Input:
// n = 4
// arr[] = {1, 2, 3, 4}
// Output: -1
// Explanation: 
// All elements appear only once so 
// answer is -1.

import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int n1 = 7;
        int arr1[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr1, n1));

        int n2 = 4;
        int arr2[] = {1, 2, 3, 4};
        System.out.println(firstRepeated(arr2, n2));
    }
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i=n-1; i>=0; i--){
            if(set.contains(arr[i])){
                ans = i+1;
            }
            else{
                set.add(arr[i]);
            }
        }
        return ans;
    }
}
