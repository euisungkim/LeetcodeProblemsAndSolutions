
// Name: Daniel Eui Sung Kim
// Date: November 8th, 2017
// From: LeetCode
// Problem: #537 Complex Number Multiplication

class Solution
{
    public void calculateAB(int[] results, char[] aChar)
    {
        boolean negativeExists = false;
        StringBuilder sb = new StringBuilder();
        
        for ( int i = 0, j = 0; i < aChar.length; i++ )
        {
            // if '-' exists then need to negate the number
            if ( aChar[i] == '-' ) 
              negativeExists = true;
            if ( Character.isDigit(aChar[i]) )
              sb.append(aChar[i]);
            else
            {
                if ( sb.length() > 0 )
                {
                    results[j] = Integer.parseInt(sb.toString());
                    if ( negativeExists ) results[j] *= -1;
                    j++;
                    negativeExists = false;
                }
                sb = new StringBuilder();
            }
        }
    }
    
    public String complexNumberMultiply(String a, String b)
    {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();  
        
        int[] aResults = new int[2];
        calculateAB(aResults, aChar);
        int[] bResults = new int[2];
        calculateAB(bResults, bChar);
        
        int a1 = (aResults[1] * bResults[1] * -1) + (aResults[0] * bResults[0]);
        int b1 = (aResults[1] * bResults[0]) + (aResults[0] * bResults[1]);
        
        StringBuilder sb = new StringBuilder();
        sb.append(a1).append("+").append(b1).append("i");

        return sb.toString();
    }
}