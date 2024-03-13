class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
        /*HashMap<Integer,Integer> map=new HashMap<>();
        int min=(nums.length/3)+1,count;
        for(int i:nums){
            if(map.containsKey(i)){
                count=map.get(i);
                map.put(i,count+1);
            }
            else{
                map.put(i,1);
            }
            if(map.get(i)==min){
                li.add(i);
            }
        }
        return li;*/
        int cnt1=0,cnt2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i:nums){
            if(cnt1==0 && i!=ele2){
                cnt1=1;
                ele1=i;
            }
            else if(cnt2==0 && i!=ele1){
                cnt2=1;
                ele2=i;
            }
            else if(i==ele1){
                cnt1++;
            }
            else if(i==ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i:nums){
            if(i==ele1){
                cnt1++;
            }
            else if(i==ele2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3){
            li.add(ele1);
        }
        if(cnt2>nums.length/3){
            li.add(ele2);
        }
        return li;
    }
}