class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length,index=0,val;
        for(int i=0;i<(1<<n);i++){
            index=0;
            val=i;
            List<Integer> temp=new ArrayList<>();
            while(val>0){
                if((val&1)==1){
                    temp.add(nums[index]);
                }
                val=val>>1;
                index++;
            }
            ans.add(temp);
        }
        return ans;
    }
}