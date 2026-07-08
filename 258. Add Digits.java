// 258. Add Digits - To repeatedly add the digits of a number until it becomes a single digit.
// Difficulty: Easy
// My Approach: Nested while loops (can be optimised using digital root formula: 1 + (num-1) % 9)
// Time complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int addDigits(int num) 
    {
        int sum=0;
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
                int r=num%10;
                sum=sum+r;
                num=num/10;
            }
            num=sum;
        }
        return num;
        
    }
}
