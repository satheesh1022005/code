class Solution {
    public boolean check(int nums[],int m,int k,int d){
        int cnt=0;
        for(int i:nums){
            if(i<=d){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt>=k){
                cnt=0;
                m-=1;
            }
           // System.out.println(cnt+"=>"+i+"=>"+m);
        }
        return m<=0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max=0;
        for(int i:bloomDay){
            if(i>max){
                max=i;
            }
        }
        int l=1,h=max,mid,ans=-1;
        while(l<=h){
            mid=(l+h)/2;
            if(check(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}