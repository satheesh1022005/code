import java.util.ArrayList;
public class Solution {
    public static int check(ArrayList<Integer> arr,int i){
            int allocated=1;
            int curr=0;
            for(int j=0;j<arr.size();j++){
               if(curr+arr.get(j)<=i){
                   curr+=arr.get(j);
               }
               else{
                   allocated++;
                   curr=arr.get(j);
               }
            }
            return allocated;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int max=0,sum=0,allocated=0,curr=0,ans=-1;
        if(m>n) return -1;
        for(int i:arr){
            sum+=i;
            max=Math.max(max,i);
        }
        int l=max,h=sum,mid,al;
        while(l<=h){
            mid=(l+h)/2;
            al=check(arr, mid);
            if(al<=m){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}