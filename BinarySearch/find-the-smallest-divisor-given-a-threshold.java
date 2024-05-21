class Solution {
    public int sum(int nums[],int i){
        int sum=0;            
        for(int j=0;j<nums.length;j++){
            sum+=Math.ceil(((double)nums[j]/(double)i));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int sum=0,l=1,h=max,m,ans=Integer.MAX_VALUE;
        while(l<=h){
            m=(l+h)/2;
            sum=sum(nums,m);
            if(sum<=threshold){
                h=m-1;
                ans=h+1;
            }
            else{
                l=m+1;
            }
        }
       return ans;
    }
}