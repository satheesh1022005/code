class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        //int max=-1;
        int ans[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            //max=-1;
            while(!stack.isEmpty()&&stack.peek()<nums2[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) map.put(nums2[i],stack.peek());
            else map.put(nums2[i],-1);
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}