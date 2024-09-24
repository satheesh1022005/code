/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    /*public int find(Node head,Node x){
        int i=0;
        while(head!=null){
            if(head==x) return i;
            i++;
            head=head.next;
        }
        return i;
    }
    public Node nodeFind(Node head,int index){
        int i=0;
        while(head!=null){
            if(i==index) return head;
            i++;
            head=head.next;
        }
        return null;
    }*/
    public Node copyRandomList(Node head) {
        /*Node newHead=new Node(-1);
        Node temp=head,tail=newHead;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            tail.next=newNode;
            tail=newNode;
            temp=temp.next;
        }
        temp=head;
        Node temp2=newHead.next,x;
        int index;
        int i=0;
        while(temp!=null){
            if(temp.random!=null){
                x=temp.random;
                index=find(head,x);
                //System.out.println(index+"=>"+x.val);
                temp2.random=nodeFind(newHead.next,index);
                //System.out.println(temp2.random.val);
            }
            temp=temp.next;
            temp2=temp2.next;
            i++;
        }
        return newHead.next;*/
        /*HashMap<Node,Node> map=new HashMap<>();
        Node temp=head;
        Node newHead=new Node(-1);
        Node tail=newHead;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.random=temp.random;
            tail.next=newNode;
            tail=newNode;
            map.put(temp,newNode);
            temp=temp.next;
        }
        temp=newHead.next;
        while(temp!=null){
            if(temp.random!=null){
                temp.random=map.get(temp.random);
            }
            temp=temp.next;
        }
        return newHead.next;*/
        /*optimal*/
        Node temp=head,next;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            next=temp.next;
            newNode.next=next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node newHead=new Node(-1);
        Node tail=newHead;
        temp=head;
        while(temp!=null){
            tail.next=temp.next;
            tail=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return newHead.next;

    }
}