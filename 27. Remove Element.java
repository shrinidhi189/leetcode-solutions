// 27. Remove Element - To remove all occurrences of a given value from an array in-place and return the new length
// Difficulty: Easy
// My Approach: ArrayList, iteration (can be optimised using two-pointer technique)
// Time complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int removeElement(int[] nums, int val) 
    {
        ArrayList<Integer> li = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val)
            {
                continue;
            }
            else
            {
                li.add(nums[i]);
            }
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
