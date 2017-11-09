
// Name: Eric Kwon
// Date: November 9th, 2017
// From: LeetCode
// Problem: #697 Degree of an Array

class Solution {
    public int findShortestSubArray(int[] nums) {
        
        // First map will contain integer and its degree
        // Second map will contain integer and array of its first index of appearance and last
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, int[]> map2 = new HashMap<Integer, int[]>();
        int arraySize = nums.length;
        int maxDegree = 0;
        
        for (int i=0 ; i < arraySize ; i++) {

            // If map2 does not have the key, record its first appearance
            if (!map2.containsKey(nums[i])) {
                map2.put(nums[i], new int[2]);
                map2.get(nums[i])[0] = i;
                map2.get(nums[i])[1] = i;
            }

            // Else refresh its last appearance
            else {
                map2.get(nums[i])[1] = i;
            }

            // If map does not have the key, record as 1 - else add 1 to existing value
            // Track the max degree
            map.put(nums[i],map.containsKey(nums[i])?map.get(nums[i])+1:1);
            maxDegree = Math.max(maxDegree,map.get(nums[i]));
        }
        
        // Queue that will contain values of the integers with max degree
        Queue<Integer> queue = new LinkedList<>();
        
        // Traverse through the array and if map returns max degree - add to queue
        for (int i=0 ; i < arraySize ; i++) {
            if (map.get(nums[i]) == maxDegree)
                queue.add(nums[i]);
        }
        
        // Compare with largest integer value
        int result = Integer.MAX_VALUE;
        
        while(!queue.isEmpty()) {
            int x = queue.remove();

            // Get the first and last appearance of the integer with max degree
            // And track which has the minimum distance
            int a = map2.get(x)[0];
            int b = map2.get(x)[1];
            result = Math.min(result,b-a+1);
        }
        return result;
    }
}