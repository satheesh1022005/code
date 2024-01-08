class Solution {
    public int majorityElement(int[] nums) {
        int el=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el=nums[i];
                count=1;
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }
}