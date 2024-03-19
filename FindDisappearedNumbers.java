// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:
// Input: nums = []
// Output: [5,6]

// Example 2:
// Input: nums = [1,1]
// Output: [2]
 
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int nums1[] = {4,3,2,7,8,2,3,1};
        List<Integer> res1 = findDisappearedNumbers(nums1);
        System.out.println(res1);

        int nums2[] = {1,1};
        List<Integer> res2 = findDisappearedNumbers(nums2);
        System.out.println(res2);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> g = new ArrayList<>();
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = 1;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 0) {
                g.add(i);
            }
        }
        return g;
    }

}
