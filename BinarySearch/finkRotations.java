public class Solution {
    public static int findKRotation(int []arr){
        int l=0,h=arr.length-1,m,x,ans=Integer.MIN_VALUE,prev=0,index=-1;
        while(l<=h){
            m=(l+h)/2;
            if(arr[l]<=arr[m]){
                x=arr[m];
                index=m;
                ans=Math.max(ans,x);
                l=m+1;
            }else{
                x=arr[h];
                index=h;
                ans=Math.max(ans,x);
                h=m-1;
            }
            if(arr[prev]!=ans){
                    prev=index;
            }
        }
        prev+=1;
        if(prev==arr.length) prev=0;
        return prev;
    }
}