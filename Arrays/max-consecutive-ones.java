class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0,c=1,x=0;
        for(int i=0;i<nums.length;i++){
           x+=nums[i];
           x*=nums[i];
            ans=Math.max(ans,x);
        }
        return ans;
    }
}