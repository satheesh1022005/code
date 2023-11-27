class Solution {
    public int maxFrequency(int[] nums, int k) {
        int r=0,l=0,res=0;
        long tot=0,x;
        Arrays.sort(nums);
        while(r<nums.length){
            tot+=nums[r];
            x=nums[r];
            while(((r-l+1)*x-tot)>k){ 
                tot-=nums[l++];
                
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}