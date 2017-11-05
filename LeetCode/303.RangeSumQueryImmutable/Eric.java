
// Name: Eric Kwon
// Date: September 24th, 2017
// From: LeetCode
// Problem: #303 Range Sum Query - Immutable

class NumArray {
    
    // Placeholder array to be used for sumRange() function
    int[] sumSofar;

    public NumArray(int[] nums) {
        
        // During input, array to track the sum from 0th index to ith index
        // Therefore, nums[i] will hold sum from nums[0] to nums[i]
        for (int i=1 ; i < nums.length ; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        
        // Copy the result to a the placeholder
        sumSofar = nums;
    }
    
    // Input first index to last index for summation
    public int sumRange(int first, int last) {
        
        // If first is 0, simply return the last index's value as it's already retained
        if (first == 0) {
            return sumSofar[last];
        }

        // Else if first is NOT 0, simply remove the sums following up to first index from the sum soFar
        else {
            return sumSofar[last] - somSofar[first-1];
        } 
    }
}