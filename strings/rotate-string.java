class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length()!=goal.length()){
        return false;
       }
       int sum1=0,sum2=0;
       for(int i=0;i<s.length();i++){
            sum1+=s.charAt(i);
            sum2+=goal.charAt(i);
       }
       if(sum1!=sum2) return false;
       int wrong=1;
       String sub;
       int start=0;
       for(int i=0;i<s.length();i++){
            sub=s.substring(start,i+1);
            if(!goal.contains(sub)){ 
                wrong++;
                start=i;
            }
            if(wrong>2) return false;
       }
       return true;
    }
}