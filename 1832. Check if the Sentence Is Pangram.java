// 1832. Check if the Sentence Is Pangram - To check if a sentence contains every letter of the English alphabet at least once.
// Difficulty: Easy
// My Approach: HashSet, Check Size == 26 (can be optimized using Boolean Array)
// Time complexity: O(n)
// Space Complexity: O(1) 

class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        Set<Character> li=new LinkedHashSet<>();
        int n=sentence.length();
        for(int i=0;i<n;i++)
        {
            char a= sentence.charAt(i);
            li.add(a);
        }
        if(li.size()==26)
        {
            return true;
        }
        return false;
    }
}
