
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #191 Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // Convert the integer into a binary string
        String binary = Integer.toBinaryString(n);
        int strSize = binary.length();
        int result = 0;
        
        // For the size of the binary string, count the # of times where 1 occurs
        for (int i=0 ; i < strSize ; i++) {
            if (binary.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}