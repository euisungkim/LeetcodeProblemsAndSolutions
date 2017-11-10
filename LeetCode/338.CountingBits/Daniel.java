
// Name: Daniel Eui Sung Kim
// Date: October 7th, 2017
// From: LeetCode
// Problem: #303 Counting Bits

class Solution
{
    public int[] countBits(int num)
    {
        // for every numbers i in the range 0 <= i <= num
        int[] result = new int[num + 1];
        int count = 0, temp;
        // don't need to start from 0 as it will contain no 1 bit
        for ( int i = 1; i <= num; i++ )
        {
            temp = i;
            // getting binary bits shifting right each time
            for ( int j = 0; j < 32; j++ )
            {
                if ( (temp & 1) == 1 )
                    count++;
                temp = temp >>> 1;
            }
            // store count in array then reset count
            result[i] = count;
            count = 0;
        }
        
        return result;
    }
}