class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(prices[i]-min,max);
        }
        return max;
    }
}