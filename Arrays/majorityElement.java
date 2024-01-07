import java.util.HashMap;

public class Solution {
    public static int majorityElement(int []v) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,val=0,c;
        for(int i=0;i<v.length;i++){
            if(map.containsKey(v[i])){
                c=map.get(v[i]);
                map.put(v[i],c+1);
            }
            else{
            map.put(v[i],1);
            }
            if(max<map.get(v[i])){
                max=map.get(v[i]);
                val=v[i];
            }
        }
        return val;
        //for(Map.entry)
    }
}