// 136. Single Number - Find the element that appears only once in an array.
// Difficulty: Easy
// My Approach: Sorting, Brute-force (Nested Loops)
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return nums[i];
            }
            count=0;
        }
        return -1;
    }
}

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
