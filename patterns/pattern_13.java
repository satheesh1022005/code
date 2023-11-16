public class pattern_13 {
    public static void main(String args[]) {
        int n=10;
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