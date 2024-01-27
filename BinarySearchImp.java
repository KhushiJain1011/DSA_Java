// Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
// Input:
// N = 5
// arr[] = {1 2 3 4 5} 
// K = 4
// Output: 3
// Explanation: 4 appears at index 3.

import java.util.*;
class BinarySearchImp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (the size of array): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search (k): ");
        int k = sc.nextInt();

        System.out.println(binarySearch(arr, k));
    }

    public static int binarySearch(int arr[], int target){
        int st = 0;
        int end = arr.length - 1;

        while(st<=end){
            int mid = st + (end-st)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }
}