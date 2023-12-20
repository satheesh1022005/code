class Solution {
    public void reverse(int nums[],int i,int j){
        
        while(i<j){
            nums[i]=nums[i]+nums[j];
            nums[j]=nums[i]-nums[j];
            nums[i]=nums[i]-nums[j];
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(nums.length<k) k=k%nums.length;
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-k-1);
            reverse(nums,0,nums.length-1);
    
    }
}