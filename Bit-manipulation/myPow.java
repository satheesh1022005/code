class Solution {
    public double myPow(double x, int n) {
        /*double ans=1;
        boolean nsign=n<0?true:false;
        int len=Math.abs(n);
        for(int i=0;i<Math.abs(n/2);i++) ans*=x;
        ans*=ans;
        if(len%2!=0) ans*=x;
        if(nsign) return 1/ans;
        return ans;*/
        double ans=1;
        int signref=n;
        if(n==Integer.MIN_VALUE){
            ans*=x;
            n++;
        }
        int absn=Math.abs(n);
        while(absn>0){
            if(absn%2==0){
                x=x*x;
                absn=absn/2;
            }
            else{
                absn--;
                ans*=x;
            }
        }
        if(signref<0) return 1/ans;
        return ans;
        
    }
}