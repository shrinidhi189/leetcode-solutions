// 191. Number of 1 Bits - Count the number of 1s in the binary representation of an integer
// Difficulty: Easy
// My Approach: Brute Force - Decimal to Binary Conversion (can be optimized using Bit Manipulation)
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
