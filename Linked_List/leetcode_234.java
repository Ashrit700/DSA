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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode temp=null;
        ListNode curr=slow;
        while(curr!=null){
        ListNode ll=curr.next;
            curr.next=temp;
            temp=curr;
            curr=ll;
        }

        while(temp!=null){
            if(temp.val!=head.val){
                return false;
               
            }
            temp=temp.next;
            head=head.next;
        }
        return true;

       


        
    }
}