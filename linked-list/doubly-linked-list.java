

// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        Node head=new Node(arr[0]);
        head.prev=null;
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=temp.next;
        }
        return head;
    }
}