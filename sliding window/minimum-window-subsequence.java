class Solution {
    static String minWindow(String str1, String str2) {
        int l=0,r=0,minLen=Integer.MAX_VALUE,stIndex=-1,p=0;
        int n=str1.length(),m=str2.length();
        while(r<n&&p<m){
            if(str1.charAt(r)==str2.charAt(p)){
                p++;
            }
            if(p==m){
                l=r;
                p--;
                while(l>=0&&p>=0){
                    if(str1.charAt(l)==str2.charAt(p)){
                        p--;
                    }
                    l--;
                }
                l++;
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    stIndex=l;
                }
                p=0;
                r=l+1;
            }
            r++;
        }
        return stIndex==-1?"":str1.substring(stIndex,stIndex+minLen);
        
        
    }
}