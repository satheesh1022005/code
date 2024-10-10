class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*int n=s.length();
        if(n==0||n==1) return n; 
        int l=0,h=0,max=-1;
        HashSet<Character> set=new HashSet<>();
        char c;
        while(l<n && h<n){
            c=s.charAt(h);
            if(!set.contains(c)){
                set.add(c);
            }
            else{
                while(l<n&&set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(c);
            }
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;*/
        int max=0,left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                ///if(map.get(s.charAt(right))>left)
                    left=Math.max(map.get(s.charAt(right))+1,left);
            }
            max=Math.max(max,right-left+1);
            map.put(s.charAt(right),right);
        }
        return max;
    }
}