class Solution {
    int i=0;
    public int fib(int n) {
        /*int c=rec(n,0,1);
        return c;*/
        if(n==1||n==2) return 1;
        return fib(n-1)+fib(n-2);


    }
    /*int rec(int n,int a,int b){
        if(n==0){
            return a;
        }
        return rec(n-1,b,a+b);
        
       
    }*/
}