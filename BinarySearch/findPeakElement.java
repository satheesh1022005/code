class Solution {
    public int findPeakElement(int[] nums) {
        // int n=nums.length,ans=0;
        // if(n==1) return 0;
        // if(nums[0]>nums[1]) return 0;
        // if(nums[n-1]>nums[n-2]) return n-1;
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
        //         return i;
        //     }
        // } 
        // return -1;      
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        int l=1,h=nums.length-2,m;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]>nums[m-1] && nums[m]>nums[m+1]){
                return m;
            }
            else if(nums[m]>nums[m-1]){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return -1;
    }
}