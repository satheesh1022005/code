/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*HashSet<ListNode> set=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;*/
        /*int len1=0,len2=0;
        ListNode temp=headA;
        while(temp!=null){
            len1++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            len2++;
            temp=temp.next;
        }
        ListNode t1=headA;
        ListNode t2=headB;
        int move=len1-len2;
        if(move>=0){
            for(int i=0;i<move;i++){
                t1=t1.next;
            }
        }else{
            move*=-1;
            for(int i=0;i<move;i++){
                t2=t2.next;
            }
        }
        while(t1!=null&&t2!=null){
            if(t1==t2){
                return t1;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return null;*/
        ListNode t1=headA;
        ListNode t2=headB;
        if(headA==null||headB==null) return null;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2) return t1;
            if(t1==null) t1=headB;
            if(t2==null) t2=headA;
        }
        return t1;
    }
}