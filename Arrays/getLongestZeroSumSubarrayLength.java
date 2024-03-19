import java.util.*;
public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int sum=0;
        int maxLen=0,start=0,n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxLen=Math.max(maxLen,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxLen;
    }
}