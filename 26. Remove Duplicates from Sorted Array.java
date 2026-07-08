// 26. Remove Duplicates from Sorted Array - To remove duplicate elements from a sorted array
// Difficulty: Easy
// My Approach: Array, LinkedHashSet (can be optimised using two-pointer technique)
// Time complexity: O(n)
// Space Complexity: O(n)

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int n=nums.length;
        Set<Integer>li = new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            li.add(nums[i]);
        }
        int i=0;
        for(int a: li)
        {
            nums[i]=a;
            i++;
        }
       return li.size(); 
    }
}
