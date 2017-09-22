
// Name: Eric Kwon
// Date: September 20th, 2017
// From: LeetCode
// Problem: #496 Next Greater Element I

class Solution {
    public int[] nextGreaterElement(int[] sub, int[] full) {
        
        int fullSize = full.length;

        // Store the full array as hashmap - (ArrayValue, Index)
        HashMap <Integer, Integer> list = new HashMap<>();
        for (int i=0 ; i < fullSize ; i++) {
            list.put (full[i], i);
        }
        
        int subSize = sub.length;
        int[] result = new int[subSize];
        
        // Scan through the subarray and fetch the index of the value on full array        
        for (int i=0 ; i < subSize ; i++) {
            int search = list.get(sub[i]) + 1;
            Boolean found = 0;

        // Start from the found index, and compare following indexes for greater values
            while (search < fullSize && (!found)) {
                if (full[search] > sub[i]) {
                    result[i] = full[search];
                    found = true;
                }
                search++;
            }

        // If not found, place -1 to the resulting array
            if (!found)
                result[i] = -1;   
        }
        return result;
    }
}