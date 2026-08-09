// 128. Longest Consecutive Sequence - Find the length of the longest consecutive elements sequence
// Difficulty: Medium
// My Approach: Sorting, Linear Traversal (can be optimized using HashSet)
// Time Complexity: O(n log n)
// Space Complexity: O(1)


class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int n=nums.length;
        int count=1;
        Arrays.sort(nums);
        if(n==0)
        {
            return 0;
        }
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i+1]-nums[i]==1)
            {
                count++;
            }
            else if(nums[i+1]-nums[i]==0)
            {
                continue;
            }
            else
            {
                max = Math.max(max, count);
                count=1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
