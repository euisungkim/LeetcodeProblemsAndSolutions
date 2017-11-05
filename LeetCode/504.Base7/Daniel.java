
/*
Name: Eui Sung Kim
Date: September 20 2017

Problem:
Given an integer, return its base 7 string representation.

Example 1:
Input: 100
Output: "202"
*/

class Daniel
{
    public String convertToBase7(int num)
    {
        StringBuilder sb = new StringBuilder();
        if ( num < 7 && num > -7 )
        {
            return sb.append(num).toString();
        }
        
        boolean numIsNeg = num < 0;
        if ( numIsNeg )
            num = Math.abs(num);
        
        int ans = 0, tenth = 1;
        while ( num > 6 )
        {
            ans += (num % 7) * tenth;
            tenth *= 10;
            num /= 7;
        }
        ans += num * tenth;
        
        if ( numIsNeg )
            ans *= -1;
        
        return sb.append(ans).toString();
    }
}