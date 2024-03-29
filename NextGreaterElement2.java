// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

// Example 1:
// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.

// Example 2:
// Input: nums = [1,2,3,4,3]
// Output: [2,3,4,-1,4]
// import java.util.Stack;

import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int nums1[] = {1,2,1};
        int res1[] = nextGreaterElements(nums1);
        display(res1);

        int nums2[] = {1,2,3,4,3};
        int res2[] = nextGreaterElements(nums2);
        display(res2);
    }

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nxtG = new int[arr.length];
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i % arr.length]){
                stack.pop();
            }
            if(i < arr.length){
                if(!stack.isEmpty()){
                    nxtG[i] = stack.peek();
                }else {
                    nxtG[i] = -1;
                }
            }
            stack.push(arr[i % arr.length]);
        }
        return nxtG;
    }
}
