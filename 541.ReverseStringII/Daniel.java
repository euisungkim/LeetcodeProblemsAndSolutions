
// Name: Daniel Eui Sung Kim
// Date: October 16th, 2017
// From: LeetCode
// Problem: #541 Reverse String II

class Solution
{
    public String reverseStr(String s, int k)
    {   
        if ( s.length() == 0 ) return s;
        
        // final result
        StringBuilder sb = new StringBuilder();
        // SB to store temporarily reversed string
        StringBuilder tempStore = new StringBuilder();

        int k2 = 2 * k; // 2k
        int length = s.length()-1;
        
        for ( int i = 0; i < s.length(); i++ )
        {
            // If there are less than k characters left, reverse all of them.
            if ( length-i < k )
            {
                tempStore.append(s.substring(i, length+1)).reverse(); // reverse all from current index to last index
                sb.append(tempStore);                                 // append it in the final result
            }
            // If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
            else if ( length-i < k2 && length-i >= k )
            {
                tempStore.append(s.substring(i, k+i)).reverse(); // reverse all from current index to first k characters from i
                sb.append(tempStore);                            // append it onto final result
                sb.append(s.substring(k+i, length+1));           // leave other as original, append to final result
            }
            else
            {
                tempStore.append(s.substring(i, k+i)).reverse(); // reverse from i to k+1 (k)
                sb.append(tempStore);                            // append to final result string
                tempStore = new StringBuilder();                 // reset temporary variable
                sb.append(s.substring(k+i, i+k2));               // append k+i to 2k+i (original string, left alone)
            }
            i = i+k2-1; // i + k2 - 1, decrementing purpose for the for loop
        }
        
        return sb.toString();
    }
}