

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
    static String postToInfix(String exp) {
        Stack<String> stack=new Stack<>();
        for(char c:exp.toCharArray()){
            if(isoperator(c)){
                String op1=stack.pop();
                String op2=stack.pop();
                stack.add("("+op2+c+op1+")");
            }else{
                stack.add(Character.toString(c));
            }
        }
        return stack.pop();
    }
}