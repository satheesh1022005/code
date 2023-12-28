class Solution {
    public int missingNumber(int[] nums) {
        int sum=(nums.length*(nums.length+1))/2;
        int ActualSum=0;
        for(int i=0;i<nums.length;i++){
            ActualSum+=nums[i];
        }
        return sum-ActualSum;

    }
}