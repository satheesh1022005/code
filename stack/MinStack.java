class pair{
    int num,min;
    pair(int num,int min){
        this.num=num;
        this.min=min;
    }
}
class MinStack {
    /*Stack<pair> stack=new Stack<pair>();
    int min;
    public MinStack() {
        min=Integer.MAX_VALUE;
    }
    public void push(int val) {
        if(stack.isEmpty()) stack.push(new pair(val,val));
        else stack.push(new pair(val,Math.min(val,stack.peek().min)));
    }
    public void pop() {
        //if(stack.isEmpty()) return -1;
        stack.pop();
    }
    public int top() {
        return stack.peek().num;
    }
    public int getMin() {
       return stack.peek().min;
    }*/
    Stack<Integer> stack=new Stack<>();
    int min;
    public MinStack() {
        min=Integer.MAX_VALUE;
    }
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            min=val;
        }
        else{
            if(min>val){
                stack.push(2*val-min);
                min=val;
            }
            else{
                stack.push(val);

            }
        }
    }
    public void pop() {
        int val=stack.pop();
        //converting the modified value to actual value
        /*if(val<min){
            return 2*min-val
        }*/
        min=2*min-val;
    }
    public int top() {
        if(stack.peek()<min) return min;
        else return stack.peek();
    }
    public int getMin() {
       return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */