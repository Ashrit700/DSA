import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class imple{
    public static void Remove(int k,Node temp){
        Node res=temp;
        int i=1;
        while(i<k-1&&res.next!=null){
            res=res.next;
            i++;
        }
        if(res.next==null){
            System.out.print("Last node reached");
            return;
        }
        res.next = res.next.next;
        
    }
    public static void main(String args[]){
        Node head=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp=head;
        Remove(2,temp);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}