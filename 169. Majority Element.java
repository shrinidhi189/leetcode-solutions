// 169. Majority Element - Find the element that appears more than ⌊n/2⌋ times
// Difficulty: Easy
// My Approach: HashMap (Frequency Counting)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int majorityElement(int[] nums) 
    {
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int res=0;
        for(int val: map.keySet())
        {
           if(map.get(val)>max)
           {
            max=map.get(val);
            res=val;
           }
        }
        return res;
    }
}
