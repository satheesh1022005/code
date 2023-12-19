import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> al,int n) {
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<al.size();i++){
				int c=0;
				if(map.containsKey(al.get(i))){
					c=map.get(al.get(i));
				}
				map.put(al.get(i),c+1);
			}
			return map.size();
	}
}