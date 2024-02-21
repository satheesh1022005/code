class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int len=1,cnt=0,lastsmall=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastsmall){
                cnt++;
                lastsmall=nums[i];
            }
            if(nums[i]!=lastsmall){
                cnt=1;
                lastsmall=nums[i];
            }
            len=Math.max(cnt,len);
        }
        return len;
    }
}