class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=1,h=nums.length-2,n=nums.length,m;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]!=nums[m-1]&&nums[m]!=nums[m+1]){
                return nums[m];
            }
            else if(m%2==0){
                if(nums[m+1]==nums[m]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
            else{
                if(nums[m+1]==nums[m]){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }
        }
        return -1;
    }
}