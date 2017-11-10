
// Name: Daniel Eui Sung Kim
// Date: October 16th, 2017
// From: LeetCode
// Problem: #83 Remove Duplicates From Sorted List

class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if ( head == null )
            return null;
        
        // Create dummyNode to make it easier to have a node "ahead" of another previous node
        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        dummyNode.next = head;
        
        ListNode node1 = dummyNode.next;
        ListNode node2 = dummyNode;
    
        while ( node1 != null )
        {
            if ( node1.val == node2.val )
            {
                node2.next = node1.next; // remove duplicate
                node1 = node1.next;      // only move node1 to next
            }
            else
            {
                node2 = node2.next;
                node1 = node1.next;
            }
        }
        
        // return head
        return dummyNode.next;
    }
}