
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max=0,sum=0,ans=-1,l,h,mid;
        
        for(int i=0;i<n;i++){
            l=0;
            h=m-1;
            while(l<=h){
                mid=(l+h)/2;
                if(arr[i][mid]>=1){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            //System.out.println(l);
            int len=m-l;
            if(len>max){
                max=len;
                ans=i;
            }
        }
        ans=max==0?-1:ans;
        return ans;
    }
}