// Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

// Example 1:
// Input:
// N = 4
// mat[][] = {{1, 1, 1, 1},
//            {2, 2, 2, 2}
//            {3, 3, 3, 3}
//            {4, 4, 4, 4}}
// Output: 
// {{1, 2, 3, 4},  
//  {1, 2, 3, 4}  
//  {1, 2, 3, 4}
//  {1, 2, 3, 4}} 

// Example 2:
// Input:
// N = 2
// mat[][] = {{1, 2},
//            {-9, -2}}
// Output:
// {{1, -9}, 
//  {2, -2}}


public class TransposeOfMatrix {
    public static void transpose(int n,int a[][])
    {
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
       int N = 4;
        int mat[][] = {{1, 1, 1, 1},
                    {2, 2, 2, 2},
                   {3, 3, 3, 3},
                    {4, 4, 4, 4}};
                   transpose(N,mat);
                    for(int i=0;i<N;i++){
                        for(int j=0;j<N;j++){
                           System.out.print(mat[i][j]+" ");
                
                    }
                    System.out.println();
        
    }
}
}