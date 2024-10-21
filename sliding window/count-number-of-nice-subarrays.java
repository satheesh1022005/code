class Solution {
    public int lessThanEqualK(int nums[],int k){
        if(k<0) return 0;
        int cnt=0,sum=0,l=0,r=0,n=nums.length;
        while(r<n){
            if(nums[r]%2!=0){
                sum+=1;
            }
            while(l<n&&sum>k){
                if(nums[l]%2!=0) sum-=1;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return lessThanEqualK(nums,k)-lessThanEqualK(nums,k-1);
    }
}