// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example: 
// N = 5
// A[] = {1,2,3,5}
// Output: 4

// Example 2:
// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9

import java.util.Arrays;

public class MissingNoInArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5};
        System.out.println(findMissingNo(arr1, 5));

        int arr2[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(findMissingNo(arr2, 10));

        int arr3[] = {3,7,6,5,4,2,1};
        System.out.println(findMissingNo(arr3, 8));
    }

    public static int findMissingNo(int arr[], int n){
        int size = arr.length;
        //  size = n-1
        int i;
        Arrays.sort(arr);
        for(i=0; i<size; i++){
            
            if(arr[i] != i+1){
                return (i+1);
            }
        }
        return i+1;
    }
}


// int arr3[] = {1,3,8,9,4,6,2,5,7,9,10};
//         // int arr3[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20};
//         System.out.println(findMissingNo(arr3, 11));