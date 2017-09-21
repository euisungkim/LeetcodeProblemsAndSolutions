
// Name: Eric Kwon
// Date: September 20th, 2017
// From: LeetCode
// Problem: #9 Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        
        // Return false for any negative integers       
        if (x < 0)
            return false;
        
        // Comparison will be made with queue and stack
        Queue <Integer> xqueue = new LinkedList<>();
        Stack <Integer> xstack = new Stack <>(); 
        
        // Push() and Add() %10 value of the integer (the last digit)
        while (x > 0) {
            xqueue.add(x%10);
            xstack.push(x%10);
            x = x/10;
        }
        
        // Pop() and Remove() - Compare and if any mismatch is found, return false
        while (!xqueue.isEmpty()) {
            if (xqueue.remove() != xstack.pop())
                return false;
        }
        return true;    
    }
}