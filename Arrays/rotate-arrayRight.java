import java.util.ArrayList;

public class Solution {
    public static void reverse(ArrayList<Integer> arr,int i,int j){
        while(i<j){
            int x=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,x);
            i++;
            j--;
        }
    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
            if(arr.size()<k) k=k%arr.size();
            reverse(arr,0,k-1);
            reverse(arr,k,arr.size()-1);
            reverse(arr,0,arr.size()-1);
            return arr;
    }
}