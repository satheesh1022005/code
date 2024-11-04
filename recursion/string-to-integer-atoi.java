class Solution {
    public int myAtoi(String s) {
        /*int negativeSign=0,positiveSign=0;
        int numbercount=0;
        StringBuilder ans=new StringBuilder();
        s=s.trim();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                numbercount++;
                ans.append(c);
            }
            else if(c!='-'&&c!='+'&&Character.isLetter(c)&&numbercount!=0){
                break;
            }
            else if(c=='-'&&numbercount==0){
                negativeSign++;
            }
            else if(c=='+'&&numbercount==0){
                positiveSign++;
            }
            else{
                break;
            }
        }
        boolean sign=true;
        if(positiveSign>1 || negativeSign>1 || (positiveSign+negativeSign)>=2) return 0;
        else if(negativeSign>0) sign=false;
        //System.out.println(negativeSign+","+positiveSign);
        long number=0;
        long place=1;
        String answer=ans.toString();
        answer=answer.replaceFirst("^0+","");
        if(answer.length()>10){
            if(sign){
                return 2147483647;
            }
            else{
                return -2147483648;
            }
        }
        for(int i=answer.length()-1;i>=0;i--){
            number+=(answer.charAt(i)-'0')*place;
            place*=10;
        }
        //System.out.println(number+","+sign);
        if(number>=2147483647 && sign) return 2147483647;
        if(number>2147483647 && !sign) return -2147483648;
        if(!sign) return (int)number*-1;
        return (int)number;*/
        s=s.strip();
        if(s.length()==0) return 0;
        final int sign=s.charAt(0)=='-'?-1:1;
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            s=s.substring(1);
        }
        int startIndex=0;
        int endIndex=0;
        long ans=0;
        ans=find(s,startIndex,endIndex,ans,sign);
        if(ans<=Integer.MIN_VALUE) return sign*(int)ans;
        if(ans>=Integer.MAX_VALUE) return sign*(int)ans;
        return sign*(int)ans;
    }
    public long find(String s,int startIndex,int endIndex,long ans,int sign){
        if(endIndex==s.length()||s.charAt(endIndex)-'0'>9) return ans;
        int startDigit=s.charAt(startIndex)-'0';
        if(startDigit<0&&startDigit>9) return find(s,startIndex+1,endIndex+1,ans,sign);
        int endDigit=s.charAt(endIndex)-'0';
        if(endDigit>=0&&endDigit<=9) {
            ans=ans*10;
            ans+=endDigit;
            if(sign*ans<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*ans>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return find(s,startIndex,endIndex+1,ans,sign);
        }
        return ans;
    }
}