class Solution {
    public int divide(int dividend, int divisor) {
      if(dividend==divisor) return 1;
      if(dividend==(1<<31)&&divisor==-1) return (1<<31)-1;
      boolean sign=true;
      if(dividend<0&&divisor>0) sign=false;
      else if(dividend>0&&divisor<0) sign=false;
      long n=Math.abs((long)dividend);
      long m=Math.abs((long)divisor);
      int cnt=0,sum=0;
      while(n>=m){
        cnt=0;
        while(n>=(m<<cnt+1)){
            cnt++;
        }
        sum+=(1<<cnt);
        n=n-(m<<cnt);
      }
      return sign?sum:-sum;
    }
}