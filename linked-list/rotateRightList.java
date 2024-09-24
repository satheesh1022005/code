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
        ListNode prev=null,next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null) return null;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        k=k%len;
        int ini=len-k;
        temp=head;
        while(temp!=null){
            ini--;
            if(ini<=0) break;
            temp=temp.next;
        }
        ListNode next=temp.next;
        temp.next=null;
        ListNode h1=reverse(head);
        ListNode h2=reverse(next);
        head.next=h2;
        return reverse(h1);
    }
}