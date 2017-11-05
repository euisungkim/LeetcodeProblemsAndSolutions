
// Name: Eric Kwon
// Date: October 16th, 2017
// From: LeetCode
// Problem: #83 Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        // Check if the ListNode is empty or single element
        if (head == null || head.next == null)
            return head;
        
        // Traversal node
        ListNode cur = head;
        
        // Loop to traverse through the ListNode
        while (cur != null && cur.next != null) {
            
            // If current val == next val, reset the node path
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            
            // Otherwise move on
            else 
                cur = cur.next;
        }
        return head;
    }
}