// 74. Search a 2D Matrix - Search for a target value in a 2D matrix
// Difficulty: Medium
// My Approach: Brute Force, Matrix Traversal (can be optimized using Binary Search)
// Time Complexity: O(n * m)
// Space Complexity: O(1)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
