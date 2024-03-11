// Given an integer array arr[] of size n. The task is to find sum of it.

// Example 1:
// Input:
// n = 4
// arr[] = {1, 2, 3, 4}
// Output: 10
// Explanation: 1 + 2 + 3 + 4 = 10.

// Example 2:
// Input:
// n = 3
// arr[] = {1, 3, 3}
// Output: 7
// Explanation: 1 + 3 + 3 = 7.

public class SumOfArray{
    public static void main(String[] args) {
        int n1 = 4;
        int arr1[] = {1, 2, 3, 4};
        System.out.println(sum(arr1, n1));

        int n2 = 3;
        int arr2[] = {1,3,3};
        System.out.println(sum(arr2, n2));
    }

    public static int sum(int arr[], int n) {
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}