class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sMap[]=new int[200];
        int tMap[]=new int[200];
        char a,b;
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            a=s.charAt(i);
            b=t.charAt(i);
            if(sMap[a]!=tMap[b]){
                return false;
            }
            sMap[a]=i+1;
            tMap[b]=i+1;
        }
        return true;
    }
}