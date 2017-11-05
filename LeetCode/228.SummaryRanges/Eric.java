
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #228 Summary Ranges

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        // Returning Array List
        List<String> result = new ArrayList<>();
        int arraySize = nums.length;
        
        // If originating array is size 0, return empty list
        if (arraySize == 0)
            return result;
        
        // If originating array is size 1, add first element and return result
        if (arraySize == 1) {
            result.add(Integer.toString(nums[0]));
            return result;
        }
        
        // FirstRun and LastRun placeholders
        int firstRun = nums[0];
        int lastRun = nums[0];
    
        // Continuous flag
        Boolean continuous = true;
        
        // Iterate through the array
        for (int i=0; i < arraySize-1 ; i++) {

            // If the numbers are NOT consecutive, mark the flag
            if (nums[i] + 1 != nums[i+1]) {
                continuous = false;
                lastRun = nums[i];
            }
            else
                continuous = true;
            
            // If the flag is marked
            if (!continuous) {

                // If FirstRun and LastRun is the same, add that element into list
                if (firstRun == lastRun) {
                    result.add(Integer.toString(lastRun));
                    firstRun = nums[i+1];
                }

                // If not, concatenate "->" and add the first and last run into the list
                else {
                    result.add(Integer.toString(firstRun)+"->"+Integer.toString(lastRun));
                    firstRun = nums[i+1];
                }
            }
            
        }
        
        // Once the iteration reaches to the second to last element, it will exit the loop
        // If continuous flag is still true, it indicates the last element on the list is continuous element
        // Therefore, add to list as continuous
        if (continuous) {
            result.add(Integer.toString(firstRun)+"->"+Integer.toString(nums[arraySize-1]));
        }

        // Otherwise add individually
        else {
            result.add(Integer.toString(firstRun));
        }
        return result;
    }
}