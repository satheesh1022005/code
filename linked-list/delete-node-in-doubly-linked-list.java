class Solution {
    public Node deleteNode(Node head, int x) {
        int i=1;
        Node temp=head;
        while(temp!=null){
            if(i==x)break;
            temp=temp.next;
            i++;
        }
        if(temp.prev==null){
            head=temp.next;
        }
        else if(temp.next==null){
            temp.prev.next=null;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        return head;
    }
}