
// Name: Daniel Eui Sung Kim
// Date: October 16th, 2017
// From: LeetCode
// Problem: #217 Contains Duplicate

class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        
        for ( int i = 0; i < nums.length; i++ )
        {
            if ( set.contains(nums[i]) )
                return true;
            else
                set.add(nums[i]);
        }
        
        return false;
    }
}