
class Solution {
    int lessCnt(int matrix[][],int n,int m,int x){
        int cnt=0,l,h,mid;
        for(int i=0;i<n;i++){
            /*for(int j=0;j<m;j++){
                if(matrix[i][j]<=x) cnt++;
            }*/
            l=0;
            h=m-1;
            while(l<=h){
                mid=(l+h)/2;
                if(matrix[i][mid]<=x){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            cnt+=l;
        }
        return cnt;
    }
    int median(int matrix[][], int n, int m) {
        int min=Integer.MAX_VALUE,max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(matrix[i][m-1],max);
            min=Math.min(matrix[i][0],min);
        }
        int l=min,h=max,mid,cnt,sep=(n*m)/2;
        while(l<=h){
            mid=(l+h)/2;
            cnt=lessCnt(matrix,n,m,mid);
            if(cnt>sep){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}