class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Base case: if the list is empty or has only 1 node, just return it
        if (head == null || head.next == null) {
            return head;
        }
        
        // Setup your 3 essential pointers
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Remember this to attach at the end
        
        // Single loop to update both! 
        // We check 'even' and 'even.next' because even is always ahead of odd.
        // If even is safe, odd is safe.
        while (even != null && even.next != null) {
            // Point the current odd node to the NEXT odd node
            odd.next = odd.next.next;
            // Move the odd pointer forward
            odd = odd.next;
            
            // Point the current even node to the NEXT even node
            even.next = even.next.next;
            // Move the even pointer forward
            even = even.next;
        }
        
        // Attach the start of the even list to the end of the odd list
        odd.next = evenHead;
        
        return head;
    }
}