class Solution {
    public int maxProduct(int[] nums) {
        /*int product,max=0,n=nums.length;
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
            product=nums[i];
            for(int j=i+1;j<n;j++){
                max=Math.max(product,max);
                product*=nums[j];
                
            }
            max=Math.max(product,max);
        }
        return max;*/
        int product=1,max=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length){
            product*=nums[i];
            max=Math.max(product,max);
            if(product==0){
                product=1;   
            }i++;
            
        }
        i=nums.length-1;
        product=1;
        while(i>=0){
            product*=nums[i];
            max=Math.max(product,max); 
            if(product==0){
                product=1;
            }i--;
        }
        System.out.println(max);
        return max;

    }
}