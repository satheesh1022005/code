import java.util.*;
public class Solution {
    public static void nLetterTriangle(String args[]) {
		Scanner scan=new Scanner(System.in)
       int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(char c='A';c<='A'+i;c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}