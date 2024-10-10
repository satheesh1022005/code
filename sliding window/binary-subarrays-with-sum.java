class Solution {
    public int lessThanEqualgoal(int nums[],int goal){
        if(goal<0) return 0;
        int cnt=0,sum=0,l=0,r=0,n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        /*int cnt=0,n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            sum=nums[i];
            for(int j=i+1;j<n;j++){
                if(sum==goal) cnt++;
                sum+=nums[j];
            }
            if(sum==goal) cnt++;
        }
        return cnt;*/
        /*HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,cnt=0,remove;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            remove=sum-goal;
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
        return cnt;*/
        return lessThanEqualgoal(nums,goal)-lessThanEqualgoal(nums,goal-1);

    }
}