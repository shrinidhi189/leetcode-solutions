// 41. First Missing Positive - To find the smallest positive integer not found in the array
// Difficulty: Hard
// My Approach: LinkedHashSet (can be optimised using cyclic sort / in-place swapping)
// Time complexity: O(n+m)
// Space Complexity: O(n)

class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        Set<Integer> li= new LinkedHashSet<>();
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                li.add(nums[i]);
            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        for(int i=1;i<=max;i++)
        {
            if(!li.contains(i))
            {
                return i;
            }
        }
        return max+1;        
    }
}
