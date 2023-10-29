public class Solution {
    public static void nNumberTriangle(int n) {
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                System.out.print(c+" ");
            c++;
            }
            System.out.println();
        }
    }
}