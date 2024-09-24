

/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        int j=0;
        Node temp=head;
        Node prev=head;
        Node start=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                j=1;
                start=slow;
                temp=start.next;
                while(temp!=null&&temp!=start){
                    j++;
                    temp=temp.next;
                }
                //System.out.println(i+","+j);
                return j;
            }
        }
        return 0;
        
        
    }
}