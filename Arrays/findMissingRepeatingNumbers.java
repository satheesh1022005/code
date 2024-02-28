public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        int n=a.length;
        int ans[]=new int[2];
        int map[]=new int[n];
        for(int i=0;i<n;i++){
            map[a[i]-1]+=1;
        }
        for(int i=0;i<n;i++){
            if(map[i]==2){
                ans[0]=i+1;
            }
            if(map[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}