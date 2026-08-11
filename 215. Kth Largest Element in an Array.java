// 215. Kth Largest Element in an Array - Find the kth largest element in an unsorted array
// Difficulty: Medium
// My Approach: Sorting (can be optimized using Min-Heap / PriorityQueue or Quickselect)
// Time Complexity: O(n log n)
// Space Complexity: O(1)


class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
    }
}
