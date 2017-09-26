
// Name: Eric Kwon
// Date: September 25th, 2017
// From: LeetCode
// Problem: #171 Excel Sheet Column Number

class Solution {
    public int titleToNumber(String s) {

        // Length of the given string
        int arraySize = s.length() - 1;
        
        // Digits for base conversion
        int digit = 0;

        // Output result
        int result = 0;

        // Starting from rightmost digit, start base-26 conversion
        for (int i=arraySize ; i >= 0 ; i--) {
            char alphabet = s.charAt(i);
            int calc = alphabet - 'A' + 1;
            result += (calc * Math.pow(26, digit));
            digit++;
        }
        return result;
    }
}