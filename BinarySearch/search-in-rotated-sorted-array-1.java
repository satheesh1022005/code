class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,h=nums.length-1,m;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target) return true;
            if(nums[m]==nums[l] && nums[m]==nums[h]) {
                l++;
                h--;
                continue;
            }
            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && target<=nums[m]) h=m-1;
                else l=m+1;
            }
            else{
                if(nums[m]<=target && target<=nums[h]) l=m+1;
                else h=m-1;
            }
        }
        return false;
    }
}