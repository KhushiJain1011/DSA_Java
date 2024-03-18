// Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
// Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

// Example 1:
// Input:
// N = 5
// Arr[] = {15, 2, 45, 12, 7}
// Output: 2
// Explanation: Only Arr[2] = 2 exists here.

// Example 2:
// Input: 
// N = 1
// Arr[] = {1}
// Output: 1
// Explanation: Here Arr[1] = 1 exists.

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        int n1 = 5;
        int arr1[] = {15, 2, 45, 12, 7};
        System.out.println(valueEqualToIndex(arr1, n1));

        int n2 = 1;
        int arr2[] = {1};
        System.out.println(valueEqualToIndex(arr2, n2));
    }   

    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
