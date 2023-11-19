import java.util.*;

public class Solution {
    public static int[] getFrequencies(int []v) {
        Arrays.sort(v);
        int re[]=new int[2];
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<v.length;i++){
            c=0;
            if(map.containsKey(v[i])){
                c=map.get(v[i]);
            }
            map.put(v[i],c+1);
        }
        int a = v[v.length - 1], b = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > b) {
                b = entry.getValue();
                a = entry.getKey();
            }
            else if(entry.getValue()==b){
                if(entry.getKey()<a){
                    a=entry.getKey();
                }
            }
        }
        int x=a,y=b;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < y) {
                y = entry.getValue();
               x = entry.getKey();
            }
            else if(entry.getValue()==y){
                if(entry.getKey()<x){
                    x=entry.getKey();
                }
            }
        }
        //x=2;
        re[0]=a;
        re[1]=x;
        return re;
    }
}