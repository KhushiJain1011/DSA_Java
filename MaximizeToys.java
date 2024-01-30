// Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. Your task is to find maximum number of toys you can buy with K amount. 

// Example 1:
// Input: 
// N = 7 
// K = 50
// arr[] = {1, 12, 5, 111, 200, 1000, 10}
// Output: 4
// Explaination: The costs of the toys 
// you can buy are 1, 12, 5 and 10.

// Example 2:
// Input: 
// N = 3 
// K = 100
// arr[] = {20, 30, 50}
// Output: 3
// Explaination: You can buy all toys.

public class MaximizeToys {
    public static void main(String[] args) {
        // case 1: 
        int N1 = 7;
        int K1 = 50;
        int arr1[] ={1, 12, 5, 111, 200, 1000, 10};
        System.out.println("Result 1: "+toyCount(N1, K1, arr1));

        // case 1: 
        int N2 = 3;
        int K2 = 100;
        int arr2[] = {20, 30, 50};
        System.out.println("Result 1: "+toyCount(N2, K2, arr2));
    }

    static int toyCount(int N, int K, int arr[]){
        // sort the array: 
        sortArr(arr);
        int sum = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            sum = sum+arr[i];
            if(sum <= K){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    // sorting array using bubble sort:
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
