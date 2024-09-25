class Solution {
    public int[] nse(int nums[]){
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
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
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];
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
    public int LongestHistogram(int nums[]){
        int nse[]=nse(nums);
        int pse[]=pse(nums);
        int max=0,len;
        for(int i=0;i<nums.length;i++){
            len=nse[i]-pse[i]+1;
            max=Math.max(max,len*nums[i]);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int preSum[][]=new int[n][m];
        int sum=0,max=0;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=(matrix[j][i]-'0');
                if(matrix[j][i]=='0') sum=0;
                preSum[j][i]=sum;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(preSum[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,LongestHistogram(preSum[i]));
            System.out.println(max+"=>"+i);
        }
        return  max;
    }
}