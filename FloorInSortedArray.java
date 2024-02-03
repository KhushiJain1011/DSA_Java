// Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

// Example 1:
// Input:
// N = 7, x = 0 
// arr[] = {1,2,8,10,11,12,19}
// Output: -1
// Explanation: No element less 
// than 0 is found. So output 
// is "-1".

// Example 2:
// Input:
// N = 7, x = 5 
// arr[] = {1,2,8,10,11,12,19}
// Output: 1
// Explanation: Largest Number less than 5 is
// 2 (i.e K = 2), whose index is 1(0-based 
// indexing).

public class FloorInSortedArray {
    public static void main(String[] args) {
        int n1 = 7;
        int x1 = 0;
        long arr1[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr1, n1, x1));

        int n2 = 7;
        int x2 = 5;
        long arr2[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr2, n2, x2));
    }

    static int findFloor(long arr[], int n, long x)
    {
        int ans = -1;
        long el = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                // el = arr[i];
                ans = i;
            }
        }
        return ans;
    }
}
