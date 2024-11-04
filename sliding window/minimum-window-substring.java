class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0,cnt=0,minLen=Integer.MAX_VALUE;
        int map[]=new int[256];
        int n=s.length(),m=t.length(),startIndex=-1;
        for(char c:t.toCharArray()){
            map[c]+=1;
        }
        while(r<n){
            if(map[s.charAt(r)]>0) cnt++;
            map[s.charAt(r)]-=1;
            while(cnt==m){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    startIndex=l;
                }
                map[s.charAt(l)]+=1;
                if(map[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minLen);
    }
}