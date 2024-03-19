// Given an unsorted array arr[] of size n having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

// Example 1:

// Input : 
// n = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

// Example 2:

// Input : 
// n = 8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output :
// 7  9  10  11  -5  -3  -4  -1

public class MoveAllNegativeElementsToEnd {
    public static void main(String[] args) {
        int n1 = 8;
        int arr1[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr1, n1);
        display(arr1);

        int n2 = 8;
        int arr2[] = {-5, 7, -3, -4, 9, 10, -1, 11};
        segregateElements(arr2, n2);
        display(arr2);
    }

    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void segregateElements(int arr[], int n){
        int newArr[] = new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                newArr[j++] = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                newArr[j++] = arr[i];
            }
        }

        int k=0;
        for(int i=0; i<n; i++){
            arr[k++] = newArr[i]; 
        }
    }
}
