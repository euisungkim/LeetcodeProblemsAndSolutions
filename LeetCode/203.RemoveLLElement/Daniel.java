
// Name: Daniel Eui Sung Kim
// Date: October 13th, 2017
// From: LeetCode
// Problem: #203 Remove Linked List Elements

public ListNode removeElements(ListNode head, int val)
{
    if ( head == null ) return null;
    
    // creating dummy node for handling exceptions
    ListNode dummyNode = new ListNode(0);
    dummyNode.next = head;
    
    // set "current" node and "one before current" node to fix LL
    ListNode cur = dummyNode.next;
    ListNode oneBeforeCur = dummyNode;
    while ( cur != null )
    {
        // found value, set the node before "current"'s next to "delete" node
        if ( cur.val == val )
        {
            oneBeforeCur.next = cur.next;
            cur = cur.next;
        }
        else
        {
            // if value not found then keep traversing through the LL
            cur = cur.next;
            oneBeforeCur = oneBeforeCur.next;
        }
    }
    
    // returning head
    return dummyNode.next;
}