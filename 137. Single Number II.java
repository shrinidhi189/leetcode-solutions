// 137. Single Number II- Find the element that appears only once in an array.
// Difficulty: Medium
// My Approach: HashMap (can be optimised using XOR)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int singleNumber(int[] nums) 
    {
        HashMap<Integer, Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])==1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}
