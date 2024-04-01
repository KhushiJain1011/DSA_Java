// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

// Example 1:
// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Example 2:
// Input: grid = [[3,2],[1,0]]
// Output: 0

public class CountNegativeNosInSortedMatrix {
    public static void main(String[] args) {
        int grid1[][] = {{4,3,2,-1},
                        {3,2,1,-1},
                        {1,1,-1,-2},
                        {-1,-1,-2,-3}};
        System.out.println(countNegatives(grid1));

        int grid2[][] = {{3,2},
                        {1,0}};
        System.out.println(countNegatives(grid2));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        
        int r = 0;
        int c = grid[0].length - 1;
        
        while (r < grid.length && c >= 0) {
            if (grid[r][c] < 0) {
                count += (grid.length - r);
                c--;
            } else {
                r++;
            }
        }
        return count;
    }
}
