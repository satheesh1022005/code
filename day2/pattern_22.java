import java.lang.*;
public class Solution {
    public static void getNumberPattern(int n) {
        int top,left,right,bottom,m;
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                top=i;
                left=j;
                right=(2*n-2)-j;
                bottom=(2*n-2)-i;
                m=Math.min((Math.min(top,left)),(Math.min(right,bottom)));
                System.out.print(n-m);
            }
            System.out.println();
        }
    }
}