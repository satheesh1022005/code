class Solution {
    public int[] nextGreaterElements(int[] nums) {
        /*Stack<Integer> stack=new Stack<>();
        int ans[]=new int[nums.length];
        int max=-1,flag=0;
        /*for(int i=0;i<nums.length;i++){
            max=-1;
            flag=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    max=nums[j];
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                        max=nums[k];
                        break;
                    }
                }
            }
            ans[i]=max;
        }
        return ans;
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek();
            }else{
                max=-1;
                for(int k=0;k<i;k++){
                    if(nums[k]>nums[i]){
                        max=nums[k];
                        break;
                    }
                }
                ans[i]=max;
            }  
            stack.push(nums[i]);
        }
        return ans;*/
        Stack<Integer> stack=new Stack<>();
        int n=nums.length,index;
        int ans[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            index=i%n;
            while(!stack.isEmpty()&&stack.peek()<=nums[index]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[index]=stack.peek();
            }
            else{
                ans[index]=-1;
            }
            stack.push(nums[index]);
        }
        return ans;
    }
}