// 4. Median of Two Sorted Arrays - To find the median of two sorted arrays after merging them
// Difficulty: Hard
// My Approach: Array, Sorting, Brute-force (can be optimised using Binary Search)
// Time Complexity: O((n+m) log(n+m))
// Space Complexity: O(n+m)

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> li = new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        double res=0;
        for(int i=0;i<n;i++)
        {
            li.add(nums1[i]);
        }
        for(int i=0;i<m;i++)
        {
            li.add(nums2[i]);
        }
        Collections.sort(li);
        int a=li.size();
        if(a%2!=0)
        {
            int temp=a/2;
            res=li.get(temp);
        }
        else
        {
            int temp=a/2;
            int b=temp+1;
            res = (li.get(temp-1)+li.get(temp))/2.0;
        }
        return res;
    }
}
