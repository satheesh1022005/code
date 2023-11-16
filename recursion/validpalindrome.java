import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder m=new StringBuilder();
        char c;
        int k=0;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                if(Character.isUpperCase(c)){
                    m.append(Character.toLowerCase(c));
                }
                else{    
                m.append(c);
                }
                k++;
            }
        }
        /*if(m.length()==1){
            return false;
        }*/
        for(int i=0,o=(m.length())-1;o>=0;o--,i++){
            if(m.charAt(i)!=m.charAt(o)){
                return false;
            }
        }
        return true;
    }
}