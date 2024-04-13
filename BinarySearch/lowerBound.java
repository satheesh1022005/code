public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int l=0,h=n-1,m;
        int ans=n;
        while(l<=h){
            m=(l+h)/2;
            if(arr[m]>=x){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}