public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        //int arr[]=new int[n];
        rec(0,n-1,nums);
        return nums;
    }
    public static void rec(int i,int n,int nums[]){
        if(i>n){
            return ;
        }
        int t=nums[i];
        nums[i]=nums[n];
        nums[n]=t;
        rec(i+1,n-1,nums);


    }
}