class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        int val=1;
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            val=1;
            for(int j=1;j<i;j++){
                val=val*(i-j);
                val/=j;
                temp.add(val);
            }
            ans.add(temp);
        }
        return ans;
    }
}