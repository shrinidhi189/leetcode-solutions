// 2114. Maximum Number of Words Found in Sentences - Find the maximum number of words that appear in any single sentence in the given array of sentences.
// Difficulty: Easy
// My Approach: String Traversal
// Time Complexity: O(n * m)
// Space Complexity: O(1)


class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            String s=sentences[i];
            int m=s.length();
            for(int j=0;j<m;j++)
            {
                char a=s.charAt(j);
                if(a==' ')
                {
                    count++;
                }
            }
            if(count+1>max)
            {
                max=count+1;
            }
        }
        return max;
    }
}
