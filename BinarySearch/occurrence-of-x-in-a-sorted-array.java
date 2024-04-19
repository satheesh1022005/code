public class Solution {
    public static int count(int arr[], int n, int x) {
        int l=0,h=n-1,m,lb=n,ub=n;
        while(l<=h){
            m=(l+h)/2;
            if(arr[m]>=x){
                lb=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        l=0;
        h=n-1;
        while(l<=h){
            m=(l+h)/2;
            if(arr[m]>x){
                ub=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(lb==n || arr[lb]!=x){
            return 0;
        }
       //System.out.println(lb+"=>"+ub);
        return(ub-lb);
    }
}