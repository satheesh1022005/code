class Pair{
    int num,index;
    Pair(int a,int b){
        num=a;
        index=b;
    }
}
class StockSpanner {
    int index;
    Stack<Pair> stack;
    public StockSpanner() {
        index=-1;
        stack=new Stack<>();
    }
    public int next(int price) {
        index+=1;
        int ans=1;
        while(!stack.isEmpty()&&stack.peek().num<=price){
            stack.pop();
        }
        if(!stack.isEmpty()) ans=index-stack.peek().index;
        else ans=index+1;
        stack.push(new Pair(price,index));
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */