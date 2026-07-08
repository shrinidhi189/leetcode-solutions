// 20. Valid Parentheses - To check if Open brackets are closed by the same type of brackets in the correct order.
// Difficulty: Easy
// My Approach: String, Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isValid(String s) 
    {
        int n=s.length();
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();
                if(ch=='}' && top!='{')
                {
                    return false;
                }
                if(ch==']' && top!='[')
                {
                    return false;
                }
                if(ch==')' && top!='(')
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
