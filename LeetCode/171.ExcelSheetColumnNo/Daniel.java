// Name: Daniel Eui Sung Kim
// Date: September 25th, 2017
// From: LeetCode
// Problem: #171 Excel Sheet Column Number

class Solution
{
    public int titleToNumber(String s)
    {
        // if length is 1, don't need to check other numbers
        if ( s.length() < 2 )
            return (s.charAt(0) - 'A' + 1);
        
        // store the first value
        int result = s.charAt(0) - 'A' + 1;
        for ( int i = 1; i < s.length(); i++ )
        {
            // difference is 26 by each letter
            result *= 26;
            // add the value corresponding to the character after multiplying by 26
            result += (s.charAt(i) - 'A' + 1);
        }
        
        return result;
    }
}