

// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        Node zeroTail=zeroHead;
        Node oneTail=oneHead;
        Node twoTail=twoHead;
        Node temp=head,next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=null;
            if(temp.data==0){
                zeroTail.next=temp;
                zeroTail=temp;
            }
            else if(temp.data==1){
                oneTail.next=temp;
                oneTail=temp;
            }
            else{
                twoTail.next=temp;
                twoTail=temp;
            }
            temp=next;
        }
        zeroTail.next=oneHead.next!=null?oneHead.next:twoHead.next;
        oneTail.next=twoHead.next;
        return zeroHead.next;
    }
}