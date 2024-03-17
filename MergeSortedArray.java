// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

// Example 3:
// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1_A[] = { 1, 2, 3, 0, 0, 0 };
        int m_A = 3;
        int nums2_A[] = { 2, 5, 6 };
        int n_A = 3;
        merge(nums1_A, m_A, nums2_A, n_A);
        for(int i=0; i<nums1_A.length; i++){
            System.out.print(nums1_A[i]+" ");
        }
        System.out.println();

        int nums1_B[] = { 1 };
        int m_B = 1;
        int nums2_B[] = {};
        int n_B = 0;
        merge(nums1_B, m_B, nums2_B, n_B);
        for(int i=0; i<nums2_A.length; i++){
            System.out.print(nums2_A[i]+" ");
        }
        System.out.println();

        int nums1_C[] = {0};
        int m_C = 0;
        int nums2_C[] = {1};
        int n_C = 1;
        merge(nums1_C, m_C, nums2_C, n_C);
        for(int i=0; i<nums1_C.length; i++){
            System.out.print(nums1_C[i]+" ");
        }
        System.out.println();

    }

    // public static void display(int arr[]){
    // for(int i=0; i<arr.length; i++){
    // System.out.print(arr[i]+' ');
    // }
    // System.out.println();
    // }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
        // display(nums1);
    }
}
