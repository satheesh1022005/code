public class Solution {
    public static int upperBound(int []arr, int x, int n){
        int l=0,h=n-1,m;
        int ans=n;
        while(l<=h){
            m=(l+h)/2;
            if(arr[m]>x){
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
