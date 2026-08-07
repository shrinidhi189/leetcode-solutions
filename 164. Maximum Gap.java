// 164. Maximum Gap - Find the maximum difference between successive elements in a sorted array
// Difficulty: Medium
// My Approach: Sorting, Linear Scan (can be optimized using Bucket Sort)
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int maximumGap(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n==1)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(nums[i+1]-nums[i]>max)
            {
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}
