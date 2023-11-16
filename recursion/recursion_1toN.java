import java.util.ArrayList;

public class Solution {
    public static int[] printNos(int x) {
        int a[]=new int[x];
        
        rec(x,a);
        return a;
    }
    public static void rec(int n,int a[]){
        if(n>1){
            rec(n-1,a);
        }
        a[n-1]=n;

    }
}   