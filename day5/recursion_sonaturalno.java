public class Solution {
    public static long sum = 0;
    public static long sumFirstN(long n) {

        if(n<1){
            return sum;
        }
        sum += n;
        return sumFirstN(n-1);
        //return (n*(n+1))/2;
    }

}