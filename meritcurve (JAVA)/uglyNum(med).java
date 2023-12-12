class Solution {
    public boolean isUgly(int n){
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        return n==1;
    }
    public int nthUglyNumber(int n) {
        /*if(n==1) return 1;
        int i=2,li=1;

        while(i>=li){
            if(isUgly(i)){
                li++;
                //System.out.println(i);
            }
            if(li==n){
                return i;
            }
            i++;
        }
        return i;*/
        if(n==1) return 1;
        int dp[]=new int[n];
        dp[0]=1;
        int x=0,y=0,z=0;
        for(int i=1;i<n;i++){
            dp[i]=Math.min(dp[x]*2,Math.min(dp[y]*3,dp[z]*5));
            if(dp[i]==dp[x]*2) x++;
            if(dp[i]==dp[y]*3) y++;
            if(dp[i]==dp[z]*5) z++;
        }
        return dp[n-1];
    }
}