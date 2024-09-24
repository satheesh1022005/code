class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int num;
        for(int i:asteroids){
            if(i>=0){
                stack.push(i);
            }
            else{
                num=i*-1;
                while(!stack.isEmpty()&&stack.peek()<num&&stack.peek()>0){
                    stack.pop();
                }
                if(stack.isEmpty()||stack.peek()<0){ 
                   stack.push(-num);
                }
                else if(stack.peek()==num){
                    stack.pop();
                }
            }
        }
        int ans[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.peek();
            stack.pop();
        }
        return ans;
    }
}