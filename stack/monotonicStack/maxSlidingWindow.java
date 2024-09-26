class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length,index=0;
        int ans[]=new int[n-k+1];
        Deque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!queue.isEmpty()&&queue.peek()<=i-k){
                queue.poll();
            }
            while(!queue.isEmpty()&&nums[queue.peekLast()]<nums[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i>=k-1){
                ans[index++]=nums[queue.peek()];
            }
        }
        return ans;
    }
}