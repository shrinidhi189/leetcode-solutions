// 744. Find Smallest Letter Greater Than Target - To find the smallest character that is lexicographically greater than target.
// Difficulty: Easy
// My Approach: Array (can be optimised using Binary Search)
// Time complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int n=letters.length;
        int min=Integer.MAX_VALUE;
        char res=letters[0];
        for(int i=0;i<n;i++)
        {
            if(letters[i]>target && letters[i]<min)
            {
                min=letters[i];
                res=letters[i];
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return letters[0];
        }
        return res;
    }
}
