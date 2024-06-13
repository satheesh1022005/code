class Solution {
    public static boolean check(int stalls[],int d,int k){
        int prev=0;
        for(int i=1;i<stalls.length;i++){
            int dis=stalls[i]-stalls[prev];
            if(dis>=d){
                k--;
                prev=i;
            }
        }
        k--;
        return k<=0;
    } 
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int max=0,min=Integer.MAX_VALUE;
        for(int i:stalls){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int l=1,h=max-min,mid,ans=0;
        while(l<=h){
            mid=(l+h)/2;
            if(check(stalls,mid,k)){
                l=mid+1;
                ans=mid;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
        
    }
}