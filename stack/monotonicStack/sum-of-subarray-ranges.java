class Solution {
    public int[] psee(int nums[]){
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            else{
                ans[i]=-1;
            }
            stack.push(i);
        }
        return ans;
    }
    public int[] nse(int nums[]){
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            else{
                ans[i]=n;
            }
            stack.push(i);
        }
        return ans;
    }
    public int[] maxNge(int nums[]){
        int n=nums.length;
        int ans[]=new int [n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=n;
            stack.push(i);
        }
        return ans;
    }

    public int[] maxPgee(int nums[]){
        int n=nums.length;
        int ans[]=new int [n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]=stack.peek();
            else ans[i]=-1;
            stack.push(i);
        }
        return ans;
    }
    public long maxSum(int nums[]){
        long sum=0;
        int psee[]=maxPgee(nums);
        int nse[]=maxNge(nums);
        int left,right;
        for(int i=0;i<nums.length;i++){
            left=i-psee[i];
            right=nse[i]-i;
            sum+=(long) (left) * (right) * nums[i];
        }
        return sum;
    }
    public long minSum(int nums[]){
        long sum=0;
        int psee[]=psee(nums);
        int nse[]=nse(nums);
        int left,right;
        for(int i=0;i<nums.length;i++){
            left=i-psee[i];
            right=nse[i]-i;
            sum+=(long) (left) * (right) * nums[i];
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return maxSum(nums)-minSum(nums);
    }
}
/*long sum=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=nums[i];
            max=nums[i];
            for(int j=i+1;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                sum+=(max-min);
            }
        }
    return sum;*/