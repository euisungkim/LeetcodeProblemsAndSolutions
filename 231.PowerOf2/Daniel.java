
// Name: Daniel Eui Sung Kim
// Date: October 8th, 2017
// From: LeetCode
// Problem: #231 Power of Two

class Solution
{
    public boolean isPowerOfTwo(int n)
    {
        if ( n <= 0 ) return false;
        while ( n > 1 )
        {
            // power of 2 must return 0 at each division
            if ( n % 2 == 1 ) return false;
            n /= 2;
        }
        return true;
    }
}