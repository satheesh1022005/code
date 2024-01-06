import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []a, int k) {
		HashMap<Long,Integer> map=new HashMap<>();
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
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
	}
}