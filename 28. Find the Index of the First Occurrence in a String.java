// 28. Find the Index of the First Occurrence in a String - To return the index of the first occurrence of needle in haystack
// Difficulty: Easy
// My Approach: Built-in indexOf method (can be optimised using KMP algorithm)
// Time complexity: O(n*m)
// Space Complexity: O(1)

class Solution {
    public int strStr(String haystack, String needle) 
    {
        int index=haystack.indexOf(needle);
        return index;
    }
}
