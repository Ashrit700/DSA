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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        ListNode headl1=l1;
        ListNode headl2=l2;
        int remainder=0;
        while(headl1!=null||headl2!=null){
            int count=0;
            if(headl1!=null){
            count=headl1.val;
                headl1=headl1.next;;
            }
            if(headl2!=null){
               count=count+headl2.val; 
                headl2=headl2.next;
            }
            count=count+remainder;
            remainder=count/10;
            int value=count%10;
            ListNode n=new ListNode(value);
            temp.next=n;
            temp=n;
           

            
        }
        if(remainder!=0){
             ListNode n=new ListNode(remainder);
            temp.next=n;
            temp=n;
           

        }
        return dummy.next;
        
    }
}