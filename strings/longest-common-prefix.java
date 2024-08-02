class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x=new String(strs[0]);
        String y=strs[strs.length-1];
        int i=0;
        while(i<x.length() && i<y.length()){
            if(x.charAt(i)!=y.charAt(i)){
                break;
            }
            i++;
        }
        return x.substring(0,i);
    }
}