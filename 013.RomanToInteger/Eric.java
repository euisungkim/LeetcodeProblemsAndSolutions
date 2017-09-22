
// Name: Eric Kwon
// Date: September 22th, 2017
// From: LeetCode
// Problem: #13 Roman to Integer

class Solution {
    public int romanToInt(String s) {
        
        // Hashmap to store the roman letters and their corresponding values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        // If the input is single roman letter, return the value
        int result = map.get(s.charAt(0));
        int arraySize = s.length();
        if (arraySize == 1) {
            return result;
        }
        
        // If the input is >1 inputs, run through the string
        // Rule : If value at i > i+1 - add
        // Rule : If value at i < i-1 - subtract
        result = 0;
        int continuous = map.get(s.charAt(0));
        for (int i=0 ; i<arraySize-1 ; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                continuous += map.get(s.charAt(i+1));
            }
            else if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result = result - continuous;
                continuous = map.get(s.charAt(i + 1));
            }
            else {
                result += continuous;
                continuous = map.get(s.charAt(i + 1));
            }
        }
        result += continuous;
        return result;    
    }
}