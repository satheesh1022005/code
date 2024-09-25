class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder str=new StringBuilder();
        if(num.length()==k) return "0";
        for(char c:num.toCharArray()){
            while(!stack.isEmpty()&&stack.peek()>(c-'0')&&k!=0){
                stack.pop();
                k--;
            }
            stack.add(c-'0');
        }
        while(k!=0){
            stack.pop();
            k--;
        }
        while(!stack.isEmpty()){
            str.append((char)(stack.peek()+'0'));
            stack.pop();
        }
        int i=str.length()-1;
        while(i>=0&&str.charAt(i)=='0'){
            i--;
        }
        if(str.substring(0,i+1).equals("")) return "0";
        return  new StringBuilder(str.substring(0,i+1)).reverse().toString();
    }
}