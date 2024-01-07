import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
       int a=0,b=0,c=0,x;
       for(int i=0;i<n;i++){
           if(arr.get(i)==0){
               a++;
           }
           else if(arr.get(i)==1){
               b++;
           }
           else{
               c++;
           }
       }
       for(int i=0;i<a;i++){
           arr.set(i,0);
       }
       for(int i=a;i<a+b;i++){
           arr.set(i,1);
       }
       for(int i=a+b;i<n;i++){
           arr.set(i,2);
       }

    }
}


/*Optimal approach O(n)*/
class Solution {
    public void sortColors(int[] nums) {
        int l=0,h=nums.length-1,m=0,t;
        while(m<=h){
            if(nums[m]==0){
                t=nums[l];
                nums[l]=nums[m];
                nums[m]=t;
                l++;
                m++;
            }
            else if(nums[m]==2){
                t=nums[h];
                nums[h]=nums[m];
                nums[m]=t;
                h--; 
            }
            else{
                m++;
            }
        }
    }
}