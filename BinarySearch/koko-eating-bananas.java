class Solution {
    public boolean eat(int piles[],int x,int h){
        int hourSum=0;
        //System.out.println(x+"=>");
        for(int i:piles){
            hourSum+=(int)Math.ceil((double)i/(double)x);
            //System.out.println(hourSum);
            if(hourSum>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles){
            if(max<i){
                max=i;
            }
        }
        int l=1,r=max,mid,ans=0;
        while(l<=r){
            mid=(l+r)/2;
            if(eat(piles,mid,h)){
                System.out.println(mid);
                ans=mid;
                r=mid-1;
                
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}