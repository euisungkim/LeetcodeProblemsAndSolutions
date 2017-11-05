
// Name: Eric Kwon
// Date: September 18th, 2017
// From: LeetCode
// Problem: #1 Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Hash map to store the array values as the KEYS
        // Store the array indices as the VALUES
        HashMap<Integer, Integer> list = new HashMap<>();
        int arraySize = nums.length;
        for (int i=0 ; i < arraySize ; i++) {
            list.put (nums[i], i);
        }
        
        // Create the array that will store the resulting indices
        int[] result = new int[2];
        
        // Scan through the hash map after creating an integer value that stores TARGET - NUMS ARRAY @ i
        // Use containsKey() to find the mapped element and return the value stored for the KEY
        // && operator added to ensure that same element is not used twice
        for (int i=0 ; i <arraySize ; i++) {
            int difference = target - nums[i];
            if (list.containsKey(difference) && list.get(difference) != i) {
                result[0] = i;
                result[1] = list.get(difference);
            }
        } 
        return result;
    }
}