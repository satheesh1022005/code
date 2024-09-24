

// User function Template for Java

class Solution {
    static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
    static String postToPre(String post_exp) {
        Stack<String> stack=new Stack<>();
        String ele1,ele2;
        for(char c:post_exp.toCharArray()){
            if(isOperator(c)){
                ele1=stack.pop();
                ele2=stack.pop();
                stack.push(c+ele2+ele1);
            }
            else{
                stack.push(Character.toString(c));
            }
        }
        return stack.pop();
    }
}