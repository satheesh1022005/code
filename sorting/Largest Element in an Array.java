import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int max=0;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;

    }
}