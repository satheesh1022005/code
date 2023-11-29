class Solution {
    
    Map<Integer, List<Integer>> map;
    Random rand;
    
    public Solution(int[] nums) {
        map = new HashMap<>();
        rand = new Random();
        List<Integer> list;
        for(int i=0;i<nums.length;i++){
            list = map.getOrDefault(nums[i], new ArrayList<Integer>());
            list.add(i);
            map.put(nums[i], list);
        }
    }
    
    public int pick(int target) {
        List<Integer> list = map.get(target);
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */