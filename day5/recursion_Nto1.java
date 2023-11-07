public class Solution
{
    public static int[] printNos(int x) {
       int arr[]=new int[x];
        rec(arr,x,0);
       return arr;

    }
    public static void rec(int arr[],int n,int i){
        if(n==0){
            return;
        }
        arr[i]=n;
        rec(arr,n-1,i+1);

    }
}