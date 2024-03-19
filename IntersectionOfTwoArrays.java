// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

// Example 2:
// Input: nums1 = [4,9,5], nums2 = []
// Output: [9,4]
// Explanation: [4,9] is also accepted.

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int nums1_A[] = {1,2,2,1};
        int nums2_A[] = {2,2};
        int res1[] = intersection(nums1_A, nums2_A);
        display(res1);
        
        int nums1_B[] = {4,9,5};
        int nums2_B[] = {9,4,9,8,4};
        int res2[] = intersection(nums1_B, nums2_B);
        display(res2);
    }   

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int res[] = new int[ans.size()];
        int j = 0;
        for(int el: ans){
            res[j++] = el;
        }
        return res;
    }
}
