
// Name: Daniel Kim
// Date: September 24th, 2017
// From: LeetCode
// Problem: #303 Range Sum Query - Immutable

class NumArray
{
    int[] numbers;
    public NumArray(int[] nums)
    {
        // initiating new array for the sums
        numbers = new int[nums.length];

        // checking if empty
        if ( nums.length > 0 )
            numbers[0] = nums[0];

        // storing sum of previous values
        for ( int i = 1; i < nums.length; i++ )
        {
            nums[i] += nums[i-1];
            numbers[i] = nums[i];
        }
    }
    
    public int sumRange(int i, int j)
    {
        // check if i is 0 then we can't do i-1: OutOfBoundsException
        if ( i == 0 )
            return numbers[j];
        // return difference between sum from 0 to j and sum from 0 to i-1 then we get sum between i,j
        else
            return numbers[j] - numbers[i-1];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
  */