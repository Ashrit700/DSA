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
    public void reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            
            ListNode curr=temp;

            temp=curr.next;
            curr.next=prev;
            prev=curr;
            

        }
    }
    public ListNode find(int k,ListNode head){
        ListNode temp=head;
        int count=0;
        while(count<=k&&temp!=null){
            temp=temp.next;
            count++;

        }
        if(count==k){
            return temp;
        }
        else{
            return null;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode kNode=null;
        ListNode prevLast=null;
        

        
        while(temp!=null){
            kNode=find(k,temp);
            if(kNode==null){
                prevNode.

            }
            ListNode kNext=kNode.next;
            kNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kNode;

            }
            else{
                prevLast.next=kNode;
            }
            prevLast=temp;
            temp=nextNode;



            
            
        }
        return head;
        
    }
}