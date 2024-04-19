class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,m,ans=Integer.MAX_VALUE,x;
        while(l<=h){
            m=(l+h)/2;
            if(nums[l]<=nums[m]){
                x=nums[l];
                l=m+1;
            }else{
                x=nums[m];
                h=m-1;
            }
            ans=Math.min(ans,x);
        }
        return ans;
    }
}