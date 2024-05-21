class Solution
{
    public int NthRoot(int n, int m)
    {
        int l=0,h=m,mid,pro;
        while(l<=h){
            mid=(l+h)/2;
            pro=(int)Math.pow(mid,n);
            if(pro==m) return mid;
            else if(pro<m){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}