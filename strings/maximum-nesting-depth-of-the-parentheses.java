class Solution {
    public int maxDepth(String s) {
        int currentValue=0,cnt=0,max=0;
        for(char c:s.toCharArray()){
            if(c=='(') currentValue++;
            else if(c==')') currentValue--;
            max=Math.max(max,currentValue);
        }
        return max;
    }
}