
// Name: Daniel Eui Sung Kim
// Date: November 1st, 2017
// From: LeetCode
// Problem: #53 Maximum Subarray

class Solution
{
    public int maxSubArray(int[] nums)
    {
        // start with first elements of the array;
        int sum = nums[0], best = nums[0];

        // compare current element and (current consecutive sum+current element);
        // this way we will be able to get the maximum subarray result
        for ( int i = 1; i < nums.length; i++ )
        {
            sum = Math.max(nums[i], sum+nums[i]);
            best = Math.max(best, sum);
        }
        
        return best;
    }
}