// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
// Note :-  l and r denotes the starting and ending index of the array.

// Example 1:
// Input:
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// L=0 R=5
// Output : 7
// Explanation :
// 3rd smallest element in the given 
// array is 7.

// Example 2:
// Input:
// N = 5
// arr[] = 7 10 4 20 15
// K = 4 L=0 R=4
// Output : 15
// Explanation :
// 4th smallest element in the given 
// array is 15.

public class KthSmallestElement {
    public static void main(String[] args) {
        int N1 = 6;
        int arr1[] = {7,10,4,3,20,15};
        int K1 = 3;
        int L1 = 0, R1 = 5;
        System.out.println("Res 1: " + kthSmallest(arr1, L1, R1, K1));

        // case 2: 
        int N2 = 5;
        int arr2[] = {7,10,4,20,15};
        int K2 = 4;
        int L2 = 0, R2 = 4;
        System.out.println("Res 1: " + kthSmallest(arr2, L2, R2, K2));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k){
        sortArr(arr);
        int res = arr[k-1];
        return res;
    }

    // sorting: 
    static void sortArr(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
}
