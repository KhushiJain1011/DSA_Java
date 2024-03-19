// Given an Array Arr of N positive integers and an integer X. Return the frequency of X in the array.

// Example 1:
// Input:
// N = 5
// Arr = {1, 1, 1, 1, 1}
// X = 1
// Output: 
// 5
// Explanation: Frequency of 1 is 5.

// Example 2:
// Input:
// N = 6
// Arr = {1, 2, 3, 3, 2, 1}
// X = 2
// Output: 
// 2
// Explanation: Frequency of 2 is 2.

public class CountFrequency {
    public static void main(String[] args) {
        int n1 = 5;
        int arr1[] = {1,1,1,1,1};
        int X1 = 1;
        System.out.println(findFrequency(arr1, X1));

        int n2 = 6;
        int arr2[] = {1, 2, 3, 3, 2, 1};
        int X2 = 2;
        System.out.println(findFrequency(arr2, X2));
    }

    public static int findFrequency(int arr[], int X){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == X) count++; 
        }
        return count;
    }
}
