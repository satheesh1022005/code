class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         min=Math.min(min,i);
        //         max=Math.max(max,i);
        //     }
        // }
        // if(min==Integer.MAX_VALUE) min=-1;
        // if(max==Integer.MIN_VALUE) max=-1;
        // return new int[]{min,max};
        // int l=0,h=nums.length-1,m;
        // int lb=nums.length,ub=nums.length;
        // while(l<=h){
        //     m=(l+h)/2;
        //     if(nums[m]>=target){
        //         lb=m;
        //         h=m-1;
        //     }
        //     else{
        //         l=m+1;
        //     }
        // }
        // l=0;
        // h=nums.length-1;
        // while(l<=h){
        //     m=(l+h)/2;
        //     if(nums[m]>target){
        //         ub=m;
        //         h=m-1;
        //     }else{
        //         l=m+1;
        //     }
        // }
        // if(lb==nums.length || nums[lb]!=target){
        //     return new int[]{-1,-1};
        // }
        // return new int[]{lb,ub-1};
        int l=0,h=nums.length-1,m,first=-1,last=-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target){
                first=m;
                h=m-1;
            }else if(nums[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        l=0;
        h=nums.length-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target){
                last=m;
                l=m+1;
            }else if(nums[m]>target){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return new int[]{first,last};

    }
}