import java.util.HashMap;

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        /*int n=a.length,max=0;
        long sum;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                   // break;
                }
            }
        }
        return max;*/
        /*HashMap<Long,Integer> map=new HashMap<>();
        int len=0,max=0;
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                max=Math.max(max,i+1);
            }
            long rem=sum-k;
            if(map.containsKey(rem)){
                max=Math.max(max,i-map.get(rem));
            }
            map.put(sum,i);
        }
        return max;*/
        int i=0,j=0,max=0;
        long sum=0;
        while(j<a.length){
            sum+=a[j];
            while(i<j&&sum>k){
                sum-=a[i];
                i++;
            }
            if(sum==k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}