
// Name: Eric Kwon
// Date: October 4th, 2017
// From: LeetCode
// Problem: #404 Sum of Left Leaves

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        
        // If root is null, return 0
        if (root == null)
            return 0;
        
        // If root is standalone, return 0
        if (root.left == null && root.right == null)
            return 0;
        
        // Instantiate a queue and add root to the queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        // Resulting integer
        int result = 0;
        
        // Iterate through the queue
        while (!queue.isEmpty()) {
            
            // Set the top node to cur
            TreeNode cur = queue.remove();
            
            // If the left of the current is not null
            if (cur.left != null) {

            // If it is leaf, add to result
            if (cur.left.left == null && cur.left.right == null) {
                result += cur.left.val;
            }

            // Otherwise add to queue
            else {
                queue.add(cur.left);
            }
            }
            
            // If the right of the current is not null
            if (cur.right != null) {

            // If it is leaf, continue
            if (cur.right.left == null && cur.right.right == null) {
                continue;
            }

            // Otherwise add to queue
            else {
                queue.add(cur.right);
            }
            }    
        }
        return result;  
    }
}