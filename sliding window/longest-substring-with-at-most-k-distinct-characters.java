class Solution {
    public int longestkSubstr(String s, int k) {
        int l=0,r=0,n=s.length(),cnt=0,max=-1;
        int map[]=new int[26];
        char c;
        while(r<n){
            c=s.charAt(r);
            if(map[c-97]==0) cnt++;
            map[c-97]+=1;
            if(cnt>k){
                    map[s.charAt(l)-97]-=1;
                    if(map[s.charAt(l)-97]==0){
                        cnt--;
                    }
                    l++;
            }
            if(cnt==k)
                max=Math.max(max,r-l+1);
            r++;
        }
        if(max==0) max=-1;
        return max;
        /*HashMap<Character,Integer> map=new HashMap<>();
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            if(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
            }
            if(map.size()==k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;*/
        
    }
}