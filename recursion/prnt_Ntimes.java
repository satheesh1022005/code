import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        if(n<=0){
            return ;
        }
        System.out.print("Coding Ninjas ");
        printNtimes(n-1);
    }
}