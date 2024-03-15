import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*Set<List<Integer>> ans=new HashSet<>();
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(ans);*/
        /*Set<List<Integer>> ans=new HashSet<>();
        
        int n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                sum=-(nums[i]+nums[j]);
                if(map.containsKey(sum)){
                    if(map.get(sum)!=i&&map.get(sum)!=j){
                    List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(sum);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
                map.put(nums[j],j);
            }
        }
        return new ArrayList<>(ans);*/
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0,n=nums.length;
        int i=0,j=1,k=n-1;
        while(i<n){
            j=i+1;
            k=n-1;
            if(i!=0 && nums[i]==nums[i-1]) {
                i++;
                continue;
            }
            while(j<k&&j<n&&k<n){
                sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else if(sum==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    j++;
                    k--;
                    ans.add(temp);
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
            i++;
        }
        return ans;
    }
}