
// Name: Eric Kwon
// Date: September 20th, 2017
// From: LeetCode
// Problem: #7 Reverse Integer

class Solution {
    public int reverse(int x) {
        
        // Check if input is negative  
        // If input negative - convert to positive         
        Boolean negative = false;
        if (x < 0) {
            x = x * -1;
            negative = true;
        }
        
        // Long placeholder to prevent any overflow before checks
        long y = 0;

        // Add %10 of the input value per each pass, and then divide the value by 10
        while (x > 0) {
            y = y * 10;
            y += (x % 10);
            x = x / 10;
        }
        
        // If original input is negative, turn the result back to negative
        if (negative)
            y = y * -1;
        
        // Check for overflow
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        
        // Explicitly cast back to integer and return
        return (int)y;   
    }
}