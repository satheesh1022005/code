class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // ArrayList<Integer> al=new ArrayList<>();
        // for(int i:nums){
        //     if(map.containsKey(i)){
        //         map.put(i,map.get(i)+1);
        //     }
        //     else{
        //         map.put(i,1);
        //         al.add(i);
        //     }
        // }
        // int k=0;
        // int index=0;
        // for(int i:al){
        //     int x=map.get(i);
        //     if(x>=2){
        //         nums[index++]=i;
        //         nums[index++]=i;
        //         k+=2;
        //     }
        //     else{
        //         nums[index++]=i;
        //         k+=1;
        //     }
        // }
        // return k;
        int i=0;
        for(int x:nums){
            if(i==0 || i==1 || nums[i-2]!=x){
                nums[i]=x;
                i++;
            }
        }
        return i;
    }
}