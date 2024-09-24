class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int preMax[]=new int[n];
        int postMax[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            preMax[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            postMax[i]=max;
        }
        int sum=0,x;
        for(int i=0;i<n;i++){
            x=Math.min(preMax[i],postMax[i]);
            sum+=(x-height[i]);
        }
        return sum;
    }
}