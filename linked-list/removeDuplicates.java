

//User function Template for Java

class Solution{
    Node removeDuplicates(Node head){
       if(head==null) return null;
       Node temp=head;
       while(temp!=null){
           Node next=temp.next;
           while(next!=null&&next.data==temp.data){
               next=next.next;
           }
           temp.next=next;
           if(next!=null)
            next.prev=temp;
           temp=next;
       }
       return head;
        
    }
}