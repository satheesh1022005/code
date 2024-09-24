class Solution {
    public int[] nse(int nums[]){
        int ans[]=new int[nums.length];
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=n;
            stack.push(i);
        }
        return ans;
    }
    public int[] psee(int nums[]){
        int ans[]=new int[nums.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=-1;
            stack.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int nse[]=nse(arr);
        int psee[]=psee(arr);
        int left,right,mod=(int)(Math.pow(10,9)+7);
        long sum=0;
        for(int i=0;i<n;i++){
            left=i-psee[i];
            right=nse[i]-i;
            sum+=(long) (left) * (right) % mod * arr[i] % mod;
            sum%=mod;
        }
        return (int)sum;
    }
}