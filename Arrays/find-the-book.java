import java.util.Arrays;
public class Solution {
    public static String read(int n, int []book, int target){
        Arrays.sort(book);
        int i=0,j=book.length-1;
        long sum=0;
        while(i<j){
            sum=book[i]+book[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                return "YES";
            }
        }
        return "NO";
        
    }
}