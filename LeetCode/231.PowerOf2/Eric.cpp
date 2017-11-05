
// Name: Eric Kwon
// Date: October 3rd, 2017
// From: LeetCode
// Problem: #231 Power of Two

class Solution {
public:
    bool isPowerOfTwo(int n) {

        // If input is 0, return false
        if (n<=0)
           return false;
        
        // If n AND n-1 is 0, return true
        // Example: if n=16 which is 2^4
        // Binary representation of     16 : 1 0 0 0
        //                          AND 15 : 0 1 1 1
        //                              =  : 0 0 0 0
        if ((n & (n-1)) == 0) {
           return true;
       }

        // If otherwise, return false
        else {
            return false;
        }
    }
};