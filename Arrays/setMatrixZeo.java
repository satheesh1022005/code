class Solution {
    public void setColumn(int[][] matrix,int x,int y){
        int column=matrix.length;
        for(int i=0;i<column;i++){
            matrix[i][y]=0;
        }
    }
    public void setRow(int[][] matrix,int x,int y){
        int row=matrix[0].length;
        for(int i=0;i<row;i++){
            matrix[y][i]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int size=matrix.length*matrix[0].length;
        if(size==1) return ;
        int zeroVal[][]=new int[2][size];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zeroVal[0][k]=i;
                    zeroVal[1][k]=j;
                    k++;
                }
            }
        }
        for(int i=0;i<k;i++){
            setColumn(matrix,0,zeroVal[1][i]);
            setRow(matrix,0,zeroVal[0][i]);
        }
           
    }
}