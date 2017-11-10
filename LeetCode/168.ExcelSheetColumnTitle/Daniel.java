// Name: Daniel Eui Sung Kim
// Date: September 26th, 2017
// From: LeetCode
// Problem: #161 Excel Sheet Column Title

class Solution
{
    public String convertToTitle(int n)
    {
        char alphabet;
        StringBuilder sb = new StringBuilder();
        
        while ( n > 0 )
        {
            // get character according to remainder 26
            alphabet = (char)((n - 1) % 26 + 65);
            sb.append(alphabet);

            // get to the previous corresponding character
            n = (n - 1) / 26;
        }
        
        // since appending, reverse then return the string
        return sb.reverse().toString();
    }
}