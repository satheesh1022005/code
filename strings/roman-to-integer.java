class Solution {
    public int romanToInt(String s) {
        int i=0,n=s.length(),sum=0;
        char c;
        while(i<n){
            c=s.charAt(i);
            if(c=='I')
            {
                if(i+1<n){
                    if(s.charAt(i+1)=='V'){
                        sum+=4;
                        i+=2;
                    }
                    else if(s.charAt(i+1)=='X'){
                        sum+=9;
                        i+=2;
                    }
                    else{
                        sum+=1;
                        i++;
                    }
                }
                else{
                    sum+=1;
                    i++;
                }
            }
            else if(c=='X'){
                if(i+1<n){
                    if(s.charAt(i+1)=='L'){
                        sum+=40;
                        i+=2;
                    }
                    else if(s.charAt(i+1)=='C'){
                        sum+=90;
                        i+=2;
                    }
                    else{
                        sum+=10;
                        i++;
                    }
                }
                else{
                    sum+=10;
                    i++;
                }
            }
            else if(c=='C'){
                if(i+1<n){
                    if(s.charAt(i+1)=='D'){
                        sum+=400;
                        i+=2;
                    }
                    else if(s.charAt(i+1)=='M'){
                        sum+=900;
                        i+=2;
                    }
                    else{
                        sum+=100;
                        i++;
                    }
                }
                else{
                    sum+=100;
                    i++;
                }
            }
            else{
                if(c=='V') sum+=5;
                else if(c=='L') sum+=50;
                else if(c=='D') sum+=500;
                else if(c=='M') sum+=1000;
                i++;
            }
        }
        return sum;
    }
}