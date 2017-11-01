
// Name: Eric Kwon
// Date: November 1st, 2017
// From: LeetCode
// Problem: #278 First Bad Version

public class Solution extends VersionControl { 
    public int firstBadVersion(int n) {
        
        // Sentinels for the binary search
        int low = 1;
        int high = n;
        int mid = 1;
        
        // Condition for binary traversal
        while (low <= high) {

            // Mid pointer
            mid = low + (high - low) / 2;

            // If the target is a bad version
            if (isBadVersion(mid)) {
                
                // Check to see if the version immediately prior is a good version
                if (!isBadVersion(mid-1))
                    return mid;
                
                // Otherwise reset high bound and continue
                high = mid - 1;
            }
            else {

                // Reset low bound and continue
                low = mid + 1;
            }
        }
        return mid;
    }
}