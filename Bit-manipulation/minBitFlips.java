class Solution {
    public int minBitFlips(int start, int goal) {
        /*String a=Integer.toBinaryString(start);
        String b=Integer.toBinaryString(goal);
        //System.out.println(a+","+b);
        int diff=0;
        int n=Math.min(a.length(),b.length());
        diff=Math.max(a.length(),b.length())-n;
        //System.out.println(diff+","+n);
        int i=0,j=diff,zero=0;
        String s1,s2;
        if(a.length()>b.length()) {
            s1=a;
            s2=b;
        }
        else{
            s1=b;
            s2=a;
        }
        for(int k=0;k<j;k++){
            if(s1.charAt(k)=='0') zero++;
        }
        while(i<n){
            //System.out.println(s1.charAt(j)+"=="+s2.charAt(i));
            if(s1.charAt(j)!=s2.charAt(i)) diff++;
            i++;
            j++;
        }
        return diff-zero;*/
        /*int x,y,cnt=0;
        while(start!=0||goal!=0){
            x=start&1;
            y=goal&1;
            cnt+=(x^y);
            start=start>>1;
            goal=goal>>1;
        }
        return cnt;*/
        int diff=start^goal;
        int cnt=0;
        while(diff>0){
            cnt+=(diff&1);
            diff=diff>>1;
        }
        return cnt;

    }
}