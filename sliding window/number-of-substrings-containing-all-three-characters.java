class Solution {
    public int numberOfSubstrings(String s) {
        long cnt=0;
        int aCnt=0,bCnt=0,cCnt=0;
        int l=0,r=0,n=s.length();
        while(r<n){
            if(s.charAt(r)=='a') aCnt++;
            else if(s.charAt(r)=='b') bCnt++;
            else cCnt++;
            while(l<n&&aCnt>=1&&bCnt>=1&&cCnt>=1){
                if(s.charAt(l)=='a') aCnt--;
                else if(s.charAt(l)=='b') bCnt--;
                else cCnt--;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        long totSubArray=((long)n*(n+1))/2;
        return (int)(totSubArray-cnt);
    }
}