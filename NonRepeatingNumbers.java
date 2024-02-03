// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

// Example 1:
// Input: 
// N = 2
// arr[] = {1, 2, 3, 2, 1, 4}
// Output:
// 3 4 
// Explanation:
// 3 and 4 occur exactly once.

// Example 2:
// Input:
// N = 1
// arr[] = {2, 1, 3, 2}
// Output:
// 1 3
// Explanation:
// 1 3 occur exactly once.


import java.util.Arrays;
import java.util.HashMap;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int n1 = 2;
        int arr1[] = {1, 2, 3, 2, 1, 4};
        int res1[] = singleNumber(arr1);
        display(res1);

        int n2 = 1;
        int arr2[] = {2,1,3,2};
        int res2[] = singleNumber(arr2);
        display(res2);
    }

    static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == 1) {
                ans[j++] = nums[i];
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
