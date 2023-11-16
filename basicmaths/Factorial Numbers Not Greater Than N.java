import java.util.ArrayList;
import java.util.List;
public class Solution {
    static ArrayList<Long> a=new ArrayList<Long>();
    public static List<Long> factorialNumbers(long n) {
        rec(n,1);
        return a;
    }
    public static void rec(long n,long i){
        if(fact(i)>n){
            return ;
        }
        a.add(fact(i));
        rec(n,i+1);
    }
    public static long fact(long n){
        if(n==1) return 1;
        return n*fact(n-1);
        }
}