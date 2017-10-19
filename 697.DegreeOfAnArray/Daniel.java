
// Name: Daniel Eui Sung Kim
// Date: October 19th, 2017
// From: LeetCode
// Problem: #697 Degree of an Array

class Solution
{
    public int findShortestSubArray(int[] nums)
    {
        if ( nums.length == 0 ) return 0;
        int maxDegree = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // getting max degree for nums[] array
        for ( int i = 0; i < nums.length; i++ )
        {
            if ( map.containsKey(nums[i]) )
                map.put( nums[i], map.get(nums[i])+1 );
            else
                map.put( nums[i], 1 );
            maxDegree = Math.max( maxDegree, map.get(nums[i]) );
        }
        
        HashMap<Integer, Integer> numbersWithMaxDegree = new HashMap<>();
        
        // getting lowest Index & check if number has max degree
        for ( int i = 0; i < nums.length; i++ )
        {
            int currentDegree = map.get(nums[i]);
            if ( !numbersWithMaxDegree.containsKey(nums[i]) && currentDegree == maxDegree )
                numbersWithMaxDegree.put(nums[i], i);
        }
        
        int result = Integer.MAX_VALUE;
        
        // getting highest Index
        for ( int i = nums.length-1; i >= 0; i-- )
        {
            // if this number with max degree and max index hasn't been found yet
            if ( numbersWithMaxDegree.containsKey(nums[i]) && (i - numbersWithMaxDegree.get(nums[i]) + 1 >= numbersWithMaxDegree.get(nums[i])) )
            {
                // put number of elements between lowest index and highest index
                numbersWithMaxDegree.put(nums[i], (i - numbersWithMaxDegree.get(nums[i]) + 1));
                // result is the smallest possible length
                result = Math.min(numbersWithMaxDegree.get(nums[i]), result);
            }
        }
        
        return result;
    }
}