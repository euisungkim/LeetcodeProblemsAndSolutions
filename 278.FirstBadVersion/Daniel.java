
// Name: Daniel Eui Sung Kim
// Date: November 1st, 2017
// From: LeetCode
// Problem: #278 First Bad Version

public class Solution extends VersionControl
{
    public int firstBadVersion(int n)
    {
        // if version is bad then it must be on the left side
        // if version is good then we need to go right side until we find a bad one
        long first = 0, last = n, result = 0;
        while ( first <= last )
        {
            long half = (first+last) / 2;
            // result found
            if ( !isBadVersion((int)half) && isBadVersion((int)half+1) )
            {
                result = half+1;
                break;
            }
            // if version then we need to find the "first" bad one
            else if ( isBadVersion((int)half) )
                last = half - 1;
            // if version is good then we need to make sure previous one is the bad one
            else
                first = half + 1;
        }
        
        return (int)result;
    }
}