
// Name: Daniel Eui Sung Kim
// Date: July 20th, 2017
// From: LeetCode
// Problem: #13 Roman to Integer

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] romanNums = s.toCharArray();
        // roman numerals
        final HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int count = 0;
        for (int i = 1; i < romanNums.length; i++)
        {
            if ( map.get(romanNums[i-1]) < map.get(romanNums[i]) )
            {
                result += map.get(romanNums[i]) - map.get(romanNums[i-1]);
                // result has been added to add roman[i] and roman[i-1] so we go to the next character
                i++;
                count++;
            }
            else
            {
                // if roman[i-1] value is greater or equal to roman[i], just add to result
                result += map.get(romanNums[i-1]);
            }
            count++;
        }

        if ( count < romanNums.length )
        {
            result += map.get(romanNums[romanNums.length-1]);
        }
        
        return result;
    }
}