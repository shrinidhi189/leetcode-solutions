// 9. Palindrome Number - To check if a given Number is same after reversing
// Difficulty: Easy
// My Approach: Math, Reversing the number
// Time Complexity: O(log₁₀(n))
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int x) 
    {
        int sum=0;
        int temp=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
}
