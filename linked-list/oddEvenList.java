/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /*public ListNode change(ListNode tail,ListNode temp,ListNode prev){
        ListNode next=temp.next;
        prev.next=temp.next;
        temp.next=null;
        tail.next=temp;
        return next;
    }*/
    public ListNode oddEvenList(ListNode head) {
        /*if(head==null) return head;
        ListNode temp=head;
        int i=1,len=1;
        ListNode tail=head,prev=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(len==2) return head;
        while(i<=len&&temp!=null){
            if(i%2==0){
                temp=change(tail,temp,prev);
                tail=tail.next;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
            i++;
        }
        return head;*/
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode oddHead=temp;
        ListNode evenHead=temp.next;
        ListNode evenTail=evenHead;
        ListNode oddTail=oddHead;
        ListNode next=null;
        temp=temp.next.next;
        int i=1;
        evenHead.next=null;
        oddHead.next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=null;
            if(i%2==0){
                evenTail.next=temp;
                evenTail=temp;
            }
            else{
                oddTail.next=temp;
                oddTail=temp;
            }
            i++;
            temp=next;
        }
        oddTail.next=evenHead;
        return oddHead;

    }
}