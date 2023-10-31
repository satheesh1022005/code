public class Solution {
    public static int countDigits(int n){
        int t=n,a,c=0;
        while(t!=0){
            a=t%10;
            if(a!=0&&n%a==0){
                c++;
            }
            t/=10;
        }
        return c;

    }
}