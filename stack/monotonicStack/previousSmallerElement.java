public class Solution {
    public int[] prevSmaller(int[] A) {
        int n=A.length;
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&stack.peek()>=A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=-1;
            stack.push(A[i]);
        }
        return ans;
    }
}
