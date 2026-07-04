/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode node1,ListNode node2){
       ListNode dummy = new ListNode(0); // Temporary node to build the new list
        ListNode tail = dummy;
        
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                tail.next = node1;
                node1 = node1.next;
            } else {
                tail.next = node2;
                node2 = node2.next;
            }
            tail = tail.next;
        }
        
        // Attach whatever is left over
        if (node1 != null) {
            tail.next = node1;
        } else {
            tail.next = node2;
        }
        
        return dummy.next;
    }
    public ListNode findmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
       if(head==null||head.next==null){
        return head;
       }
       ListNode middle=findmiddle(head);
       ListNode lefthead=head;
       ListNode righthead=middle.next;
       middle.next=null;
       lefthead=sortList(lefthead);
       righthead=sortList(righthead);
       return merge(lefthead,righthead);

        
    }
    
}