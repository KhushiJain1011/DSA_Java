// Given a N X N binary Square Matrix where each row and column of the matrix is sorted in ascending order. Find the total number of zeros present in the matrix.

// Example 1:
// Input:
// N = 3
// A = {{0, 0, 0},
//      {0, 0, 1},
//      {0, 1, 1}}
// Output: 6
// Explanation: 
// The first, second and third row contains 3, 2 and 1
// zeroes respectively.

// Example 2:
// Input:
// N = 2
// A = {{1, 1},
//      {1, 1}}
// Output: 0
// Explanation:
// There are no zeroes in any of the rows.

public class CountZerosInSortedMatrix {
    public static void main(String[] args) {
        int n1 = 3;
        int mat1[][] = {{0, 0, 0},
                        {0, 0, 1},
                        {0, 1, 1}};
        System.out.println(countZeros(mat1, n1));
   
        int n2 = 2;
        int mat2[][] = {{1, 1},
                        {1, 1}};
        System.out.println(countZeros(mat2, n2));
    }

    public static int countZeros(int A[][], int N)
    {
        int count = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(A[i][j] == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
