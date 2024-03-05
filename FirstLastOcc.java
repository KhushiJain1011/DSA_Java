// Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.

// Example 1:
// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 

// Example 2:
// Input:
// n=9, x=7
// arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
// Output:  
// 6 6
// Explanation: 
// First and last occurrence of 7 is at index 6.

import java.util.ArrayList;

public class FirstLastOcc {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n1 = 9; 
        int x1 = 5;
        System.out.println(find(arr1, n1, x1));

        int arr2[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
        int n2 = 9;
        int x2 = 7;
        System.out.println(find(arr2, n2, x2));
    }

    public static ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = {-1,-1};
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                ans[0] = i;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i] == x){
                ans[1] = i;
                break;
            }
        }
        
        list.add(ans[0]);
        list.add(ans[1]);
        return list;
    }
}
