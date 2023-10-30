public class Solution {
    public static void symmetry(int n) {
        int a,b;
        for(int i=0;i<(n*2-1);i++){
            a=i+1;
            if(i>=n){
                a=((2*n)-i-1);
            }
            b=(2*n)-(a*2);
            for(int j=0;j<a;j++){
                System.out.print("* ");
            }
            for(int k=0;k<b;k++){
                System.out.print("  ");
            }
            for(int m=0;m<a;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}