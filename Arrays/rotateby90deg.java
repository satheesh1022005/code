class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        /*int col=n-1;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][col]=matrix[i][j];
            }
            col--;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }*/
        /// transpose then reverse each row
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                    int t=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=t;  
            }
        }
        for(int i=0;i<m;i++){
            int x=0,y=n-1;
            while(x<y){
                int t=matrix[i][x];
                matrix[i][x]=matrix[i][y];
                matrix[i][y]=t;
                x++;
                y--;
            }
        }
    }
}