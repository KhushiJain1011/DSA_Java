// Given an integer array and another integer element. The task is to find if the given element is present in array or not.

// Example 1:
// Input:
// n = 4
// arr[] = {1,2,3,4}
// x = 3
// Output: 2
// Explanation: There is one test case 
// with array as {1, 2, 3 4} and element 
// to be searched as 3.  Since 3 is 
// present at index 2, output is 2.

// Example 2:
// Input:
// n = 5
// arr[] = {1,2,3,4,5}
// x = 5
// Output: 4
// Explanation: For array elements 
// {1,2,3,4,5} element to be searched 
// is 5 and it is at index 4. So, the 
// output is 4.

public class SearchAnElementInArray {
    public static void main(String[] args) {
        int n1 = 4;
        int arr1[] = {1,2,3,4};
        int x1 = 3;
        System.out.println(search(arr1, n1, x1));

        int n2 = 5;
        int arr2[] = {1,2,3,4,5};
        int x2 = 5;
        System.out.println(search(arr2, n2, x2));        
    }

    public static int search(int arr[], int N, int X)
    {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == X){
                return i;
            }
        }
        return -1;
    }
}
