class Solution {
    public int check(int weights[],int cap){
        int days = 1;
        int load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; 
                load = weights[i]; 
            } else {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days){
        int h=0,l=Integer.MIN_VALUE,mid,ans=-1,d;
        for(int i:weights){
                h+=i;
                l=Math.max(l,i);
        }
        while(l<=h){
            mid=(l+h)/2;
            d=check(weights,mid);
            if(d<=days){
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