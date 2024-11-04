class Solution {
    public int subArraysLessThanEqualK(int nums[],int k){
        if(k<=0) return 0;
        int l=0,r=0,n=nums.length,cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArraysLessThanEqualK(nums,k)-subArraysLessThanEqualK(nums,k-1);
    }
}