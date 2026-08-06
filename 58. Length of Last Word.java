// 58. Length of Last Word - To find the length of the last word in a given string
// Difficulty: Easy
// My Approach: String Manipulation (Trim, Split)
// Time complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int lengthOfLastWord(String s) 
    {
        s=s.trim();
        String[] words=s.split(" ");
        int n=words.length;
        int res=words[n-1].length();
        return res;
    }
}
