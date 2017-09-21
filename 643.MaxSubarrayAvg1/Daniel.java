/*
Name: Eui Sung Kim
Date: September 21 2017

Problem:
Given an array consisting of n integers, find the contiguous subarray
of given length k that has the maximum average value.
And you need to output the maximum average value.
*/

class Solution
{
  public double findMaxAverage(int[] nums, int k)
  {
  	// getting length of N-K+1 (# of sums)
    int len = (nums.length - k) + 1;
    
    // initializing and storing result of sum[0]
    int[] sum = new int[len];
    for ( int i = 0; i < k; i++ )
      sum[0] += nums[i];
    
    // initializing maxSum to compare with other sums
    int maxSum = sum[0];
    for ( int i = 1; i < len; i++ )
    {
    	/* Example
					[1,12,-5,-6,50,3]
					sum[0] = 1+12-5-6;
					
					// start of for loop
					sum[1] = sum[0] + nums[4] - nums[0] = (1+12-5-6) + 50 - 1
					etc.
    	*/
      sum[i] = sum[i-1] + nums[i+k-1] - nums[i-1];
      // maxSum = (sum[i] > maxSum) ? sum[i] : maxSum;
      maxSum = Math.max(sum[i], maxSum);
    }

    return (double)maxSum / k;
  }
}