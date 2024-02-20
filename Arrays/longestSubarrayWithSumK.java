import java.util.HashMap;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // HashMap<Long,Integer> map=new HashMap<>();
        // int len=0;
        // long temp,sum=0;
        // for(int i=0;i<a.length;i++){
        //     sum+=a[i];
        //     temp=sum-k;
        //     if(temp==0){
        //         len=Math.max(len,i+1);
        //     }
        //     if(map.containsKey(temp)){
        //         len=Math.max(len,i-map.get(temp));
        //     }
        //     map.put(sum,i);            
        // }
        // return len;
        int i=0,j=0,max=0;
        long sum=0;
        while(j<a.length){
            sum+=a[j];
            while(sum>k){
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