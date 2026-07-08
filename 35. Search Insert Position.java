// 35. Search Insert Position - To find the index where target would be inserted
// Difficulty: Easy
// My Approach: Array iteration (can be optimised using binary search)
// Time complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(i!=n-1 && nums[i]<target && nums[i+1]>target)
            {
                return i+1;
            }
            else if(i==n-1 && nums[i]<target)
            {
                return i+1;
            }
        }
        return 0;
    }
}
