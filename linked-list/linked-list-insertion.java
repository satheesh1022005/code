class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node temp=head;
        if(head==null){
            return new Node(x);
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(x);
        return head;
    }
}