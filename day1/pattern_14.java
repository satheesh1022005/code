public class Solution {
    public static void nLetterTriangle(int n) {
       
        for(int i=0;i<n;i++){
            for(char c='A';c<='A'+i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}