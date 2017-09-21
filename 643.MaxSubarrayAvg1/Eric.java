
// Name: Eric Kwon
// Date: September 20th, 2017
// From: LeetCode
// Problem: #643 Maximum Subarray Average I

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int arraySize = nums.length;

        // Placeholder for maximum average, and instantaneous average
        double max_average = 0;
        double inst_average = 0;
        
        // First maximum array from index 0 to k
        for (int i=0 ; i < k ; i++) {
            max_average += nums[i];
        }
        
        // Duplicate to allow application of sliding window
        inst_average = max_average;
        
        // Per each iteration value at 'i-1' index is subtracted and value at 'i+k-1' is added
        // 'i-1' index immediately left to the target array
        // 'i+k-1' index immediately right to the target array
        for (int i=1 ; i <= (arraySize - k) ; i++) {
            inst_average = inst_average - nums[i-1];
            inst_average = inst_average + nums[i+k-1];
            max_average = Math.max(max_average, inst_average);
        }
        return max_average / k;
    }
}