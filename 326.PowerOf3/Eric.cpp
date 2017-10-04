
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #326 Power of Three

class Solution {
public:
    bool isPowerOfThree(int n) {
        
        // Find the maximum integer power of 3 value
        // Which is 3^19
        int maxPower3 = pow(3,19);
        
        // If 0 or less return false
        if (n <= 0)
            return false;

        // If the maxPower3 % input is 0, it's also power of 3
        else if (maxPower3 % n == 0)
            return true;

        // Otherwise return false;
        else
            return false;
    }
};