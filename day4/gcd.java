public class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static int calcGCD(int n, int m){
        int x=gcd(n,m);
        return x;
    }
}