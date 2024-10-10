class Solution {
    public int characterReplacement(String s, int k) {
        int map[]=new int[26];
        int maxLen=0,left=0,right=0,n=s.length(),maxFreq=0;
        char c;
        while(right<n){
            c=s.charAt(right);
            map[c-65]+=1;
            maxFreq=Math.max(maxFreq,map[c-65]);
            if(left<n&&(right-left+1)-maxFreq>k){
                map[s.charAt(left)-65]-=1;
                maxFreq=0;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}