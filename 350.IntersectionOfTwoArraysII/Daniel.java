
// Name: Daniel Eui Sung Kim
// Date: October 18th, 2017
// From: LeetCode
// Problem: #350 Intersection of Two Arrays II

class Solution
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        // if any one of them has 0 element, that means there are no duplicates whatsoever
        if ( nums1.length == 0 || nums2.length == 0 ) return new int[0];
        
        HashMap<Integer, Integer> num1 = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // getting count of how many duplicates there are
        for ( int i = 0; i < nums1.length; i++ )
        {
            if ( num1.containsKey(nums1[i]) )
                num1.put(nums1[i], num1.get(nums1[i]) + 1);
            else
                num1.put(nums1[i], 1);
        }
        
        // if duplicate found, decrement count of the "duplicate number"
        for ( int i = 0; i < nums2.length; i++ )
        {
            if ( num1.containsKey(nums2[i]) && num1.get(nums2[i]) > 0 )
            {
                num1.put(nums2[i], num1.get(nums2[i]) - 1);
                intersection.add(nums2[i]);
            }
        }
        
        // since int[] required for return, transfer all elements from arraylist to int array
        int[] result = new int[intersection.size()];
        for ( int i = 0; i < intersection.size(); i++ )
        {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}