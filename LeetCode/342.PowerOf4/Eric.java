
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #342 Power of Four

class Solution {
    public boolean isPowerOfFour(int n) {
        
        // Binary string representation of the given integer and its length
        String binary = Integer.toBinaryString(n);
        int strLength = binary.length();
        
        // If input is less than or equal to 0, false
        if (n <= 0)
            return false;

        // For others, check if it is power of 2 first, and if it's true
        // Check if the length of binary string is of odd length
        // Eg: 			1	->	1			
        //				4	-> 	1 0 0
        //				16  ->	1 0 0 0 0		
        //				64  ->  1 0 0 0 0 0 0
        else if ((n & n-1)==0 && (strLength % 2) == 1)
            return true;

        // Otherwise return false
        else
            return false;     
    }
}