
// Name: Daniel Eui Sung KIm
// Date: October 4th, 2017
// From: LeetCode
// Problem: #404 Sum of Left Leaves

class Solution
{
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root)
    {   
        if ( root == null ) return 0;
        // checking if current node is a left leaf
        if ( root.left != null && root.left.left == null && root.left.right == null )
            sum += root.left.val;
        
        // call left and right recursively
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        
        return sum;
    }
}