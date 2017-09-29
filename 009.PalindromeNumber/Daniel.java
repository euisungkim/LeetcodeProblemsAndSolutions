
// Name: Daniel Eui Sung Kim
// Date: September 29th, 2017
// From: LeetCode
// Problem: #9 Palindrome Number

class Solution
{
    public boolean isPalindrome(int x)
    {
        // getting number of digits
        int numDigits = (int)(Math.log10(x)+1);

        // if it's odd then we need to remove last digit from remaining x later
        boolean isOdd = false;
        if ( numDigits % 2 == 1 )
            isOdd = true;
        
        int length = numDigits / 2;
        int reversed = 0;

        // getting "half" of integer and reversing them
        for ( int i = 0; i < length; i++ )
        {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }
        
        if ( isOdd ) x /= 10;
        
        // comparing half of x and half of reversed half avoids overflow
        return x == reversed;
    }
}