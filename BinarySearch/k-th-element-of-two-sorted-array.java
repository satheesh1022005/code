
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
       /* int i=0,j=0,cnt=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(cnt==k-1) return arr1[i];
                cnt++;
                i++;
            }
            else{
                if(cnt==k-1) return arr2[j];
                cnt++;
                j++;
            }
        }
        while(i<n){
            if(cnt==k-1) return arr1[i];
            cnt++;
            i++;
        }
        while(j<m){
            if(cnt==k-1) return arr2[j];
            cnt++;
            j++;
        }
        return -1;*/
        if(n>m) return kthElement(arr2,arr1,m,n,k);
        int tn=n+m,left=k;
        int l=Math.max(0,k-m),h=Math.min(k,n);
        int l1,l2,r1,r2,mid1,mid2;
        while(l<=h){
            mid1=(l+h)/2;
            mid2=left-mid1;
            l1=Integer.MIN_VALUE;
            l2=Integer.MIN_VALUE;
            r1=Integer.MAX_VALUE;
            r2=Integer.MAX_VALUE;
            if(mid1<n) r1=arr1[mid1];
            if(mid2<m) r2=arr2[mid2];
            if(mid1-1 >=0) l1=arr1[mid1-1];
            if(mid2-1 >=0) l2=arr2[mid2-1];
            if(l1<=r2 && l2<=r1) return Math.max(l1,l2);
            else if(l1>r2) h=mid1-1;
            else l=mid1+1;
        }
        return -1;
        
    }
}