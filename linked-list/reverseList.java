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
    /*public ListNode reverseListRecursion(ListNode current,ListNode prev){
        if(current==null){
            return prev;
        }
        ListNode next=current.next;
        current.next=prev;
        return reverseListRecursion(next,current);
        
    }*/
    public ListNode reverseList(ListNode head) {
        /*ListNode prev=null;
        ListNode next=head;
        ListNode current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;**/
        //return reverseListRecursion(head,null);
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}