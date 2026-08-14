// 14. Longest Common Prefix - Find the longest common prefix string amongst an array of strings.
// Difficulty: Easy
// My Approach: Brute Force - String Traversal, Prefix Matching (can be optimized using Character Comparison)
// Time Complexity: O(n * m)
// Space Complexity: O(m)


class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        List<String> li = Arrays.asList(strs);
        String r="";
        int n=strs.length;
        String res="";
        for(int i=0;i<strs[0].length();i++)
        {
            int count=0;
            r=r+strs[0].charAt(i);
            for(int j=1;j<n;j++)
            {
               if(li.get(j).startsWith(r))
               {
                count++;
               }
            }
            if(count==n-1)
            {
                res=r;
            }
            else
            {
                break;
            }
        }
       return res;
    }
}
