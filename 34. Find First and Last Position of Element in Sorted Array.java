// 34. Find First and Last Position of Element in Sorted Array
// Difficulty: Medium
// My Approach: Linear search (can be optimised using binary search)
// Time complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] a= new int[2];
        a[0]=-1;
        a[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                a[0]=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                a[1]=i;
                break;
            }
        }
        return a;
    }
}
