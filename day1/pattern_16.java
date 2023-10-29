public class Solution {
    public static void alphaRamp(int n) {
        for(char c='A';c<'A'+n;c++){
            for(char ch='A';ch<=c;ch++){
                System.out.print(c+" ");
            }
            System.out.println();

        }
    }
}