class Solution {
    public boolean isAnagram(String s, String t) {
        /*HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
            else{
                map.put(t.charAt(i),-1);
            }
        }
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()!=0){
                return false;
            }
        }
        return true;*/
        int map[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-97]+=1;
            map[t.charAt(i)-97]-=1;
        }
        for(int i=0;i<26;i++){
            if(map[i]!=0) return false;
        }
        return true;
    }
}