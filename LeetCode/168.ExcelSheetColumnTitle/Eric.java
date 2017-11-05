
// Name: Eric Kwon
// Date: September 26th, 2017
// From: LeetCode
// Problem: #161 Excel Sheet Column Title

class Solution {
    public String convertToTitle(int n) {
        
        // Character return array for the corresponding inputs
        char[] alphabets = "_ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder title = new StringBuilder();
        
        // Iteration until n is greater than 26
        while (n > 26) {

            // if n % 26 is 0, indicates Z chars
            if ((n%26) == 0) {
                title.insert(0, 'Z');
                n = n - 26;
                title.insert(0, alphabets[n/26]);
                return (title.toString()); 
            }

            // Otherwise get the modulo and append with the return from array
            int calc = n % 26;
            title.insert(0, alphabets[calc]);
            n = n / 26;
        }

        // Last iteration
        title.insert(0, alphabets[n]);
        return (title.toString());
    }
}