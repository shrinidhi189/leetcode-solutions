// 191. Number of 1 Bits - Number of set bits in its binary representation
// Difficulty: Easy
// My Approach: Decimal to Binary Conversion (String), Count Set Bits
// Time Complexity: O(log n)
// Space Complexity: O(log n)

class Solution {
    public int hammingWeight(int n) 
    {
        String s="";
        while(n>0)
        {
            int r=n%2;
            s=s+r;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                count++;
            }
        }
        return count;
    }
}
