class Solution {
    public int[] findPeakGrid(int[][] mat) {
        /*int n=mat.length,m=mat[0].length;
        int t,b,l,r;
        for(int i=0;i<n;i++){
            t=-1;
            b=-1;
            l=-1;
            r=-1;
            for(int j=0;j<m;j++){
                if(i-1>=0) t=mat[i-1][j];
                if(j-1>=0) l=mat[i][j-1];
                if((i+1)<n) b=mat[i+1][j];
                if((j+1)<m) r=mat[i][j+1];
                //System.out.println(i+","+j+"=>"+t+","+l+","+","+b+","+r);
                if(mat[i][j]>t && mat[i][j]>l && mat[i][j]>b && mat[i][j]>r){
                    return new int[]{i,j};
                }
                t=-1;
                b=-1;
                l=-1;
                r=-1;
            }
        }
        return new int[]{-1,-1};*/
        int n=mat.length,m=mat[0].length;
        int l=0,h=m-1,mid,max=-1,index,left,right;
        while(l<=h){
            mid=(l+h)/2;
            max=-1;
            index=-1;
            left=-1;
            right=-1;
            // t=-1;
            // b=-1;
            for(int i=0;i<n;i++){
                if(mat[i][mid]>max){
                    max=mat[i][mid];
                    index=i;
                }
            }
            //mat[index][mid];
            if(mid-1>=0) left=mat[index][mid-1];
            if(mid+1<m) right=mat[index][mid+1];
            // if(index-1>=0) t=mat[index-1][mid];
            // if(index+1<n) b=mat[index+1][mid];
            if(mat[index][mid]>left && mat[index][mid]>right){
                return new int[]{index,mid};
            }
            if(left>mat[index][mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}