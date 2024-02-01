// Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer. 

// Example 1:
// Input:
// N = 5, D = 2
// arr[] = {1,2,3,4,5}
// Output: 3 4 5 1 2
// Explanation: 1 2 3 4 5  when rotated
// by 2 elements, it becomes 3 4 5 1 2.

// Example 2:
// Input:
// N = 10, D = 3
// arr[] = {2,4,6,8,10,12,14,16,18,20}
// Output: 8 10 12 14 16 18 20 2 4 6
// Explanation: 2 4 6 8 10 12 14 16 18 20 
// when rotated by 3 elements, it becomes 
// 8 10 12 14 16 18 20 2 4 6.


public class RotateArray {
    public static void main(String[] args) {
        int N1 = 5, D1 = 2;
        int arr1[] = {1,2,3,4,5};
        rotateArr(arr1, N1, D1);
        display(arr1);

        int N2 = 10;
        int D2 = 3;
        int arr2[] = {2,4,6,8,10,12,14,16,18,20};
        rotateArr(arr2, D2, N2);
        display(arr2);
    }

    static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d = d%n;
        int newArr[] = new int[n];
        int j=0;
        for(int i=d; i<n; i++){
            newArr[j++] = arr[i];
        }
        for(int i=0; i<d; i++){
            newArr[j++] = arr[i];
        }
        
        for(int i=0; i<n; i++){
            arr[i] = newArr[i];
        }

    }
    
    
}
