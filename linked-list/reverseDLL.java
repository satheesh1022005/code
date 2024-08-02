public static Node reverseDLL(Node  head)
{
    Node tail=head;
    Node last=head;
    Node temp=null;
    while(tail!=null){
        last=tail;
        temp=tail.next;
        tail.next=tail.prev;
        tail.prev=temp;
        tail=tail.prev;
    }
    return last;
}