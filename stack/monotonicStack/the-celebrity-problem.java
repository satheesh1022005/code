class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
       int n=mat.length,m=mat[0].length;
       /*in 
       for(int i=0;i<n;i++){
           flag=0;
           for(int j=0;j<m;j++){
               if(i!=j&&mark[i][j]==0) {
                   flag=1;
                   break;
               }
           }
           if(flag==0) index=i;
       }
       if(index==-1) return -1;
       for(int i=0;i<n;i++){
           if(mark[i][index]==1){
               index=-1;
               break;
           }
       }
       return index;*/
       /*int knowMe[]=new int[n];
       int iKnow[]=new int[n];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(mat[i][j]==1){
                   iKnow[i]+=1;
                   knowMe[j]+=1;
               }
           }
       }
       for(int i=0;i<n;i++){
           if(knowMe[i]==n-1&&iKnow[i]==0) return i;
       }
       return -1;*/
       int top=0,bottom=n-1;
       while(top<bottom){
           if(mat[top][bottom]==1){
               top++;
           }
           else if(mat[bottom][top]==1){
               bottom--;
           }
           else{
               top++;
               bottom--;
           }
       }
       if(top>bottom) return -1;
       int index=top;
       for(int i=0;i<n;i++){
           if(mat[index][i]==1) return -1;
           if(i!=index&&mat[i][index]==0) return -1;
       }
       return index;
    }
}