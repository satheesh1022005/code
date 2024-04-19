class Solution {
    public int search(int[] nums, int target) {
        // int br=-1;
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         br=i+1;
        //         break;
        //     }
        // }
        // if(br==-1) br=nums.length;
        // int l=0,h=br-1,m;
        // while(l<=h){
        //     m=(l+h)/2;
        //     if(nums[m]>target){
        //         h=m-1;
        //     }else if(nums[m]<target){
        //         l=m+1;
        //     }else{
        //         return m;
        //     }
        // }
        // l=br;
        // h=nums.length-1;
        // while(l<=h){
        //     m=(l+h)/2;
        //     if(nums[m]>target){
        //         h=m-1;
        //     }else if(nums[m]<target){
        //         l=m+1;
        //     }else{
        //         return m;
        //     }
        // }
        // return -1;
        int l=0,h=nums.length-1,m;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && nums[m]>=target){
                    h=m-1;
                }else{
                    l=m+1; 
                }
            }
            else{
                if(nums[m]<=target && nums[h]>=target){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
}