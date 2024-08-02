class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*int n=matrix.length,m=matrix[0].length;
        int row,l=0,h=n-1,mid;
        while(l<=h){
            mid=(l+h)/2;
            if(matrix[mid][0]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(l+","+h);
        if(h<0||h>=n) return false;
        row=h;
        l=0;
        h=m-1;
        while(l<=h){
            mid=(l+h)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;*/
        /*int n=matrix.length,m=matrix[0].length;
       
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target&&matrix[i][m-1]>=target){
                System.out.println(m);
                int l=0,h=m-1,mid;
                while(l<=h){
                    mid=(l+h)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) h=mid-1;
                    else l=mid+1;
                }
            }
        }
        return false;*/
        int n=matrix.length,m=matrix[0].length;
        int l=0,h=(n*m)-1,mid,r,c;
        while(l<=h){
            mid=(l+h)/2;
            r=mid/m;
            c=mid%m;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
        
    }
}