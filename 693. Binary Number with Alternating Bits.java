// 693. Binary Number with Alternating Bits - To check if the given binary integer has alternating bits, no two adjacent bits are same
// Difficulty: Easy
// My Approach: Loops and Conditional Statements (can be optimised using XOR operation) 
// Time complexity: O(log n)
// Space Complexity: O(log n)

class Solution {
    public boolean hasAlternatingBits(int n) 
    {
        String s="";
        while(n!=0)
        {
            int r=n%2;
            s=r+s;
            n=n/2;
        }
        int num=s.length();
        for(int i=0;i<num;i++)
        {
            int temp=0;
            char ch=s.charAt(i);
            if(i==0 && ch=='1')
            {
                temp=1;
            }
            if(temp==1 && i%2==0 && ch=='0')
            {
                return false;
            }
            else if(temp==1 && i%2!=0 && ch=='1')
            {
                return false;
            }
            else if(temp==0 && i%2!=0 && ch=='1')
            {
                return false;
            }
            else if(temp==0 && i%2==0 && ch=='0')
            {
                return false;
            }
        }
        return true;
    }
}
