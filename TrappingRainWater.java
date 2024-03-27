// Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

// Example 1:
// Input:
// N = 6
// arr[] = {3,0,0,2,0,4}
// Output:
// 10
// Explanation: 

// Example 2:
// Input:
// N = 4
// arr[] = {7,4,0,9}
// Output:
// 10
// Explanation:
// Water trapped by above 
// block of height 4 is 3 units and above 
// block of height 0 is 7 units. So, the 
// total unit of water trapped is 10 units.

// Example 3:
// Input:
// N = 3
// arr[] = {6,9,9}
// Output:
// 0
// Explanation:
// No water will be trapped.

import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        int n1 = 6;
        int arr1[] = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr1, n1));

        int n2 = 4;
        int arr2[] = {7,4,0,9};
        System.out.println(trappingWater(arr2, n2));

        int n3 = 3;
        int arr3[] = {6,9,9};
        System.out.println(trappingWater(arr3, n3));
    }

    public static long trappingWater(int arr[], int n) {
        // Your code here
        int rmax = arr[arr.length - 1];
        long ans = 0;
        Stack<Integer> st = new Stack<Integer>();

        for (int i = arr.length - 2; i >= 1; i--) {
            rmax = Math.max(rmax, arr[i]);
            st.push(rmax);
        }

        int leftmax = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            leftmax = Math.max(leftmax, arr[i]);
            int min = Math.min(st.peek(), leftmax);
            ans += Math.abs(arr[i] - min);
            st.pop();
        }

        return ans;
    }
}
