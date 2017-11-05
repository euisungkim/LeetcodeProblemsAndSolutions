
// Name: Eric Kwon
// Date: October 13th, 2017
// From: LeetCode
// Problem: #203 Remove Linked List Elements

class Solution {
    public ListNode removeElements(ListNode head, int x) {
        
        // Check to see if the first element is not the target value
        // If so, change head to the next value, once the first non-target head is found, break
        while (head != null) {
            if (head.val == x) {
                head = head.next;
            }
            else
                break;
        }
        
        // Set head to cur
        ListNode cur = head;
        
        // Check to see if the next value is not null and that it's also not the target value
        // If target value = change next to next.next
        // Otherwise continue
        while (cur != null) {
            if (cur.next != null && cur.next.val == x) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return head; 
    }
}