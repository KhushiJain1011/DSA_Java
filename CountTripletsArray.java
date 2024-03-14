// Given an array Arr consisting of N distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
// Example 1:
// Input: 
// N = 4 
// arr[] = {1, 5, 3, 2}
// Output: 2 
// Explanation: There are 2 triplets:
//  1 + 2 = 3 and 3 +2 = 5

// Example 2:
// Input: 
// N = 3
// arr[] = {2, 3, 4}
// Output: 0
// Explanation: No such triplet exits

import java.util.Arrays;

public class CountTripletsArray {
    public static void main(String[] args) {
        int n1 = 4;
        int arr1[] = {1, 5, 3, 2};
        System.out.println(countTriplet(arr1, n1));

        int n2 = 3;
        int arr2[] = {2, 3, 4};
        System.out.println(countTriplet(arr2, n2));
    }   

    public static int countTriplet(int arr[], int n) {
        Arrays.sort(arr); 

    int count = 0;

    for (int i = n - 1; i >= 0; i--) {
        int left = 0;
        int right = i - 1;

        while (left < right) {
            if (arr[left] + arr[right] == arr[i]) {
                count++;
                left++;
                right--;
            } else if (arr[left] + arr[right] < arr[i]) {
                left++;
            } else {
                right--;
            }
        }
    }

    return count;
    }
}
