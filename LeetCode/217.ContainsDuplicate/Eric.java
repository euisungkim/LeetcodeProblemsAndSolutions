
// Name: Eric Kwon
// Date: October 18th, 2017
// From: LeetCode
// Problem: #217 Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Use HashSet which will add all the array elements
        Set<Integer> list = new HashSet<Integer>();
        int arraySize = nums.length;
        
        // Traverse through the array
        for (int i=0; i < arraySize ; i++) {
            
            // If same element has been added to hashset, return true
            if (list.contains(nums[i]))
                return true;
            
            // Otherwise add onto hashset
            list.add(nums[i]);
        }
        
        // If none, return false
        return false;
    }
}