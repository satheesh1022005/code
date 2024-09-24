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
    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null,next=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead=new ListNode(-1);
        ListNode newTail=newHead;
        ListNode temp=head;
        ListNode nextHead=head,next,current=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            next=temp.next;
            if(cnt==k){
                temp.next=null;
                cnt=0;
                newTail.next=reverse(current);
                newTail=current;
                current=next;
            }
            temp=next;
        }
        newTail.next=current;
        return newHead.next;
    }
}