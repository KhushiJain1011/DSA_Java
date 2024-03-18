// You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

// Example 1:
// Input:
// N = 4
// A[] = {1, 2, 3, 4}
// Output:
// 1 3

// Example 2:
// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 1 3 5

public class PrintAlternateElementsOfArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4};
        int n1 = 4;
        print(arr1, n1);

        int arr2[] = {1, 2, 3, 4, 5};
        int n2 = 5;
        print(arr2, n2);
    }

    public static void print(int arr[], int n){
        for(int i=0; i<n; i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
