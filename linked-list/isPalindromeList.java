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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prevh=head;
        while(fast!=null&&fast.next!=null){
            prevh=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode current=slow,next=null,prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        prevh.next=prev;
        ListNode t1=head,t2=prev;
        while(t1!=prev&&t2!=null){
            if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;
        //slow==middle;

    }
}