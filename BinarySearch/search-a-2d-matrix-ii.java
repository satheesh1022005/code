class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0]<=target&&matrix[i][m-1]>=target){
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
        int r=0,c=m-1;
        while(r<n&&c>=0){
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]>target) c--;
            else r++;
        }
        return false;

    }
}