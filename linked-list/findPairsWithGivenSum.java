

/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Node left=head;
        Node right=head;
        while(right.next!=null){
            right=right.next;
        }
        int sum=0;
        while(left.data<right.data){
            sum=left.data+right.data;
            if(sum<target){
                left=left.next;
            }
            else if(sum>target){
                right=right.prev;
            }
            else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(left.data);
                al.add(right.data);
                ans.add(al);
                left=left.next;
                right=right.prev;
            }
        }
        return ans;
    }
}
        