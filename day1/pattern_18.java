public class Solution {
    public static void alphaTriangle(int n) {
        char ch;
        for(int i=0;i<n;i++){
            ch=(char)((n-1)+'A');
        for(int j=0;j<=i;j++){
            System.out.print(ch+" ");
            ch--;

        }
        System.out.println();
        }
    }
}