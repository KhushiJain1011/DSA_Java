// Given an array A[] of size n. The task is to find the largest element in it.
// Example: 
// n = 7
// A[] = {1, 2, 0, 3, 2, 4, 5}
// Output:
// 5

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = largest(arr);
        System.out.println("Result: " + ans);
    }

    public static int largest(int arr[]){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
