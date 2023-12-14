public class Solution {
    public static void insertionSort(int[] arr, int size) {
        /*for(int i=0;i<size;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp=a[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }*/
        
        if(size==0){
            return ;
        }
        int j=arr.length-size;
        while(j>0&&arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertionSort(arr, size-1);
        
    }
}