class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int l=0,h=n-1,sum=0,max=0;
        while(l<k){
            sum+=cardPoints[l];
            l++;
        }
        l--;
        while(l>=0){
            max=Math.max(max,sum);
            sum-=cardPoints[l];
            sum+=cardPoints[h];
            l--;
            h--;
        }
        max=Math.max(max,sum);
        return max;

    }
}