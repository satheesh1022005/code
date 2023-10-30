public class Solution {
    public static void symmetry(int n) {
        int a,b;
        for(int i=0;i<n*2;i++){
            if(i<n){
            a=n-i;
            b=i*2;
            }
            else{
                a=i-n+1;
                b=(2*n)-(a+a);
            }
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