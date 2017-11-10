
// Name: Eric Kwon
// Date: November 9th, 2017
// From: LeetCode
// Problem: #338 Counting Bits

class Solution {
    public int[] countBits(int num) {
        
        // The integer array containing the result
        int[] result = new int[num+1];
        
        // For loop to iterate for O(numOfInteger)
        for (int i=num ; i>=0 ; i--){
        
            // Convert the last number to string and strip the 0's
            String target = Integer.toBinaryString(i);
            target = target.replace("0","");

            // Save the length of the resulting string to the array
            result[i] = target.length();
        }
        return result;
    }
}