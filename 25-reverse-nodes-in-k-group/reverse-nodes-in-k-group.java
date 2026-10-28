class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        
        while (temp != null) {
            // Step 1: Find the k-th node
            ListNode kNode = find(k, temp);
            
            // Step 2: Handle the leftovers
            // If kNode is null, we have fewer than k nodes left. Don't reverse them.
            if (kNode == null) {
                // Attach the un-reversed leftovers to the end of our finished list
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break; // Exit the loop completely!
            }
            
            // Step 3: Sever the chunk
            ListNode kNext = kNode.next; // Save the rest of the list
            kNode.next = null;           // Break the link
            
            // Step 4: Reverse the isolated chunk
            reverse(temp);
            
            // Step 5: Re-attach the chunk
            if (temp == head) {
                // If this was the very first group, update the global head
                head = kNode;
            } else {
                // Otherwise, connect the previous group to this new reversed group
                prevLast.next = kNode;
            }
            
            // Step 6: Move pointers forward for the next iteration
            // After reversing, 'temp' is now the LAST node in this group
            prevLast = temp; 
            temp = kNext; 
        }
        
        return head;
    }
    
    // Helper Method: Find the K-th node starting from 'temp'
    private ListNode find(int k, ListNode temp) {
        // We start at 1 because 'temp' itself is the 1st node
        int count = 1; 
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        return temp;
    }
    
    // Helper Method: The exact reversal logic you already mastered!
    private void reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null) {
            ListNode curr = temp;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
        }
    }
}