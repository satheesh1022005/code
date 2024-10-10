class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=k,l=0,h=0,max=0,n=nums.length;
        while(l<n&&h<n){
            sum+=nums[h];
            while(sum<(h-l+1)){
                sum-=nums[l];
                l++;
            }
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;
    }
}