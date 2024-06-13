class Solution {
    public int check(int nums[],int li){
        int allocated=1,curr=0;
        for(int i:nums){
            if(curr+i<=li){
                curr+=i;
            }
            else{
                allocated++;
                curr=i;
            }
        }
        return allocated;
    }
    public int splitArray(int[] nums, int k) {
        int max=0,sum=0;
        for(int i:nums){
            max=Math.max(max,i);
            sum+=i;
        }
        int l=max,h=sum,mid,al;
        while(l<=h){
            mid=(l+h)/2;
            al=check(nums,mid);
            if(al<=k){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }   
}