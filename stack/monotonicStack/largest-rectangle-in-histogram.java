class Solution {
    public int[] nse(int nums[]){
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek()-1;
            }
            else{
                ans[i]=n-1;
            }
            stack.push(i);
        }
        return ans;
    }
    public int[] pse(int nums[]){
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek()+1;
            }
            else{
                ans[i]=0;
            }
            stack.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int nse[]=nse(heights);
        int pse[]=pse(heights);
        int max=0,n=heights.length,len,min;
        for(int i=0;i<n;i++){
            len=nse[i]-pse[i]+1;
            max=Math.max(max,(len*heights[i]));
        }
        return max;
    }
}