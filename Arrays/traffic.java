public class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        int i=0,j=0,max=0,x,count=0;
        while(j<n){
            if(vehicle[j]==0){
                count++;
            }
            while(count>m){
                if(vehicle[i]==0){
                    count--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
            
        }
        return max;
    }
}