// Given a binary array A[] of size N. The task is to arrange the array in increasing order.
// Note: The binary array contains only 0  and 1.

// Example 1:
// Input: 
// 5
// 1 0 1 1 0
// Output: 
// 0 0 1 1 1
// Explanation: 
// After arranging the elements in 
// increasing order, elements will be as 
// 0 0 1 1 1.

public class BinaryArraySorting {
    static void binarySort(int A[], int N){
        int countZ = 0;
        int countO = 0;
        for(int i=0; i<N; i++){
            if(A[i] == 0) countZ++;
            else countO++;
        }
        
        for(int i=0; i<countZ; i++){
            A[i] = 0;
        }
        for(int i=countZ; i<countZ+countO; i++){
            A[i] = 1;
        }
    }

    public static void display(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1, 0, 1, 1, 0};
        int N1 = 5;
        System.out.println("Unsorted: ");
        display(arr1);
        binarySort(arr1, N1);
        System.out.println("Sorted:");
        display(arr1);

        int arr2[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        int N2 = 10;
        System.out.println("Unsorted: ");
        display(arr2);
        binarySort(arr2, N2);
        System.out.println("Sorted: ");
        display(arr2);
    }
}
