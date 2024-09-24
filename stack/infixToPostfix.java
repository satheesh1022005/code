

class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static int pre(char c){
        if(c=='^') return 3;
        else if(c=='*' ||c=='/') return 2;
        else if(c=='+'|| c=='-') return 1;
        else return -1;
    }
    public static String infixToPostfix(String exp) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char c:exp.toCharArray()){
            if(Character.isLetter(c)||Character.isDigit(c)){
                ans.append(c);
            }
            else if(c=='('){
                stack.add(c);
            }
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    ans.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&pre(c)<=pre(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.add(c);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}