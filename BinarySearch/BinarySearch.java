class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int m,index=-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]>target){
                h=m-1;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                index=m;
                break;
            }
        }
        return index;
    }
}