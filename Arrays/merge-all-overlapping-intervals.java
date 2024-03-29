class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int r=intervals.length;
        int c=intervals[0].length;
        int ans[][]=new int[r][c];
        int s,e,prev=0,k=0,input=0;
        ans[k][0]=intervals[0][0];
        ans[k][1]=intervals[0][1];
        for(int i=1;i<r;i++){
            s=intervals[i][0];
            e=intervals[i][1];
                if(s<=ans[k][1]){
                    int larger=Math.max(ans[k][1],e);
                    ans[k][1]=larger;
                }
                else{
                    k++;
                    ans[k][0]=s;
                    ans[k][1]=e;
                }
            
            
        }
        int merged[][]=new int[k+1][2];
        for(int i=0;i<=k;i++){
            merged[i][0]=ans[i][0];
            merged[i][1]=ans[i][1];
        }
        return merged;
    }
}