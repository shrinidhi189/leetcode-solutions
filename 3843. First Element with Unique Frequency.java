// 3843. First Element with Unique Frequency - To find the first element whose frequency occurs exactly once in the frequency map
// Difficulty: Easy
// My Approach: Two HashMaps
// Time complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int firstUniqueFreq(int[] nums) 
    {
        HashMap<Integer, Integer> map= new HashMap<>();
        HashMap<Integer, Integer> sec= new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int val: map.keySet())
        {
            sec.put(map.get(val),sec.getOrDefault(map.get(val),0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(sec.get(map.get(nums[i]))==1)
            {
                return nums[i];
            }
        }
        return -1;
    }
}
