// User function Template for Java

class Solution {
    // Function to flatten a linked list
    Node mergeTwosorted(Node l1,Node l2){
        Node head=new Node(-1);
        Node tail=head;
        while(l1!=null&&l2!=null){
            if(l1.data<l2.data){
                tail.bottom=l1;
                tail=l1;
                l1=l1.bottom;
            }
            else{
                tail.bottom=l2;
                tail=l2;
                l2=l2.bottom;
            }
        }
        while(l1!=null){
            tail.bottom=l1;
            tail=l1;
            l1=l1.bottom;
        }
        while(l2!=null){
            tail.bottom=l2;
            tail=l2;
            l2=l2.bottom;
        }
        /*Node t=head;
       
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }*/
        return head.bottom;
    }
    Node flatten(Node root) {
         //System.out.println("*");
        if(root==null) return null;
        Node head=null;
        Node tail=head;
        Node temp=root,next;
        while(temp!=null){
            next=temp.next;
            temp.next=null;
            //System.out.println(temp.data+"*");
            head=mergeTwosorted(head,temp);
            temp=next;
        }
        return head;
    }
}