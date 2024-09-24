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
    public ListNode mergeSort(ListNode temp1,ListNode temp2){
        ListNode head=new ListNode(-1);
        ListNode tail=head;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                tail.next=temp1;
                tail=temp1;
                temp1=temp1.next;
            }
            else{
                tail.next=temp2;
                tail=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null) tail.next=temp1;
        else tail.next=temp2;
        return head.next;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        /*ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(al);
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=al.get(i);
            i++;
            temp=temp.next;
        }
        return head;*/
        if(head==null || head.next==null){
            return head;
        }
        ListNode middleNode=middle(head);
        ListNode left=head;
        ListNode right=middleNode.next;
        middleNode.next=null;
        left=sortList(left);
        right=sortList(right);
        return mergeSort(left,right);
    }
}