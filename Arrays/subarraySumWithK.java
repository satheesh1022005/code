class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,cnt=0,remove;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            remove=sum-k;
            if(map.containsKey(remove)){
                cnt+=map.get(remove);
            }
            if(map.containsKey(sum)){
                map.put(sum,(map.get(sum))+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return cnt;
    }
}