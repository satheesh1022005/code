public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        int map[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<=n)
            map[nums[i]-1]++;
        }
        return map;
    }
}