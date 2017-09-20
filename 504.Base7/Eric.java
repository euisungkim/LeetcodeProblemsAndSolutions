
// Name: Eric Kwon
// Date: September 20th, 2017
// From: LeetCode
// Problem:
// Given an integer, return its base 7 string representation.


class Solution {
    public String convertToBase7(int num) {

        // Return zero if input is 0
        if (num == 0) {
            String result = "0";
            return result;
        }
        
        // If input is negative, indicate
        Boolean negative = false;
        if (num < 0) {
            num = num * -1;
            negative = true;
        }
        
        // Integer placeholder for the result
        // Decimal place indicator
        int result_int = 0;
        int decimal_place = 1;
        
        // While the target number is reduced to >= 7
        // Find the modulus of the target number and store as the right most digit
        while (num >= 7) {
            int digit = (num % 7) * decimal_place;
            if (digit != 0)
                result_int += digit;
            decimal_place *= 10;
            num = num / 7;
        }
        result_int = result_int + (num * decimal_place);
        
        // If the result was initially negative, convert back to negative
        if (negative == true)
            result_int = result_int * -1;
        String result = String.valueOf(result_int);
        return result;       
    }
}