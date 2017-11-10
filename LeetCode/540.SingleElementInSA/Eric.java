
// Name: Eric Kwon
// Date: November 10th, 2017
// From: LeetCode
// Problem: #540 Single Element in a Sorted Array

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Binary Search
        int low = 0;
        int high = nums.length - 1;
        int middle = 0;
        
        while (high >= low) {
            middle = low + (high - low) / 2;
            
            // If the cursor reachs the end of the list return
            if (middle == 0 || middle == nums.length-1)
                return nums[middle];
            
            // If the singled element is found - also return
            if (nums[middle] != nums[middle+1] && nums[middle] != nums[middle-1])
                return nums[middle];
            
            // If the number of the element is even and cursor matches the element to its left - shift left
            if (middle % 2 == 0 && nums[middle] == nums[middle-1])
                high = middle - 1;

            // If the number of the element is even and cursor matches the element to its right - shift right
            else if (middle % 2 == 0 && nums[middle] == nums[middle+1])
                low = middle + 1;
            
            // If the number of the element is odd and cursor matches the element to its right - shift left
            else if (middle % 2 == 1 && nums[middle] == nums[middle+1])
                high = middle - 1;

            // If the number of the element is odd and cursor matches the element to its left - shift right
            else
                low = middle + 1;      
        }
        return 0;
}
}