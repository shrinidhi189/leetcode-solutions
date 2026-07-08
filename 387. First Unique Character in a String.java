// 387. First Unique Character in a String - To find the index of the first non-repeating character in a string.
// Difficulty: Easy
// My Approach: HashMap, Frequency Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int firstUniqChar(String s) 
    {
        int n=s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char a=s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<n;i++)
        {
            char a=s.charAt(i);
            if(map.get(a)==1)
            {
                return i;
            }
        }
        return -1;
    }
}
