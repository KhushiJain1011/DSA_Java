// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array. 

// Example 1:
// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

// Example 2:
// Input: arr = [1,2,3,4], k = 2
// Output: 6
// Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 

public class kthMissingPositiveNumber {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,7,11};
        int k1 = 5;
        System.out.println(findKthPositive(arr1, k1));

        int arr2[] = {1,2,3,4};
        int k2 = 2;
        System.out.println(findKthPositive(arr2, k2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int missingNum = 1;
        int numOrder = 1;
        int size = Math.max(arr.length, (arr.length + k));
        for (int i = 0; i < size; i++) {
            if (i > arr.length - 1) {
                if (k == missingNum) {
                    return numOrder;
                }
                numOrder++;
                missingNum++;
            } else if (arr[i] == numOrder) {
                numOrder++;
            } else {
                if (k == missingNum) {
                    return numOrder;
                }
                numOrder++;
                missingNum++;
                i--;
            }
        }
        return numOrder;
    }
}
