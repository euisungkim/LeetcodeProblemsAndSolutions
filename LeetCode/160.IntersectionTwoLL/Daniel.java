// Name: Daniel Eui Sung Kim
// Date: September 27th, 2017
// From: LeetCode
// Problem: #160 Intersecrion of Two Linked Lists

public class Solution
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        // if no nodes exist then there's no point of iterating
        if ( headA == null || headB == null )
            return null;

        ListNode a = headA;
        ListNode b = headB;
        
        // getting length of A and B
        int lenA = 0, lenB = 0;
        while ( a != null )
        {
            a = a.next;
            lenA++;
        }
        
        while ( b != null )
        {
            b = b.next;
            lenB++;
        }
        
        a = headA;
        b = headB;
        
        // Iterating through either A or B depending on the difference
        int difference;
        if ( lenA > lenB )
        {
            difference = lenA - lenB;
            while ( difference > 0 && a != null )
            {
                a = a.next;
                difference--;
            }
        }
        else
        {
            difference = lenB - lenA;
            while ( difference > 0 && b != null )
            {
                b = b.next;
                difference--;
            }
        }
        
        // traverse through each list until they meet at the same point
        while ( a != b )
        {
            if ( a != null )
                a = a.next;
            if ( b != null )
                b = b.next;
        }
        
        return a;
    }
}