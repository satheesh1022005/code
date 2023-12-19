class Solution {
    public int removeDuplicates(int[] nums) {
        /* 1ms Approach*/ /*/ArrayList<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                al.add(max);
            }
        }
        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }
        //return al.toArray();
        return al.size();*/
        /*0ms*/
        int u=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[u]){
                u++;
                nums[u]=nums[i];
            }
        }
        return u+1;


    }
}