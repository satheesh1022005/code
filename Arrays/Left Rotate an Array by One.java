import java.util.* ;
import java.io.*; 


public class Solution {
    public static void reverse(int arr[],int n){
        int i=0,j=n;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static int[] rotateArray(int[] arr, int n) {
        reverse(arr,n-1);
        reverse(arr,n-2);
        return arr;

    }
}