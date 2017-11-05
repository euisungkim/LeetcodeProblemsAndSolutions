
// Name: Eric Kwon
// Date: September 27th, 2017
// From: LeetCode
// Problem: #160 Intersecrion of Two Linked Lists

public class Solution {
    
    // Method to get Linked List Length
    public int getLength (ListNode x) {
        int result = 0;
        while (x != null) {
            result++;
            x = x.next;
        }
        return result;
    }
    
    public ListNode getIntersectionNode(ListNode one, ListNode two) {
        
        // Get the size of each linked list
        int oneSize = getLength(one);
        int twoSize = getLength(two);
        
        // Traverse the larger linked list by the difference
        if (twoSize > oneSize) {
            int hops = twoSize - oneSize;
            for (int i=0 ; i < hops ; i++) {
                two = two.next;
            }
        }
        
        // Same
        if (oneSize > twoSize) {
            int hops = oneSize - twoSize;
            for (int i=0 ; i < hops ; i++) {
                one = one.next;
            }
        }
        
        // Traverse concurrently and return whichever is the same
        while (one != null) {
            if (one == two)
                return one;
            one = one.next;
            two = two.next;
        }
        
        // Otherwise return null
        return null;
        
    }
}