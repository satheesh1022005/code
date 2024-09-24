class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int bound(int n){
        int l=0,h=n,m,val;
        while(l<=h){
            m=(l+h)/2;
            val=(int)Math.pow(2,m);
            if(val<=n){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return h;
    }
    public static int countSetBits(int n){
        int cnt=0,index,power;
        while(n>1){
            index=bound(n);
            power=(int)(Math.pow(2,index-1));
            cnt+=index*power;
            cnt+=n-(int)(Math.pow(2,index))+1;
            n=n-(int)(Math.pow(2,index));
        }
        return cnt+n;
    }
}