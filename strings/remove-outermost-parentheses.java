class Solution {
    public String removeOuterParentheses(String str) {
        int cnt=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                cnt--;
            }
            if(cnt!=0){
                ans.append(str.charAt(i));
            }
            if(str.charAt(i)=='(') {
                cnt++;
            } 
        }
        return ans.toString();
    }
}