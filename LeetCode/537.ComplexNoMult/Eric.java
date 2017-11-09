
// Name: Eric Kwon
// Date: November 8th, 2017
// From: LeetCode
// Problem: #537 Complex Number Multiplication

class Solution {
    public int[] variables (String a, String b) {
        
        // Split the incoming strings into 2 parts
        String[] first = a.split("\\+");
        String[] second = b.split("\\+");
        
        // Remove the "i" from the second part of the split
        first[1] = first[1].replace("i","");
        second[1] = second[1].replace("i","");
        
        // Convert to integer array
        int[] result = {Integer.valueOf(first[0]),Integer.valueOf(first[1]),Integer.valueOf(second[0]),Integer.valueOf(second[1])};
        
        return result;   
    }
    
    public String complexNumberMultiply(String a, String b) {
        
        // Pass the string and receive it back as an integer array
        int[] x = variables(a, b);
        
        // Calculate the first variable of a+-bi
        // Calculate the second variable of a+-bi
        int first = (x[0] * x[2]) - (x[1] * x[3]);
        int second = (x[0] * x[3]) + (x[1] * x[2]);
        
        // Convert the variable into a string
        String firstStr = Integer.toString(first);
        String secondStr = Integer.toString(second);
        
        // Concatenate and return
        return firstStr + "+" + secondStr + "i";    
    }
}