// Name: Daniel Eui Sung Kim
// Date: September 29th, 2017
// From: LeetCode
// Problem: #7 Reverse Integer

class Solution
{
    public int reverse(int x)
    {
        // check if number is negative
        boolean isNeg = false;
        if ( x < 0 )
        {
            isNeg = true;
            x = Math.abs(x);
        }
        
        // set up stack to check for overflow
        // (prev result should not be equal to current result if overflow happens)
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        while ( x > 0 )
        {
            result *= 10;
            if ( !stack.isEmpty() && (stack.pop() != result / 10) ) // stack.pop() == previous value
                return 0;
            result += x % 10;
            x /= 10;
            stack.add(result);
        }
        
        if ( isNeg ) result *= -1;
        
        return result;
    }
}