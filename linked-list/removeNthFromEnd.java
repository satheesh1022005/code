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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*int len=0;
        ListNode temp=head,prev=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int index=len-n,i=0;
        temp=head;
        if(index==0){
            head=head.next;
        }
        else{
            while(temp!=null&&i!=index){
                prev=temp;
                temp=temp.next;
                i++;
            }
            prev.next=temp.next;
        } //Time complexity:O(2len);
        return head;*/
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++) fast=fast.next;
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}