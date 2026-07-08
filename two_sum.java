// 1. Two Sum - To find the indices of two values in an array whose sum equals to the given target
// Difficulty: Easy
// My Approach: Array, Brute-force (can be optimised using HashMap)
// Time complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] sum=new int[2];
        sum[0]=-1;
        sum[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    sum[0]=i;
                    sum[1]=j;

                }
            }
        }
       return sum; 
        
    }
}
