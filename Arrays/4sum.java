class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        /*Set<List<Integer>> set=new HashSet<>();
        long sum=0;int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> map=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    //System.out.println(fourth);
                    if(map.contains(fourth)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    map.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(set);*/
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        long sum;int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum<target) k++;
                    else if(sum>target) l--;
                    else{
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
            
        }
        return ans;
    }
}