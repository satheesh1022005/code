class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		Node temp=head_ref;
		int i=0;
		while(temp!=null){
		    if(i==pos){
		        break;
		    }
		    i++;
		    temp=temp.next;
		}
		Node target=temp;
		Node newNode=new Node(data);
		if(target.next==null){
		    target.next=newNode;
		    newNode.prev=target;
		}
		else{
		    newNode.prev=target;
		    newNode.next=target.next;
		    target.next.prev=newNode;
		    target.next=newNode;
		}
	}
}