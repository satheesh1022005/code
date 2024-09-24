



// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        while(head!=null&&head.data==x) head=head.next;
        if(head==null) return null;
        head.prev=null;
        Node temp=head.next,next;
        while(temp!=null){
            if(temp.data==x){
                temp.prev.next=temp.next;
                if(temp.next!=null)
                    temp.next.prev=temp.prev;
                next=temp.next;
                temp.next=null;
                temp.prev=null;
                temp=next;
            }
            else
                temp=temp.next;
        }
        return head;
    }
}