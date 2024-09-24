

// User function Template for Java

class Solution {
    static boolean isoperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
    static String preToPost(String pre_exp) {
        Stack<String> stack=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(isoperator(c)){
                stack.add(stack.pop()+stack.pop()+c);
            }else{
                stack.add(Character.toString(c));
            }
        }
        return stack.pop();
    }
}